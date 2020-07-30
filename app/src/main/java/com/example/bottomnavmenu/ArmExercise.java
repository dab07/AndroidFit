package com.example.bottomnavmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.bottomnavmenu.Adapters.CardAdapterForSuggestion;
import com.example.bottomnavmenu.SupportClasses.SuggestionStructure;

import java.io.IOException;
import java.util.List;

public class ArmExercise extends AppCompatActivity {
    RecyclerView recyclerView;
    List<SuggestionStructure> cardList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_excercise);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        try {
            cardList = SuggestionFetcher.fetch(this ,getAssets().open("armExercise.txt"));
        } catch (IOException e) {
            //todo: remove below line
            Toast.makeText(this , "Somebody has messed with the app folder. The file containing suggestions has gone missing" , Toast.LENGTH_LONG).show();
            return;
        }

        recyclerView.setAdapter(new CardAdapterForSuggestion(this , cardList));

    }
}

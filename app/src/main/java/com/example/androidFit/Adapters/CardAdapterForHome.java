package com.example.androidFit.Adapters;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.androidFit.DatabaseHandlers.UserStatsDBHandler;
import com.example.androidFit.Model.Card;
import com.example.androidFit.R;
/*
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;*/



import java.util.List;

public class CardAdapterForHome extends RecyclerView.Adapter<CardAdapterForHome.CardViewHolder> {

    private Context context;
    private List<Card> list;
    private UserStatsDBHandler DbHandler;


    public CardAdapterForHome(Context context, List<Card> list) {
        this.context = context;
        this.list = list;
        this.DbHandler = new UserStatsDBHandler(context);
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_layout , null , false);
        view.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT , FrameLayout.LayoutParams.WRAP_CONTENT));
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i) {

//        Card card = list.get(i);
//        cardViewHolder.textView.setText(card.getName());
//        cardViewHolder.imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.app_icon_round));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CardViewHolder extends  RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);




        }




    }
}

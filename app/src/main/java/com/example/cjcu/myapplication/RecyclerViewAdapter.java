package com.example.cjcu.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter{

    private LayoutInflater inflater;
    private ArrayList<String> numberData;
    public RecyclerViewAdapter(Context mContext,ArrayList<String>data){
        inflater = LayoutInflater.from(mContext);
        numberData = data;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.save_information,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ItemHolder)holder).textView_data.setText(position+1+". "+numberData.get(position));
    }

    @Override
    public int getItemCount() {
        return numberData.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder{

        TextView textView_data;
        public ItemHolder(View itemView){
            super(itemView);
            textView_data = itemView.findViewById(R.id.textView_data);
        }
    }

}

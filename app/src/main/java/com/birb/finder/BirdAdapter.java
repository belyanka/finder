package com.birb.finder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class BirdAdapter extends RecyclerView.Adapter<BirdAdapter.MyViewHolder>{

    private List<Bird> birds;

    public BirdAdapter(List<Bird> birds){
        this.birds=birds;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bird_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Bird bird = birds.get(position);
        holder.sender.setText(bird.getName());
        holder.theme.setText(bird.getLatinName());
        holder.date.setText(bird.getSex());
    }

    @Override
    public int getItemCount() {
        return birds.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView sender, date, theme;

        public MyViewHolder(View view) {
            super(view);
            sender = (TextView) view.findViewById(R.id.sender);
            theme = (TextView) view.findViewById(R.id.theme);
            date = (TextView) view.findViewById(R.id.date);
        }
    }

}

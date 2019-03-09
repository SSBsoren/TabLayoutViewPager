package com.sagensoren.tablayoutviewpager;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerViewAdapter extends RecyclerView.Adapter<TextItemViewHolder> {

    String[]  item;

    public RecyclerViewAdapter(String[] item){
        this.item = item;
    }
    @NonNull
    @Override
    public TextItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_list,viewGroup,false);
        return new TextItemViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull TextItemViewHolder textItemViewHolder, int i) {

        textItemViewHolder.bind(item[i]);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return item.length;
    }
}

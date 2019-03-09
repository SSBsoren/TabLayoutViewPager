package com.sagensoren.tablayoutviewpager;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class TextItemViewHolder extends RecyclerView.ViewHolder  {

    private TextView textView;

    public TextItemViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.list_item);

    }
    public void bind(String text){
        textView.setText(text);
    }

}

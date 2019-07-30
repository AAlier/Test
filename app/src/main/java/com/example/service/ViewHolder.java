package com.example.service;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ViewHolder extends BaseViewHolder<String> {
    private ImageView imageView;

    public ViewHolder(@NonNull final View itemView, final Listener listener) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onImageClicked((String) itemView.getTag());
            }
        });
    }

    @Override
    void bind(String data) {
        Glide.with(imageView)
                .load(data)
                .into(imageView);
        itemView.setTag(data);
    }

    @Override
    void unbind() {
        Glide.with(imageView).clear(imageView);
    }
}

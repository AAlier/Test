package com.example.service;

import android.view.View;

public class Adapter extends BaseRecyclerAdapter<ViewHolder, String> {
    private Listener listener;

    public Adapter(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.item_child_view;
    }

    @Override
    protected ViewHolder getViewHolder(View view) {
        return new ViewHolder(view, listener);
    }
}

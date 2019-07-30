package com.example.service;

import android.view.View;

public class ChildAdapter extends BaseRecyclerAdapter<ChildViewHolder, String> {
    @Override
    protected int getLayoutResource() {
        return R.layout.item_child_view;
    }

    @Override
    protected ChildViewHolder getViewHolder(View view) {
        return new ChildViewHolder(view);
    }
}

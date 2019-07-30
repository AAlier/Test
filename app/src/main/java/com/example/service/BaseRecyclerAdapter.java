package com.example.service;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRecyclerAdapter<V extends BaseViewHolder, T> extends RecyclerView.Adapter<V> {
    private List<T> data = new ArrayList<>();

    @NonNull
    @Override
    public V onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(getLayoutResource(), viewGroup, false);
        return getViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull V holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void update(List<T> list){
        this.data = list;
        notifyDataSetChanged();
    }

    @LayoutRes
    protected abstract int getLayoutResource();

    protected abstract V getViewHolder(View view);
}

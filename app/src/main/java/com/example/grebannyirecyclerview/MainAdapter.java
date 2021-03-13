package com.example.grebannyirecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(Storage.shared.list.get(position));
    }

    @Override
    public int getItemCount() {
        return Storage.shared.list.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView number;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.input_name);
            number = itemView.findViewById(R.id.input_number);
        }

        public void onBind(ItemModel data) {
            name.setText(data.getName2());
            number.setText(data.getPhoneNumber());

        }
    }
}

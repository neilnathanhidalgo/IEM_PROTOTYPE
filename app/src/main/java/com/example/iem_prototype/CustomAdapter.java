package com.example.iem_prototype;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<Item> items;

    public CustomAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new ViewHolder(view);
    }

    private int fondo = -1;

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = items.get(position);

        holder.txtName.setText(item.getName());
        holder.txtPrice.setText(item.getPrice());
        holder.imgPedir.setImageResource(item.getIconResource());

        /*
        if (items.size() == 6) {
            if (position == 0) {
                holder.itemView.setBackgroundResource(R.drawable.gray_background);
            } else {
                if (position == 3) {
                    holder.itemView.setBackgroundResource(R.drawable.gray_background);
                } else {
                    holder.itemView.setBackgroundResource(R.drawable.transparent_background);
                }
            }
        } else {
            if (items.size() == 11) {
                if (position == 0) {
                    holder.itemView.setBackgroundResource(R.drawable.gray_background);
                } else {
                    if (position == 2) {
                        holder.itemView.setBackgroundResource(R.drawable.gray_background);
                    } else {
                        if (position == 6) {
                            holder.itemView.setBackgroundResource(R.drawable.gray_background);
                        } else {
                            if (position == 8) {
                                holder.itemView.setBackgroundResource(R.drawable.gray_background);
                            } else {
                                holder.itemView.setBackgroundResource(R.drawable.transparent_background);
                            }
                        }
                    }
                }
            }
        }

         */

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtName;
        public TextView txtPrice;
        public ImageView imgPedir;

        public ViewHolder(View view) {
            super(view);
            txtName = view.findViewById(R.id.txt_name);
            txtPrice = view.findViewById(R.id.txt_price);
            imgPedir = view.findViewById(R.id.img_pedir);
        }
    }
}

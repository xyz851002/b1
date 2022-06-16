package com.example.exam4a890120;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {
    private Context mContext;
    private String[] text;
    private int[] imgIds;

    public Myadapter(Context mContext, String[] text, int[] imgIds) {
        this.mContext = mContext;
        this.text = text;
        this.imgIds = imgIds;
    }

    @NonNull
    @Override
    public Myadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        View itemView=layoutInflater.inflate(R.layout.layout0,parent,false);

        MyViewHolder holder=new MyViewHolder(itemView);
        holder.textView=itemView.findViewById(R.id.textView);
        holder.img1=itemView.findViewById(R.id.img1);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 v = LayoutInflater.from(mContext).inflate(R.layout.layout0,null);

                TextView textView = v.findViewById(R.id.textView);
                ImageView imageView = v.findViewById(R.id.img1);

                textView.setText(text[holder.getAdapterPosition()]);
                imageView.setImageResource(imgIds[holder.getAdapterPosition()]);

                new AlertDialog.Builder(mContext)
                        .setTitle("風景資訊")
                        .setView(v)
                        .setPositiveButton("確定",null)
                        .show();
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.MyViewHolder holder, int position) {
            holder.textView.setText(text[position]);
            holder.img1.setImageResource(imgIds[position]);
    }

    @Override
    public int getItemCount() {
        return imgIds.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView img1;
        public TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

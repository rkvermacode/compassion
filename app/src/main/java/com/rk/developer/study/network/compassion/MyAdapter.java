package com.rk.developer.study.network.compassion;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {

    List<Models> models;

    public MyAdapter(List<Models> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        int resource = models.get(position).getImageView();
        String topText = models.get(position).getTopText();
        String bottomText = models.get(position).getBottomText();
        String subText = models.get(position).getSubText();
        String bottomSubText = models.get(position).getBootomSubText();


        holder.setdata(resource,topText,bottomText,subText,bottomSubText);

//        final int[] backgroundColor = {
//
//                R.color.color1
//        }

        if (position==0){
            holder.topText.setBackgroundColor(Color.parseColor("#f39c12"));
            holder.bottomText.setBackgroundColor(Color.parseColor("#f39c12"));

        }
        else if (position==1){
            holder.topText.setBackgroundColor(Color.parseColor("#27ae60"));
            holder.subText.setBackgroundColor(Color.parseColor("#27ae60"));
            holder.bottomText.setBackgroundColor(Color.parseColor("#16a085"));
            holder.subText.setVisibility(View.VISIBLE);
            holder.imageView.setVisibility(View.GONE);

        }
        else if (position==2){
            holder.topText.setBackgroundColor(Color.parseColor("#95a5a6"));
            holder.bottomText.setBackgroundColor(Color.parseColor("#95a5a6"));
            holder.imageView.setVisibility(View.VISIBLE);

        }

        else if (position==3){
            holder.topText.setVisibility(View.GONE);
            holder.bottomText.setVisibility(View.GONE);
            holder.bottomSubText.setVisibility(View.VISIBLE);
            holder.bottomSubText.setBackgroundColor(Color.parseColor("#d35400"));

        }

        else if (position==4){
            holder.bottomText.setVisibility(View.GONE);
            holder.bottomSubText.setVisibility(View.VISIBLE);
            holder.topText.setBackgroundColor(Color.parseColor("#f39c12"));

        }

        else if (position==5){
           holder.topText.setVisibility(View.GONE);
           holder.bottomText.setVisibility(View.GONE);
           holder.bottomSubText.setVisibility(View.GONE);

        }

        else if (position==6){
            holder.topText.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.topText.setTextColor(Color.parseColor("#f39c12"));
            holder.subText.setVisibility(View.VISIBLE);
            holder.subText.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.subText.setTextColor(Color.parseColor("#000000"));
            holder.imageView.setVisibility(View.GONE);
            holder.bottomText.setBackgroundColor(Color.parseColor("#f39c12"));

        }
        if (position==7){
            holder.imageView.setVisibility(View.GONE);
            holder.subText.setVisibility(View.VISIBLE);
            holder.topText.setBackgroundColor(Color.parseColor("#c0392b"));
            holder.subText.setBackgroundColor(Color.parseColor("#c0392b"));
            holder.bottomText.setBackgroundColor(Color.parseColor("#d35400"));
        }



    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView topText;
        private TextView bottomText;
        private TextView subText;
        private TextView bottomSubText;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.rvImage);
            topText = itemView.findViewById(R.id.topText);
            bottomText = itemView.findViewById(R.id.bottomText);
            subText = itemView.findViewById(R.id.topSubText);
            bottomSubText = itemView.findViewById(R.id.bottomSubText);
        }

        private void setdata(int resource, String TopText,String BottomText, String topSubtext, String BottomSubText){

            imageView.setImageResource(resource);
            topText.setText(TopText);
            bottomText.setText(BottomText);
            subText.setText(topSubtext);
            bottomSubText.setText(BottomSubText);
        }
    }
}

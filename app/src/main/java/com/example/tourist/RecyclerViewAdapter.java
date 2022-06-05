package com.example.tourist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context context;
    List<Places> list;
public  RecyclerViewAdapter(Context context,List<Places>list){
    this.context=context;
    this.list=list;
}


    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view_item,parent,false);
return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder,int position) {

holder.profileImage.setImageResource(list.get(position).getImageProfile());
holder.Name.setText(list.get(position).getName());
        holder.Descr.setText(list.get(position).getNameDes());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int position =holder.getAdapterPosition();

                Intent intent =new Intent(context,ViewActivity.class);
                intent.putExtra("position",position);

                context.startActivity(intent);

            }


        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profileImage;
        TextView Name,Descr;
        Button button;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage=itemView.findViewById(R.id.profileImage);
            Name=itemView.findViewById(R.id.name);
            Descr=itemView.findViewById(R.id.nameDesc);
            button=itemView.findViewById(R.id.button);



        }}
    }


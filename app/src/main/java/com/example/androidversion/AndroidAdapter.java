package com.example.androidversion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.viewHolder> {



    List<Android> androids;

    public AndroidAdapter(List<Android> androids) {
        this.androids = androids;
    }

    @NonNull
    @Override
    public AndroidAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.model_design_android_version,parent,false);


        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidAdapter.viewHolder holder, int position) {

       Android android = androids.get(position);

       holder.versionTV.setText(android.getVersion());
       holder.nameTV.setText(android.getName());
       holder.apiTV.setText(android.getApi());
       holder.releaseTV.setText(android.getRelease());
       holder.imageView.setImageResource(android.getImage());


    }

    @Override
    public int getItemCount() {
        return androids.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView versionTV,nameTV,apiTV,releaseTV;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            versionTV = itemView.findViewById(R.id.versionTV);
            nameTV = itemView.findViewById(R.id.nameTV);
            apiTV = itemView.findViewById(R.id.apiTV);
            releaseTV = itemView.findViewById(R.id.releaseTV);
        }
    }
}

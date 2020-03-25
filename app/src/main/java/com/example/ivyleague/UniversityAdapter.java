package com.example.ivyleague;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;


public class UniversityAdapter extends RecyclerView.Adapter<UniversityViewHolder> {
    private Context context;

    public UniversityAdapter(Context context){
        this.context = context;
    }

    @Override
    public UniversityViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview, parent, false);
        return new UniversityViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(UniversityViewHolder holder, int position){
        University university = Universities.get(position);
        holder.getNameView().setText(university.getName());
        holder.getInfoView().setText(university.getInfo());
        holder.getIconView().setImageResource(university.getIcon());
    }

    @Override
    public int getItemCount(){
        return Universities.size();
    }
}

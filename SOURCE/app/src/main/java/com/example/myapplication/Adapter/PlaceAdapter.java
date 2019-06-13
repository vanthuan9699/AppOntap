package com.example.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.Model.ContactResult;
import com.example.myapplication.Model.PlaceResult;
import com.example.myapplication.R;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>{
    Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<PlaceResult> data;


    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_list_place, viewGroup, false);
        PlaceAdapter.PlaceViewHolder placeViewHolder = new PlaceViewHolder(view);
        return placeViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder placeViewHolder, int i) {
        PlaceResult placeResult = data.get(i);
        placeViewHolder.tvName.setText(placeResult.getPlaceName());


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PlaceViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;


        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_PlaceName);

        }
    }

}

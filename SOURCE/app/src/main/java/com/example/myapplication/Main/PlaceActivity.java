package com.example.myapplication.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.Adapter.ContactAdapter;
import com.example.myapplication.Adapter.PlaceAdapter;
import com.example.myapplication.Model.ContactExample;
import com.example.myapplication.Model.Example;
import com.example.myapplication.R;
import com.example.myapplication.Utils.Utils;
import com.google.gson.Gson;

public class PlaceActivity extends AppCompatActivity {
    RecyclerView rcvPlace;
    Example placeExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        readJson();
        configRVPlace();
        initData();

    }
    public void readJson() {
        String strHomeData = Utils.loadJsonContact(this);
        Gson gson = new Gson();
        placeExample = gson.fromJson(strHomeData, Example.class);

    }
    void configRVPlace() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(PlaceActivity.this, LinearLayoutManager.VERTICAL, false);
        rcvPlace.setLayoutManager(linearLayoutManager);
        PlaceAdapter adapter = new PlaceAdapter();
        adapter.data = placeExample.getResult();
        adapter.setContext(this);
        rcvPlace.setAdapter(adapter);
    }
    void initData(){
        rcvPlace = (RecyclerView)  findViewById(R.id.rcv_place);
    }



}

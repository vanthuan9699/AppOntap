package com.example.myapplication.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.Adapter.ContactAdapter;
import com.example.myapplication.Model.ContactExample;
import com.example.myapplication.R;
import com.example.myapplication.Utils.Utils;
import com.google.gson.Gson;

public class ContactActivity extends AppCompatActivity {
    RecyclerView rcvContact;
    ContactExample resultContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        initData();
        docJson();
        configRVContact();

    }

    public void docJson() {
        String strHomeData = Utils.loadJson(this, "Contact.json");
        Gson gson = new Gson();
        resultContact = gson.fromJson(strHomeData, ContactExample.class);

    }

    void configRVContact() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ContactActivity.this, LinearLayoutManager.VERTICAL, false);
        rcvContact.setLayoutManager(linearLayoutManager);
        ContactAdapter adapter = new ContactAdapter();
        adapter.data = resultContact.getResult();
        adapter.setContext(this);
        rcvContact.setAdapter(adapter);
    }
    void initData(){
        rcvContact =  findViewById(R.id.rcv_contact);
    }


}

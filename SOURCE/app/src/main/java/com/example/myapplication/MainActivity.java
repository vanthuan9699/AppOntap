package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Main.ContactActivity;
import com.example.myapplication.Main.PlaceActivity;
import com.example.myapplication.Main.PromotionActivity;

public class MainActivity extends AppCompatActivity {
    Button btnContact, btnPlace, btnPromotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intData();
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });

        btnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });

        btnPromotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromotionActivity.class);
                startActivity(intent);
            }
        });


    }

    private void intData() {
        btnContact = (Button) findViewById(R.id.btn_contact);
        btnPlace = (Button) findViewById(R.id.btn_place);
        btnPromotion = (Button) findViewById(R.id.btn_promotion);
    }
}

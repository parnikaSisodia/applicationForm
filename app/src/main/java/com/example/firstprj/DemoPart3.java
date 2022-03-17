package com.example.firstprj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

public class DemoPart3 extends AppCompatActivity {

    ConstraintLayout cl1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_part4);
        cl1=findViewById(R.id.main_screen);

    }
}
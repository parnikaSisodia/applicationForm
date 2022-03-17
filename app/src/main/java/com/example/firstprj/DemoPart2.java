package com.example.firstprj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DemoPart2 extends AppCompatActivity {
    private TextView t1;
    private TextView t2;
    private Button b2;
    private ConstraintLayout cl1;
    private static int i=0;
    int counterColorChanged =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_part2);

        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getApplicationContext(),DemoPart3.class);
//                Intent i2 = new Intent(getApplicationContext(),DemoPart3.class);
                counterColorChanged++;
                colorChangedMethod1(counterColorChanged);
//                startActivity(i2);

//                switch (i){
//                    case 0:
//                        i=1;
//                        colorChangedMethod1();
//
//                        break;
//                    case 1:
//                        i=2;
//                        colorChangeMethod2();
//
//                    case 2:
//                        i=0;
//                        colorChangeMethod3();
//
//                        break;
//                }


            }
        });

        Intent intent=getIntent();
        String userIntent=intent.getStringExtra("UserKey");
        String mobIntent=intent.getStringExtra("MobKey");
        String EmailIntent=intent.getStringExtra("EmailKey");
        String addIntent=intent.getStringExtra("AddressKey");

        t1=findViewById(R.id.heading1);
        t1.setText("VIEW DETAILS");

        t2=findViewById(R.id.details);
        t2.setText(userIntent+"\n"+mobIntent+"\n"+EmailIntent+"\n"+addIntent+"\n");
        cl1=findViewById(R.id.main_screen);
    }


    void colorChangedMethod1(int colorCounter){
        if(colorCounter == 1) {
            cl1.setBackgroundColor(getResources().getColor(R.color.black));
        } else if (colorCounter == 2) {

            cl1.setBackgroundColor(getResources().getColor(R.color.white));
        }
        else if (colorCounter == 3) {

            cl1.setBackgroundColor(getResources().getColor(R.color.purple_500));
        }else{
            counterColorChanged=0;
            cl1.setBackgroundColor(getResources().getColor(R.color.teal_700));
        }



    }

//    void colorChangeMethod2(){
//        cl1.setBackgroundColor(getResources().getColor(R.color.white));
//    }
//
//    void colorChangeMethod3(){
//        cl1.setBackgroundColor(getResources().getColor(R.color.teal_200));
//    }


}
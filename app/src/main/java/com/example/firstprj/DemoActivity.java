package com.example.firstprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DemoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button okButton;
    private TextView uname;
    private TextView mob;
    private TextView email;
    private TextView address;
    private EditText editText;
    private EditText mobNum;
    private EditText eMail;
    private EditText add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        okButton = findViewById(R.id.ok_button);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.out.println("EditextData-->"+editText.getText());
                //String userName = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),DemoPart2.class);
                i.putExtra("UserKey",editText.getText().toString());
                i.putExtra("MobKey",mobNum.getText().toString());
                i.putExtra("EmailKey", eMail.getText().toString());
                i.putExtra("AddressKey", add.getText().toString());
                startActivity(i);
           //     startActivity(new Intent(getApplicationContext(),DemoPart2.class));
            }
        });


        uname = findViewById(R.id.userName);
        uname.setText("User Name");
        editText=findViewById(R.id.editText);


        mob=findViewById(R.id.mobile);
        mob.setText("Mobile No.");
        mobNum=findViewById(R.id.mobNum);

        email=findViewById(R.id.email);
        email.setText("Email ID");
        eMail=findViewById((R.id.eMail));

        address=findViewById(R.id.address);
        address.setText("Address");
        add=findViewById(R.id.add);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ok_button:
                System.out.println("Click_button");
                break;

        }

    }
}
package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reget_password_selectway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        Button button1 = (Button) findViewById(R.id.back);
        Button button2 = (Button) findViewById(R.id. regetpasswordbyemail);
        Button button3 = (Button) findViewById(R.id. regetpasswordbyshortmail);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.back:Intent intent = new Intent(Reget_password_selectway.this,FirstActivity.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    default:break;
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.regetpasswordbyemail:Intent intent = new Intent(Reget_password_selectway.this,Reget_password_byemail.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    default:break;
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.regetpasswordbyshortmail:Intent intent = new Intent(Reget_password_selectway.this,Reget_password_byshortmail.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    default:break;
                }

            }
        });
    }
}

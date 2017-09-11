package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Reget_password_byemail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reget_password_byemail);
        Button buttonback = (Button) findViewById(R.id.back);
        buttonback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.back:Intent intent = new Intent(Reget_password_byemail.this,Reget_password_selectway.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    default:break;
                }

            }
        });
        Button buttoncheck = (Button) findViewById(R.id.check);
        buttoncheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.check:
                        Toast.makeText(getApplicationContext(), "验证码已经发送至您的邮箱，请注意查收。", Toast.LENGTH_SHORT).show();
                        break;
                    default:break;
                }

            }
        });
        Button buttonyes = (Button) findViewById(R.id.Yes);
        buttonyes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.Yes:
                        Toast.makeText(getApplicationContext(), "核查正确", Toast.LENGTH_SHORT).show();
                        break;
                    default:break;
                }

            }
        });
    }
}

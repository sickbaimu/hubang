package com.example.activitytest;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class DoHelp extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_help);
        PercentRelativeLayout v11= (PercentRelativeLayout) findViewById(R.id.v1) ;
        PercentRelativeLayout v22= ( PercentRelativeLayout) findViewById(R.id.v2) ;
        PercentRelativeLayout v33= ( PercentRelativeLayout) findViewById(R.id.v3) ;
        PercentRelativeLayout v44= ( PercentRelativeLayout) findViewById(R.id.v4) ;
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View buttonLayout = layoutInflater.inflate(R.layout.layout2, null);
        View buttonLayout2 = layoutInflater.inflate(R.layout.layout2, null);
        View buttonLayout3 = layoutInflater.inflate(R.layout.layout2, null);
        View buttonLayout4 = layoutInflater.inflate(R.layout.layout2, null);
        v11.addView(buttonLayout);

       v22.addView(buttonLayout2);
        v33.addView(buttonLayout3);
        v44.addView(buttonLayout4);





        Button button2 = (Button) findViewById(R.id.button_2);
        Button button3 = (Button) findViewById(R.id.button_3);
        Button button4 = (Button) findViewById(R.id.button_4);
        Button button5 = (Button) findViewById(R.id.button_5);



        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                switch (v.getId()){
                    case R.id.button_2:
                        Intent intent = new Intent(DoHelp.this,HOST.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                    default:break;
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.button_3:
                        Intent intent = new Intent(DoHelp.this,Help.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                    default:break;
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.button_4:
                        Intent intent = new Intent(DoHelp.this,DoHelp.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                    default:break;
                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.button_5:
                        Intent intent = new Intent(DoHelp.this,Personal.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                    default:break;
                }

            }
        });
    }
}

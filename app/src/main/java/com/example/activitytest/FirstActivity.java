package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_1);
        Button button2 = (Button) findViewById(R.id.button_2);
        Button button3 = (Button) findViewById(R.id.cenl);
        editText = (EditText) findViewById(R.id.edit_text);
        editText2 = (EditText) findViewById(R.id.edit_text2);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                switch (v.getId()){
                    case R.id.button_1:
                        String inputText =editText.getText().toString();
                        String inputText2 =editText2.getText().toString();
                        boolean flag=true;
                        if(inputText.equals(inputText2)&&!inputText.equals("")||flag)
                        {
                            Toast.makeText(FirstActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(FirstActivity.this,HOST.class);
                            startActivity(intent);
                            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        }


                        else
                            Toast.makeText(FirstActivity.this, "用户名与密码不匹配", Toast.LENGTH_SHORT).show();break;
                    //case R.id.button_2: Toast.makeText(FirstActivity.this, "抱歉，该功能还在开发中...", Toast.LENGTH_SHORT).show();break;
                    default:break;
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.button_2:Intent intent = new Intent(FirstActivity.this,Register.class);
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
                    case R.id.cenl:Intent intent = new Intent(FirstActivity.this,Reget_password_selectway.class);
                        startActivity(intent);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    default:break;
                }

            }
        });

    }

}

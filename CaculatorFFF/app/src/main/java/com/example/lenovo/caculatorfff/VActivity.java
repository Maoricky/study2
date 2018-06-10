package com.example.lenovo.caculatorfff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lenovo.caculatorfff.R.id.TV1;
import static com.example.lenovo.caculatorfff.R.id.TV2;
import static com.example.lenovo.caculatorfff.R.id.TV3;
import static com.example.lenovo.caculatorfff.R.id.TV4;

public class VActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v);
        final TextView TV5 = (TextView) findViewById(R.id.editcm3);
        final TextView TV6 = (TextView) findViewById(R.id.editdm3);
        final TextView TV7 = (TextView) findViewById(R.id.editm3);
        Button button=(Button)findViewById(R.id.btn16);//返回主界面的函数
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=getIntent();
                setResult(0,intent1);
                finish();
            }
        });
        Button button2=(Button)findViewById(R.id.btn15);//计算的长度的方法
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TV5.getText().toString().length()!=0&&TV6.getText().toString().length()==0
                        &&TV7.getText().toString().length()==0){
                    double cm=Double.parseDouble(TV5.getText().toString());
                    TV6.setText(""+cm/1000+"");
                    TV7.setText(""+cm/1000000+"");

                }
                else if(TV6.getText().toString().length()!=0&&TV5.getText().toString().length()==0
                        &&TV7.getText().toString().length()==0){
                    double dm=Double.parseDouble(TV6.getText().toString());
                    TV5.setText(""+dm*1000+"");
                    TV7.setText(""+dm/1000+"");

                }
                else if(TV7.getText().toString().length()!=0&&TV6.getText().toString().length()==0
                        &&TV5.getText().toString().length()==0){
                    double m=Double.parseDouble(TV7.getText().toString());
                    TV6.setText(""+m*1000+"");
                    TV5.setText(""+m*1000000+"");

                }

            }
        });
        Button button3=(Button)findViewById(R.id.btn17);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV5.setText("");
                TV6.setText("");
                TV7.setText("");
            }
        });
    }
}

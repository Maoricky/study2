package com.example.lenovo.caculatorfff;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.lenovo.caculatorfff.R.id.TV1;
import static com.example.lenovo.caculatorfff.R.id.TV5;
import static com.example.lenovo.caculatorfff.R.id.TV6;

public class TemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tem);
        final TextView TV10 = (TextView) findViewById(R.id.TV10);
        final TextView TV11= (TextView) findViewById(R.id.TV11);
        Button button=(Button)findViewById(R.id.btn20);//返回主界面的函数
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=getIntent();
                setResult(0,intent2);
                finish();
            }
        });
        Button button2=(Button)findViewById(R.id.btn19);//计算的长度的方法
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TV10.getText().toString().length()!=0&&TV11.getText().toString().length()==0){
                    double c=Double.parseDouble(TV10.getText().toString());
                    double cc=c*33.8;
                    //保留两位小数
                    DecimalFormat ccc= new DecimalFormat("######0.00");
                    TV11.setText(""+ccc.format(cc)+"");
                 }
               else if(TV11.getText().toString().length()!=0&&TV10.getText().toString().length()==0){
                    double f=Double.parseDouble(TV11.getText().toString());
                    double ff=f/33.8;
                    //保留两位小数
                    DecimalFormat fff   = new DecimalFormat("######0.00");
                    TV10.setText(""+fff.format(ff)+"");
                }
            }
        });

        Button button3=(Button)findViewById(R.id.btn21);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV10.setText("");
                TV11.setText("");
            }
        });
    }
}

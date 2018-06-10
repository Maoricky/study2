package com.example.lenovo.caculatorfff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;
import static com.example.lenovo.caculatorfff.R.id.TV5;
import static com.example.lenovo.caculatorfff.R.id.TV6;

public class unitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);
        final TextView TV1 = (TextView) findViewById(R.id.editcm);
        final TextView TV2 = (TextView) findViewById(R.id.editdm);
        final TextView TV3 = (TextView) findViewById(R.id.editm);
        final TextView TV4 = (TextView) findViewById(R.id.editkm);
        Button btn14= (Button) findViewById(R.id.btn14);
        Button btn15 = (Button) findViewById(R.id.btn15);
        Button button1=(Button)findViewById(R.id.BTN15);//返回主界面的函数
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                setResult(0,intent);
                finish();
            }
        });
        Button button2=(Button)findViewById(R.id.btn14);//计算的长度的方法
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //此处需要使用length判断是否为空，如果不加length移动鼠标就会干扰if语句判断
                //判断条件为如果某个编辑框长度不为0（有数据存在），则根据这个编辑框做计算
                if(TV1.getText().toString().length()!=0&&TV2.getText().toString().length()==0
                        &&TV3.getText().toString().length()==0&&TV4.getText().toString().length()==0){
                    double cm=Double.parseDouble(TV1.getText().toString());
                    TV2.setText(""+cm/10+"");
                    TV3.setText(""+cm/100+"");
                    TV4.setText(""+cm/1000+"");
                }
                else if (TV3.getText().toString().length()!=0&&TV2.getText().toString().length()==0
                        &&TV1.getText().toString().length()==0&&TV4.getText().toString().length()==0){
                    double dm=Double.parseDouble(TV3.getText().toString());
                    TV2.setText(""+dm*10+"");
                    TV1.setText(""+dm*100+"");
                    TV4.setText(""+dm/10+"");
                }
                else if (TV2.getText().toString().length()!=0&&TV1.getText().toString().length()==0
                        &&TV3.getText().toString().length()==0&&TV4.getText().toString().length()==0){
                    double m=Double.parseDouble(TV2.getText().toString());
                    TV1.setText(m*10+"");
                    TV3.setText(m/10+"");
                    TV4.setText(m/100+"");
                }
                else if (TV4.getText().toString().length()!=0&&TV1.getText().toString().length()==0
                        &&TV3.getText().toString().length()==0&&TV2.getText().toString().length()==0){
                    double km=Double.parseDouble(TV4.getText().toString());
                    TV1.setText(km*1000+"");
                    TV3.setText(km*10+"");
                    TV2.setText(km*100+"");
                }

            }
        });
        //清屏方法
        Button button3=(Button)findViewById(R.id.btn18);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV1.setText("");
                TV2.setText("");
                TV3.setText("");
                TV4.setText("");
            }
        });
    }
}

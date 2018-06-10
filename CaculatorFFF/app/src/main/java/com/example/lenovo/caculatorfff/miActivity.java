package com.example.lenovo.caculatorfff;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static android.R.attr.button;
import static android.R.attr.format;

public class miActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi);
        Intent intent = getIntent();
        final String num = intent.getStringExtra("num");
        //接受从主函数中传来的数
        final double numm = Double.parseDouble(num);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        //打开计算sin的函数
        Button button1 = (Button) findViewById(R.id.buttonsin);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    double nummm = Math.sin((numm / 180) * Math.PI);
                    Intent intent = getIntent();
                    setResult(0, intent);
                    DecimalFormat format = new DecimalFormat("0.##");
                    //将sinx这个字符串重新传到操作框里面，每个button都有但值不一样，intent启动activity
                    intent.putExtra("numm", Double.parseDouble(format.format(nummm)) + "");
                    intent.putExtra("result", "sin" + num);

                finish();

            }
        });
        Button button = (Button) findViewById(R.id.btn13);//返回主界面的函数
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                setResult(0, intent);
                finish();
            }
        });
        Button button2 = (Button) findViewById(R.id.buttonlg);//计算log
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double nummm = Math.log10(numm);
                Intent intent = getIntent();
                setResult(0, intent);
                intent.putExtra("numm", nummm + "");
                intent.putExtra("result", "lg" + num);
                finish();

            }
        });
        Button button3 = (Button) findViewById(R.id.buttoncos);//返回主界面的函数
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nummm = Math.cos((numm / 180) * Math.PI);
                Intent intent = getIntent();
                DecimalFormat format = new DecimalFormat("0.##");
                setResult(0, intent);
                intent.putExtra("numm", Double.parseDouble(format.format(nummm)) + "");
                intent.putExtra("result", "cos" + num);
                finish();
            }
        });
    }
}


package com.example.lenovo.caculatorfff;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

import static android.R.attr.name;
import static com.example.lenovo.caculatorfff.R.id.btnh;
import static com.example.lenovo.caculatorfff.R.id.textView2;
import static com.example.lenovo.caculatorfff.R.id.tvResult;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    private int jz=10;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tvResult = (EditText) findViewById(R.id.tvResult);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button btnBackspace = (Button) findViewById(R.id.btnBackspace);
        Button btnCE = (Button) findViewById(R.id.btnCE);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btnMul = (Button) findViewById(R.id.btnMul);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btnC = (Button) findViewById(R.id.btnC);
        Button btnEqu = (Button) findViewById(R.id.btnEqu);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        Button btnDoc = (Button) findViewById(R.id.btnDoc);
        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn11 = (Button) findViewById(R.id.btn11);
        Button btn12 = (Button) findViewById(R.id.btn12);
        Button btn13 = (Button) findViewById(R.id.btn13);
        Button btn14 = (Button) findViewById(R.id.btn14);
        Button btn15 = (Button) findViewById(R.id.btn15);
        Button btn16 = (Button) findViewById(R.id.btn16);
        Button left = (Button) findViewById(R.id.btnLeft);
        Button right = (Button) findViewById(R.id.btnRight);
        Button buttoncos = (Button) findViewById(R.id.buttoncos);
        Button buttonsin = (Button) findViewById(R.id.buttonsin);
        Button btnh = (Button) findViewById(R.id.btnh);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "*");
            }
        });

        btnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "^");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "/");
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "(");
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + ")");
            }
        });
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=0;
                String s1=tvResult.getText().toString();
                //一种简单的差错算法，用来检测是否出现输入错误
                for(int j=0;j<s1.length()-1;j++){
                    if(s1.charAt(j)=='+'||s1.charAt(j)=='-'||s1.charAt(j)=='*'||s1.charAt(j)=='/'||s1.charAt(j)=='.'||s1.charAt(j)=='^'){
                        if(s1.charAt(j+1)=='+'||s1.charAt(j+1)=='-'||s1.charAt(j+1)=='*'||s1.charAt(j+1)=='/'||s1.charAt(j+1)=='.'||s1.charAt(j+1)=='^'||s1.charAt(j+1)=='=')
                            flag=1;
                    }
                    else if(s1.charAt(j)=='('){
                        if(s1.charAt(j+1)=='+'||s1.charAt(j+1)=='-'||s1.charAt(j+1)=='*'||s1.charAt(j+1)=='/'||s1.charAt(j+1)=='.'||s1.charAt(j+1)=='^'||s1.charAt(j+1)==')')
                            flag=1;
                    }
                    else if(s1.charAt(j)==')'){
                        if(s1.charAt(j+1)=='.'||s1.charAt(j+1)=='(')
                            flag=1;
                    }
                }
                if(s1.charAt(0)=='=')
                    flag=1;
                if(flag==1) {
                   tvResult.setText("Error");
                    Toast.makeText(MainActivity.this,"您输入的算式有误，请按clear键后重新输入",Toast.LENGTH_LONG).show();

                }
            textView2.setText(new jisuan().process(tvResult.getText().toString()));
            }
        });

        //clear输入框输出框清零
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                textView2.setText("");
            }
        });
        //backSpace
        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvResult.getText().toString().length() != 0) {
                    String str1 = tvResult.getText().toString();
                    //substring方法去除最后一个字符
                    String str2 = str1.substring(0, str1.length() - 1);
                    tvResult.setText(str2);
                }
            }
        });
        //输入点
        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + ".");
            }
        });

        //rec求倒数
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double rec1 = 1 / Double.parseDouble(tvResult.getText().toString());
                textView2.setText("" + rec1);
            }
        });

        //单位转换对话框
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CharSequence[] items = {"长度换算", "体积换算", "温度换算"};
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("单位转换")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                switch (i) {
                                    //求长度
                                    case 0:
                                        Intent intent = new Intent(MainActivity.this, unitActivity.class);
                                        startActivityForResult(intent, 0);
                                        break;
                                    //求体积
                                    case 1:
                                        Intent intent1 = new Intent(MainActivity.this, VActivity.class);
                                        startActivityForResult(intent1, 0);
                                        break;
                                    //温度
                                    case 2:
                                        Intent intent2 = new Intent(MainActivity.this, TemActivity.class);
                                        startActivityForResult(intent2, 0);
                                        break;
                                }
                            }

                        });
                builder.show();
            }
        });
        //进制转换对话框
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CharSequence[] items = {"二进制", "八进制", "十进制", "十六进制"};
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("进制转换")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String input = tvResult.getText().toString();
                                int n = (int) Double.parseDouble(input);
                                if (input != null) {
                                    switch (i) {
                                        //二进制
                                        case 0:
                                            if (jz != 2) {
                                                input = n + "";
                                                tvResult.setText(Integer.toBinaryString(Integer.parseInt(input)));
                                                textView2.setText("二进制");
                                                jz = 2;
                                            }
                                            break;
                                        //八进制
                                        case 1:
                                            if (jz != 8) {
                                                input = n + "";
                                                tvResult.setText(Integer.toOctalString(Integer.parseInt(input)));
                                                jz = 8;
                                                textView2.setText("八进制");
                                            }
                                            break;
                                        //十进制
                                        case 2:
                                            if (jz != 10) {
                                                input = n + "";
                                                tvResult.setText(Integer.valueOf(input).toString());
                                                jz = 10;
                                                textView2.setText("十进制");
                                            }
                                            break;
                                        //十六进制
                                        case 3:
                                            if (jz != 16) {
                                                input = n + "";
                                                tvResult.setText(Integer.toHexString(Integer.parseInt(input)));
                                                textView2.setText("十六进制");
                                            }
                                    }
                                }
                            }
                        });
                builder.show();
            }
        });

        //mi activity
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, miActivity.class);
                intent.putExtra("num", tvResult.getText().toString());//此方法意味如果不先输入值，就会闪退
                startActivityForResult(intent, 0);

            }
        });
    }

    //两个activity sin（mi）界面直接跳转
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        EditText tvResult = (EditText) findViewById(R.id.tvResult);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        if (requestCode == 0 && resultCode == 0) {
            //接受mi中计算的式子
           String str = data.getStringExtra("result");
           tvResult.setText(str);
            //接受mi中计算的结果
           String str1 = data.getStringExtra("numm");
           textView2.setText(str1);
        }
    }

     //计算核心，“=”的点击事件调用此方法
    //运用优先级和两个栈数字栈和符号栈实现功能算法如下

    public class jisuan {
        public jisuan(){
        }
        final int MAXLEN = 500;
         public String process(String str) {
            int basicPriority = 0;     //basicPriority为同一（）下的基本优先级
            int tempPriority=0;         //tempPriority临时记录优先级的变化
            int topOp = 0;          //topOp为priority[]和operator[]的计数器
            int topNum = 0;         //topNum为number[]的计数器
            int flag = 1;           //flag为正负数的计数器，1为正数，-1为负数
            int priority[];           //保存operator栈中运算符的优先级，以topOp计数
            double number[];        //保存数字，以topNum计数
            char ch, chh, operator[];//operator[]保存运算符，以topOp计数
            String num;       //记录数字
            priority = new int[MAXLEN];
            number = new double[MAXLEN];
            operator = new char[MAXLEN];
            String expression = str;
            StringTokenizer expToken = new StringTokenizer(expression,"+-*/()^");
            int i = 0;

            //循环扫描
            while (i < expression.length()) {
                ch = expression.charAt(i);  //ch为当前字符

                //判断正负数
                if (i == 0) {
                    if (ch == '-'){
                        flag = -1;  //-出现在表达式首部，则说明该数为负数（因为减号不可能出现在表达式首部）
                    }
                }
                else if(expression.charAt(i-1) == '(' && ch == '-'){
                    flag = -1;      //左括号后边直接加-，也说明是负号不是减号
                }

                //取得数字，并将正负符号转移给数字
                if (ch <= '9' && ch >= '0'|| ch == '.') {
                    num = expToken.nextToken();     //被运算符切开的数字
                    chh = ch;

                    //取得整个数字
                    while (i < expression.length() && (chh <= '9' && chh>= '0'|| chh == '.'|| ch == '^'))
                    {
                        chh = expression.charAt(i++);

                    }
                    //将指针退回之前的位置
                    if (i >= expression.length()) {
                        i=i-1;
                    }
                     else{
                        i=i-2;
                    }

                    if (num.compareTo(".") == 0) {
                        number[topNum++] = 0;
                    }
                    //将正负符号转移给数字
                    else {
                        number[topNum++] = Double.parseDouble(num)*flag;
                        flag = 1;
                    }
                }
                //计算运算符的优先级
                if (ch == '('){
                    basicPriority+=3;
                }
                if (ch == ')'){
                    basicPriority-=3;
                }

                if (ch == '-' && flag == 1 || ch == '+' || ch == '*'|| ch == '/'||ch == '^') {
                    switch (ch) {
                        //+-的优先级最低，为1
                        case '+':
                        case '-':
                            tempPriority = 1 + basicPriority;        //basicPriority初值为0
                            break;
                        //先x÷后+——，优先级+1
                        case '*':
                        case '/':
                            tempPriority = 2 + basicPriority;
                            break;
                        //mi运算一定是最先计算的环节，优先级最高
                        default:
                            tempPriority = 3 + basicPriority;
                            break;
                    }
                    //如果运算栈为空或者当前运算符的优先级大于栈顶元素的优先级，则直接入栈
                    if (topOp == 0 || priority[topOp-1] < tempPriority) {
                        priority[topOp] = tempPriority;     //优先级数入栈
                        operator[topOp] = ch;           //运算符入栈
                        topOp++;                        //指针上移
                    }
                    //否则将operator栈中运算符逐个取出，直到栈顶运算符的优先级小于当前运算符
                    else {
                        while (topOp > 0 && priority[topOp-1] >= tempPriority) {    //一直循环
                            switch (operator[topOp-1]) {
                                //取出数字数组的相应元素（栈顶和栈顶下边的数）进行运算
                                case '+':
                                    number[topNum - 2] = number[topNum - 2] +number[topNum - 1];
                                    break;
                                case '-':
                                    number[topNum - 2] =number[topNum - 2] - number[topNum - 1];
                                    break;
                                case '*':
                                    number[topNum - 2] = number[topNum - 2] *number[topNum - 1];
                                    break;
                                //判断除数为0的情况
                                case '/':
                                    if (number[topNum - 1] == 0) {
                                        return null;
                                    }
                                    number[topNum - 2] = number[topNum - 2] /number[topNum - 1];
                                    break;
                                case '^':
                                    number[topNum-2] = Math.pow(number[topNum-2], number[topNum-1]);
                                    break;
                            }
                            //继续弹栈的下一个元素进行判断
                            topNum--;
                            topOp--;
                        }
                        //将运算符入栈
                        priority[topOp] = tempPriority;
                        operator[topOp] = ch;
                        topOp++;
                    }
                }
                i++;
            }
             //依次取出栈内的运算符进行运算
             //算法最核心
            while (topOp>0) {
                //+-x直接将数组的后两位数取出运算
                switch (operator[topOp-1]) {
                    case '+':
                        number[topNum-2]=number[topNum-1]+number[topNum-2];
                        break;
                    case '-':
                        number[topNum-2]=number[topNum-2]-number[topNum-1];
                        break;
                    case '*':
                        number[topNum-2]=number[topNum-2]*number[topNum-1];
                        break;
                    //涉及到除法时要考虑除数不能为零的情况
                    case '/':
                        if (number[topNum-1] == 0) {
                            return null;
                        }
                        number[topNum-2]=number[topNum-2]/number[topNum-1];
                        break;
                    case '^':
                        number[topNum-2] = Math.pow(number[topNum-2], number[topNum-1]);
                        break;

                }
                //取堆栈下一个元素计算
                topNum--;
                topOp--;
            }


             //输出最终结果
            String s = String.valueOf(accuracy(number[0]));
            return s;
        }

       //accuracy方法确保得到的使小数位数不用出现无限不循环小数
        public double accuracy(double n) {
            DecimalFormat format = new DecimalFormat("0.###########");
            return Double.parseDouble(format.format(n));
        }
    }


    //以下为菜单提示页
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.buttonHelp:
                Toast.makeText(MainActivity.this,"本计算器支持四则运算以及特殊运算"+"请注意特殊运算请先输入数据",Toast.LENGTH_LONG).show();
                break;
            case  R.id.buttonExit:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}




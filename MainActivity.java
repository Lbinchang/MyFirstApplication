package com.example.administrator.myfirstapplication.acticity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myfirstapplication.R;


public class MainActivity extends AppCompatActivity {
    private Button btnGetMoney;
    private TextView tvGetMoney;
    private EditText etGoalMoney;
    private Button btnLostMoney;
    private RadioGroup rgContent;
    private CheckBox cbLOL, cbGirl, cbEnlish;
    private Button btnChage;
    private int money = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetMoney = (Button) findViewById(R.id.btuGetMoney);
        tvGetMoney = (TextView) findViewById(R.id.tvGetMoney);
        btnLostMoney = (Button) findViewById(R.id.btnLostMoney);
        etGoalMoney = (EditText) findViewById(R.id.etGoalMoney);
        cbLOL = (CheckBox) findViewById(R.id.cbLOL);
        cbGirl = (CheckBox) findViewById(R.id.cbGirl);
        cbEnlish = (CheckBox) findViewById(R.id.cbEnglish);
        rgContent = (RadioGroup) findViewById(R.id.rgContent);
        btnChage = (Button) findViewById(R.id.btnChage);

        btnGetMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etGoalMoney.getText().toString().trim() == "") {

                    Toast.makeText(MainActivity.this, "请输入金额", Toast.LENGTH_SHORT).show();
                }

                String strInputMoney = etGoalMoney.getText().toString().trim();
                int iMoney = Integer.parseInt(strInputMoney);
                if (iMoney == money) {
                    Toast.makeText(MainActivity.this, "你已完成目标", Toast.LENGTH_SHORT).show();


                } else {

                    money = money + 1;
                    tvGetMoney.setText("哈哈，我通过点击鼠标轻易赚了" + money + "元");
                }
            }
        });
        btnLostMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (money == 0) {
                    //提示
                    Toast.makeText(MainActivity.this, "没钱了", Toast.LENGTH_SHORT).show();
                } else {
                    money--;
                    tvGetMoney.setText("我通过点击鼠标轻易赚了" + money + "");

                }
            }
        });


        rgContent.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbHappy:
                        Toast.makeText(MainActivity.this, "状态不错，继续保持", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbNotHappy:
                        Toast.makeText(MainActivity.this, "注意调节", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbMyname:
                        Toast.makeText(MainActivity.this, "哈哈，我姓曾", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        cbLOL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton CompoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "骚年，多运动，多学习", Toast.LENGTH_SHORT).show();

                }
            }
        });

        cbGirl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton CompoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "有前途", Toast.LENGTH_SHORT).show();

                }
            }
        });


        cbEnlish.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton CompoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "生命不息，奋斗不止", Toast.LENGTH_SHORT).show();

                }
            }
        });


        btnChage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转界面

                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);



            }
        });
    }
}

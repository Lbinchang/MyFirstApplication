package com.example.administrator.myfirstapplication.acticity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.administrator.myfirstapplication.R;

/**
 * Created by Administrator on 2016/8/17.
 */
public class SecondActivity extends Activity {

    private RatingBar rtbMyScore;
    private SeekBar skbChinaScore;
    private TextView tvChinaScore;
    public ImageButton ibTime;
    private ProgressBar pbTime;
    private DatePicker dpPicker;
    private TimePicker tpPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//一启动执行的函数Main

        setContentView(R.layout.activityscond);

        rtbMyScore = (RatingBar) findViewById(R.id.rtbMyScore);
        skbChinaScore = (SeekBar) findViewById(R.id.skbChinaScore);
        tvChinaScore = (TextView) findViewById(R.id.tvChinaScore);

        ibTime = (ImageButton) findViewById(R.id.ibTime);
        pbTime = (ProgressBar) findViewById(R.id.pbTime);
        dpPicker = (DatePicker) findViewById(R.id.dpPicker);
        tpPicker = (TimePicker) findViewById(R.id.tpPicker);

        rtbMyScore.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(SecondActivity.this, "你给自己的评分是：" + rating, Toast.LENGTH_SHORT).show();
            }
        });

        skbChinaScore.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvChinaScore.setText("中华民族复兴进度是：" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ibTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pbTime.setVisibility(View.VISIBLE);
                final Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        });
        //DatePicker初始化和绑定监听事件

       dpPicker.init(2016, 7, 18, new DatePicker.OnDateChangedListener() {
           @Override
           public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
               Toast.makeText(SecondActivity.this,"你选的日期为"+year+"-"+(monthOfYear+1)+"-"+dayOfMonth,Toast.LENGTH_SHORT).show();
           }
       });

        tpPicker.setIs24HourView(true);
        tpPicker.setCurrentHour(9);
        tpPicker.setCurrentMinute(50);
        tpPicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(SecondActivity.this,"你准备发的时间"+hourOfDay+"-"+minute,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

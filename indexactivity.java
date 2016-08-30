package com.example.administrator.myfirstapplication.acticity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myfirstapplication.R;
import com.example.administrator.myfirstapplication.broadcast.broadcast;

/**
 * Created by Administrator on 2016/8/18.
 */
public class indexactivity extends MainActivity {

    private Button btnmainactivity, btnsecondactivity,btnactivitylife;
    private Button btnactivity ,btnbroadcast;


    private ButtonListener Listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indexactivity);

        Listener = new ButtonListener();
        findview();
        setClickListener();
    }



    private void findview() {
        btnmainactivity = (Button) findViewById(R.id.btnmainactivity);
        btnsecondactivity = (Button) findViewById(R.id.btnsecondactivity);
        btnactivity = (Button) findViewById(R.id.btnactivity);
        btnactivitylife =(Button)findViewById(R.id.btnactivitylife);
        btnbroadcast = (Button)findViewById(R.id.btnbroadcast);
    }

    private void setClickListener() {

        btnmainactivity.setOnClickListener(Listener);
        btnsecondactivity.setOnClickListener(Listener);
        btnactivity.setOnClickListener(Listener);
        btnactivitylife.setOnClickListener(Listener);
        btnbroadcast.setOnClickListener(Listener);



    }
    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnmainactivity:
                    Intent i1 = new Intent(indexactivity.this , MainActivity.class);
                    startActivity(i1);
                    break;
                case R.id.btnsecondactivity:
                    Intent i2 = new Intent(indexactivity.this , SecondActivity.class);
                    startActivity(i2);
                    break;
                case R.id.btnactivitylife:
                    Intent i3 = new Intent(indexactivity.this,activitylife.class);
                    startActivity(i3);
                    break;
                case  R.id.btnactivity:
                    Intent i4 = new Intent(indexactivity.this,Capture.class);
                    startActivity(i4);

                    break;
                case R.id.btnbroadcast:
                    Intent i5 = new Intent(indexactivity.this,broadcast.class);
                    break;
                case R.id.btnposition:
                    Intent i6 = new Intent(indexactivity.this,Position.class);
                    break;

            }
        }
    }


}

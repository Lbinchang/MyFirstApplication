package com.example.administrator.myfirstapplication.acticity;

import android.app.Activity;
import android.app.usage.UsageEvents;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import com.example.administrator.myfirstapplication.R;

/**
 * Created by Administrator on 2016/8/26.
 */
public class Position extends Activity {


    private static final String TAG = "Position";
    private TextView tvaction, tvposition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.position);

        tvaction = (TextView) findViewById(R.id.tvaction);
        tvposition = (TextView) findViewById(R.id.tvposition);


    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
     int Action = event.getAction();
        float X = event.getX();
        float Y = event.getY();
        Log.v(TAG,"Action="+Action);
        Log.v(TAG,"("+X+","+Y+")");
        tvaction.setText("Action = "+ Action);
       tvposition.setText("Postion = ("+X+","+Y+")");



   return true;
    }

}

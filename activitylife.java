package com.example.administrator.myfirstapplication.acticity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.administrator.myfirstapplication.R;

/**
 * Created by Administrator on 2016/8/19.
 */
public class activitylife extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylife);
       Log.i("activitylife","onCreate执行完毕！！");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("activitylife","onCreate执行完会执行我--onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("activitylife","onReStart被执行！");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("activitylife","onResume被执行");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("activitylife","onPause执行，现在activity处于暂停！");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("activitylife","onStop被执行，现在activitlife看不见了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("activitylife","onDestory被执行，现在activity被系统杀死了");
    }

}

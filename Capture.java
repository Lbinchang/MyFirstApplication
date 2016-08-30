package com.example.administrator.myfirstapplication.acticity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myfirstapplication.R;

/**
 * Created by Administrator on 2016/8/19.
 */
public class Capture extends Activity {


    private Button btnCapture;
    private ImageView ivCapture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capture);


        btnCapture=(Button)findViewById(R.id.btnCapture);
        ivCapture =(ImageView)findViewById(R.id.ivCapture);


        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent capIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(capIntent,100);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == 100){
            if(requestCode == RESULT_OK){
                Bitmap bitmap = (Bitmap)data.getExtras().get("data");

              ivCapture .setImageBitmap(bitmap);
            }else if (requestCode ==RESULT_CANCELED){
                Toast.makeText(Capture.this,"拍照失败",Toast.LENGTH_SHORT).show();


            }


        }


    }
}

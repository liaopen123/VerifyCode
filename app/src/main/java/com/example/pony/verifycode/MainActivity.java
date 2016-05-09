package com.example.pony.verifycode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv_verify = (TextView) findViewById(R.id.tv_verify);
        final ImageView iv_verify = (ImageView) findViewById(R.id.iv_verify);
        Button btn_verify = (Button) findViewById(R.id.btn_verify);

        iv_verify.setImageBitmap(VerifyCode.getInstance().createBitmap());
        tv_verify.setText(VerifyCode.getInstance().getCode());
        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_verify.setImageBitmap(VerifyCode.getInstance().createBitmap());
                tv_verify.setText(VerifyCode.getInstance().getCode());
            }
        });
    }
}

package com.longyoung.testapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.longyoung.testapp.diyview.MyView;
import com.longyoung.testapp.diyview.ZanView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ConstraintLayout constraintLayout = findViewById(R.id.layout_content);
//        MyView myView = new MyView(this);
//        constraintLayout.addView(myView);

//        TextView tv = new TextView(this);
//        tv.setTextSize();

        final ZanView zanView = findViewById(R.id.zan_view);
        zanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("taggg", "bbb");
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zanView.setmZanCount(Integer.valueOf(((EditText)findViewById(R.id.editText1)).getText().toString()));
            }
        });

    }
}

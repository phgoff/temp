package com.phirathat.android_application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvhello;
    private Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
//        tvhello = findViewById(R.id.tvhello);
//        btnsubmit = findViewById(R.id.btnsubmit);

    }


//    public void Hello(View view) {
//    btnsubmit.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            tvhello.setText("Foo");
//        }
//    });
//    }

}


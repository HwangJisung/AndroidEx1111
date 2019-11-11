package com.hjs.ex_20191111;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EventActivity extends AppCompatActivity {

    Button red, green, blue;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        // 레이아웃에 있는 btn_red와 red객체를 연결
        red = findViewById(R.id.btn_red);
        green = findViewById(R.id.btn_green);
        blue = findViewById(R.id.btn_blue);

        txt = findViewById(R.id.txt);

        // red 버튼에 이벤트 감지자 등록
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundColor(Color.RED);
                txt.setText("빨강!");
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundColor(Color.GREEN);
                txt.setText("초록!");
                Toast.makeText(EventActivity.this, "초록 누름", Toast.LENGTH_SHORT).show();
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setBackgroundColor(Color.BLUE);
                txt.setText("파랑!");
            }
        });
    }
}

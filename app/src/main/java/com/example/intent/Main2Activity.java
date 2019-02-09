package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button button;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.recyclerview);
        textView1 = findViewById(R.id.user);
        textView2 = findViewById(R.id.pass);

        String view1 = getIntent().getStringExtra("first");
        String view2 = getIntent().getStringExtra("second");

        textView1.setText(view1);
        textView2.setText(view2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,recyclerview.class);

                startActivity(intent);
            }
        });
    }

}

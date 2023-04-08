package com.example.mini_trompy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView1, textView2, textView3;
    private Button buttonShow;

    private String[] names;
    private String name1, name2, name3;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1 = findViewById(R.id.tw_f1);
        textView2 = findViewById(R.id.tw_f2);
        textView3 = findViewById(R.id.tw_g);
        buttonShow = findViewById(R.id.btn_f);

        names = getIntent().getStringArrayExtra("names");
        Random rand = new Random();
        int index1 = rand.nextInt(names.length);
        int index2;
        do {
            index2 = rand.nextInt(names.length);
        } while (index2 == index1);
        name1 = names[index1];
        name2 = names[index2];
        textView1.setText(name1);
        textView2.setText(name2);


        int finalIndex = index2;
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                do {
                    index = rand.nextInt(names.length);
                } while (index == index1 || index == finalIndex);
                name3 = names[index];
                textView3.setText(name3);
            }
        });
    }
}
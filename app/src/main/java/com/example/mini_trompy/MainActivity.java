package com.example.mini_trompy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.et_1);
        editText2 = findViewById(R.id.et_2);
        editText3 = findViewById(R.id.et_3);
        editText4 = findViewById(R.id.et_4);
        buttonSend = findViewById(R.id.btn_e);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] names = new String[4];
                names[0] = editText1.getText().toString();
                names[1] = editText2.getText().toString();
                names[2] = editText3.getText().toString();
                names[3] = editText4.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("names", names);
                startActivity(intent);
            }
        });
    }
}
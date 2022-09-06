package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.button);
        EditText min=findViewById(R.id.min);
        EditText max=findViewById(R.id.max);
        TextView res=findViewById(R.id.result);
        Random random = new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!min.getText().toString().equals("") && !max.getText().toString().equals(""))
                {
                    int min_i = Integer.parseInt(min.getText().toString());
                    int max_i = Integer.parseInt(max.getText().toString())+1;
                    int res_i = random.nextInt(max_i-min_i)+min_i;
                    res.setText(String.format("~ %d ~", res_i));
                }
            }
        });
    }

}
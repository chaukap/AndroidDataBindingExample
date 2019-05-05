package com.example.nodatabinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button b1;
    public TextView myText;
    private int count;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 0;
        b1 = findViewById(R.id.b1);
        myText = findViewById(R.id.plain_name);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                b1.setText(Integer.toString(count));
                if(count < 4){
                    name = "Keep Going!";
                } else if(count < 10){
                    name = "Why stop now?";
                } else {
                    name = "OK chill...";
                }
                myText.setText(name);
            }
        });
    }
}

package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2;
    Button button1, button2,button3;

    public int count=0;int c=9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.textView1);
        textView1.setText("Counter App");

        textView2=findViewById(R.id.textView2);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count==0)
                {   count=1;
                    textView2.setText(""+count);
                }
                else if(count>0)
                {
                    count=count+1;
                    textView2.setText(""+count);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count>0)
                {
                    count=count-1;
                    textView2.setText(""+count);
                }
                else if(count<=0) {
                    count=0;
                    textView2.setText(""+count);
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "count has been reset to 0", Toast.LENGTH_SHORT).show();
                count=0;
                textView2.setText(""+count);
            }
        });

    }


}
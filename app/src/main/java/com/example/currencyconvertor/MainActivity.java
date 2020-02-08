package com.example.currencyconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText tv;
    TextView text;
    double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button)findViewById(R.id.bt);
        tv=(EditText) findViewById(R.id.edittext);
        text= (TextView)findViewById(R.id.textView);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = tv.getText().toString();
                    if(!(TextUtils.isEmpty(tv.getText().toString()))){
                        d= Double.parseDouble(str);
                        float f= (float) ((float)d*0.014);
                        String ans= Float.toString(f);
                        text.setText("US Dollar: "+ans);
                    }
                    else{
                        Log.d("nullval","no toast");
                        Toast.makeText(MainActivity.this,"Null amount",Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }
}

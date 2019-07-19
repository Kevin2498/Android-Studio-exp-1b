package com.example.experiment1b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String item;
    public void onClick(View view)
    {
        EditText e1=(EditText) findViewById(R.id.n1);
        EditText e2=(EditText) findViewById(R.id.n2);
        String a=e1.getText().toString();
        String b=e2.getText().toString();
        double n1=Double.parseDouble(a);
        double n2=Double.parseDouble(b);
        double n3=n1+n2;
        item=Double.toString(n3);
        Toast.makeText(MainActivity.this,item,+Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}



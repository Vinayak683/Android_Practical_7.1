package com.example.prac71;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.etext1);
        et2=findViewById(R.id.etext2);
    }
    public void Login(View v){
        String str="";
        if(et1.getText().toString().equals("") || et2.getText().toString().equals("")){
            str="Fill The All TextFilds";
        }
        else{
            str="Login Successfully";
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
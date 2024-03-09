package com.example.atividade02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText input01,input02,input03,input04;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input01 = (EditText) findViewById(R.id.input01);
        input02 = (EditText) findViewById(R.id.input02);
        input03 = (EditText) findViewById(R.id.input03);
        input04 = (EditText) findViewById(R.id.input04);
        result = (TextView) findViewById(R.id.result);

        Button ascBtn = (Button) findViewById(R.id.ascBtn);
        ascBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, num3, num4;
                List<Integer> li = new ArrayList<>();
                if(!input01.getText().toString().isEmpty()) {
                    num1 = Integer.parseInt(input01.getText().toString());
                    li.add(num1);
                }
                if(!input02.getText().toString().isEmpty()) {
                    num2 = Integer.parseInt(input02.getText().toString());
                    li.add(num2);
                }
                if(!input03.getText().toString().isEmpty()) {
                    num3 = Integer.parseInt(input03.getText().toString());
                    li.add(num3);
                }
                if(!input04.getText().toString().isEmpty()) {
                    num4 = Integer.parseInt(input04.getText().toString());
                    li.add(num4);
                }
                Collections.sort(li);
                String str_list="";
                for(int x:li){
                    str_list +=x+" ";
                }
                result.setText(str_list);
            }
        });
        Button descBtn = (Button) findViewById(R.id.descBtn);
        descBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1, num2, num3, num4;
                List<Integer> li = new ArrayList<>();
                if(!input01.getText().toString().isEmpty()) {
                    num1 = Integer.parseInt(input01.getText().toString());
                    li.add(num1);
                }
                if(!input02.getText().toString().isEmpty()) {
                    num2 = Integer.parseInt(input02.getText().toString());
                    li.add(num2);
                }
                if(!input03.getText().toString().isEmpty()) {
                    num3 = Integer.parseInt(input03.getText().toString());
                    li.add(num3);
                }
                if(!input04.getText().toString().isEmpty()) {
                    num4 = Integer.parseInt(input04.getText().toString());
                    li.add(num4);
                }
                Collections.sort(li, Comparator.reverseOrder());
                String str_list="";
                for(int x:li){
                    str_list +=x+" ";
                }
                result.setText(str_list);
            }
        });
    }
}
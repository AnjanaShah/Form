package com.example.skand.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class show extends AppCompatActivity {

    TextView name1,no2,degree3,gender4,course5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent i=getIntent();
        String name,number,degree,gender,courses;
        ArrayList<String> course_array;
        //name= new String();
//fetching the intents
        name=i.getStringExtra("name");
        number=i.getStringExtra("number");
        degree=i.getStringExtra("degree");
        gender=i.getStringExtra("gender");
        course_array=i.getStringArrayListExtra("courses");
        courses="";
        for(int k=0;k<course_array.size();k++)
        {
            courses=courses+course_array.get(k)+", ";
        }
        //fetching the textview
        name1=(TextView)findViewById(R.id.name1);
        no2=(TextView)findViewById(R.id.no2);
        gender4=(TextView)findViewById(R.id.gender4);
        degree3=(TextView)findViewById(R.id.degree3);
        course5=(TextView)findViewById(R.id.courses5);
        //putting it on screen
        name1.setText("NAME:"+name);
        no2.setText("NUMBER:"+number);
        gender4.setText("GENDER:"+gender);
        degree3.setText("DEGREE:"+degree);
        course5.setText("COURSES:"+courses);





    }
}

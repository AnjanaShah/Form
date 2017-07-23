package com.example.skand.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name,number,degree;

    RadioGroup gender;
    CheckBox c1,c2,c3,c4;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =(EditText)findViewById(R.id.name);
        number=(EditText)findViewById(R.id.phone);
        degree=(EditText)findViewById(R.id.degree);
        submit=(Button)findViewById(R.id.submit);
        gender=(RadioGroup)findViewById(R.id.genger_group);
        c1=(CheckBox)findViewById(R.id.C);
        c2=(CheckBox)findViewById(R.id.java);
        c3=(CheckBox)findViewById(R.id.android);
        c4=(CheckBox)findViewById(R.id.webd);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent();
        i.putExtra("name",name.getText().toString());
        i.putExtra("number",number.getText().toString());
        i.putExtra("degree",degree.getText().toString());
        int id=gender.getCheckedRadioButtonId();
        //radio button
        if(id==R.id.male)
            i.putExtra("gender","Male");
        else
            i.putExtra("gender","Female");
        //check box
        ArrayList<String> course = new ArrayList<String>();

        if(c1.isChecked())
            course.add("c++");
        if(c2.isChecked())
            course.add("java");
        if(c3.isChecked())
            course.add("android");
        if(c4.isChecked())
            course.add("webD");
        i.putStringArrayListExtra("courses",course);



        i.setClass(this,show.class);
        startActivity(i);
    }
}

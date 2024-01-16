package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText name, roll, phone, pyear;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.txt1);
        roll= (EditText)findViewById(R.id.txt2);
        phone = (EditText)findViewById(R.id.txt3);
        pyear = (EditText)findViewById(R.id.txt4);
        btnSubmit = (Button)findViewById(R.id.btn);
        result = (TextView)findViewById(R.id.resultView);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() || roll.getText().toString().isEmpty() || phone.getText().toString().isEmpty() || pyear.getText().toString().isEmpty()) {
                    result.setText("Please Fill All the Details");
                } else {
                    result.setText("Name -  " + name.getText().toString() + " \n" + "Password -  " + roll.getText().toString()
                            + " \n" + "E-Mail -  " + phone.getText().toString() + " \n" + "DOB -  " + pyear.getText().toString());
                }
            }
        });
    }
}
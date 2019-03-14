package com.claire.registerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText InputNames, InputEmail, InputPassword, InputDate, InputPhone;
    RadioButton RadioMale, RadioFemale;
    Button ButtonSubmit;
    CheckBox CheckBoxTerms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputNames = findViewById(R.id.InputNames);
        InputEmail = findViewById(R.id.InputEmail);
        InputPassword = findViewById(R.id.InputPassword);
        InputPhone = findViewById(R.id.InputPhone);
        InputDate = findViewById(R.id.InputDate);
        RadioMale = findViewById(R.id.RadioMale);
        RadioFemale = findViewById(R.id.RadioFemale);
        ButtonSubmit = findViewById(R.id.ButtonSubmit);
        CheckBoxTerms = findViewById(R.id.CheckBoxTerms);

        ButtonSubmit.setEnabled(false);

        //listener
        CheckBoxTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    ButtonSubmit.setEnabled(true);
                }else {
                    ButtonSubmit.setEnabled(false);
                }
            }
        });
    }

    public void register(View view) {
        String names = InputNames.getText().toString().trim();
        String email = InputEmail.getText().toString().trim();
        String password = InputPassword.getText().toString().trim();
        String phone = InputPhone.getText().toString().trim();
        String dob = InputDate.getText().toString().trim();

        String gender = RadioFemale.isChecked() ? "Female" : "Male";

        String data =names +" "+email +" "+dob +" " +gender +" "+password;

        Toast.makeText(this, data,  Toast.LENGTH_SHORT).show();
    }
}

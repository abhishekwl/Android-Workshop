package io.github.abhishekwl.ksitgejai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    String gender;
    String languages = "";

    EditText nameEditText, phoneEditText;
    RadioButton maleRadioButton, femaleRadioButton;
    CheckBox englishCheckBox, kannadaCheckBox, hindiCheckBox;
    Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
        phoneEditText = (EditText) findViewById(R.id.phoneEditText);
        maleRadioButton = (RadioButton) findViewById(R.id.maleRadioButton);
        femaleRadioButton = (RadioButton) findViewById(R.id.femaleRadioButton);
        englishCheckBox = (CheckBox) findViewById(R.id.englishCheckBox);
        kannadaCheckBox = (CheckBox) findViewById(R.id.kannadaCheckBox);
        hindiCheckBox = (CheckBox) findViewById(R.id.hindiCheckBox);
        signupButton = (Button) findViewById(R.id.signupButton);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEditText.getText().toString();
                String phoneNumber = phoneEditText.getText().toString();

                if (maleRadioButton.isChecked()) {
                    gender = "Male";
                }else {
                    gender= "Female";
                }

                if (englishCheckBox.isChecked()) {
                    languages = languages + "English, ";
                }
                if (kannadaCheckBox.isChecked()) {
                    languages = languages + "Kannada, ";
                }
                if (hindiCheckBox.isChecked()) {
                    languages = languages + "Hindi, ";
                }

                String mainString = "NAME: "+name+"\n"
                        +"PHONE NUMBER: "+phoneNumber+"\n"
                        +"GENDER: "+gender+"\n"
                        +"LANGUAGES: "+languages;

                Intent secondPageIntent = new Intent(MainActivity.this, SummaryActivity.class);
                secondPageIntent.putExtra("DATA", mainString);
                startActivity(secondPageIntent);

            }
        });

    }
}

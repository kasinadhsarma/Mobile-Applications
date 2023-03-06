package com.example.p8printdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword, etAddress, etAge;
    private RadioGroup rgGender;
    private RadioButton rbMale, rbFemale, rbOther;
    private DatePicker dpDOB;
    private Spinner spState;
    private Button btnSubmit;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find all views by their IDs
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        etAddress = findViewById(R.id.et_address);
        etAge = findViewById(R.id.et_age);
        rgGender = findViewById(R.id.rg_gender);
        rbMale = findViewById(R.id.rb_male);
        rbFemale = findViewById(R.id.rb_female);
        rbOther = findViewById(R.id.rb_other);
        dpDOB = findViewById(R.id.dp_dob);
        spState = findViewById(R.id.sp_state);
        btnSubmit = findViewById(R.id.btn_submit);
        tvResult = findViewById(R.id.tv_result);

        // Set an OnClickListener on the Submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the values entered by the user
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String address = etAddress.getText().toString();
                String age = etAge.getText().toString();
                String gender = "";
                int selectedGenderId = rgGender.getCheckedRadioButtonId();
                if (selectedGenderId != -1) {
                    RadioButton selectedGender = findViewById(selectedGenderId);
                    gender = selectedGender.getText().toString();
                }
                int day = dpDOB.getDayOfMonth();
                int month = dpDOB.getMonth() + 1;
                int year = dpDOB.getYear();
                String dob = String.format("%02d/%02d/%d", day, month, year);
                String state = spState.getSelectedItem().toString();

                // Build the result string
                String result = "Username: " + username + "\n"
                        + "Password: " + password + "\n"
                        + "Address: " + address + "\n"
                        + "Age: " + age + "\n"
                        + "Gender: " + gender + "\n"
                        + "Date of Birth: " + dob + "\n"
                        + "State: " + state;

                // Display the result
                tvResult.setText(result);

            }
        });
    }
}

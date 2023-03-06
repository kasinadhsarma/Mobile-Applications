package com.example.p10_sms;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etPhone, etMessage;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find all views by their IDs
        etPhone = findViewById(R.id.et_phone);
        etMessage = findViewById(R.id.et_message);
        btnSend = findViewById(R.id.btn_send);

        // Set an OnClickListener on the Send button
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the phone number and message entered by the user
                String phone = etPhone.getText().toString().trim();
                String message = etMessage.getText().toString().trim();

                // Create a new Intent to send an SMS
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:" + phone));
                intent.putExtra("sms_body", message);

                // Start the SMS app
                startActivity(intent);
            }
        });
    }
}

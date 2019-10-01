package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;
    private Button nextBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_username = findViewById(R.id.activity_register_edit_text1);
        et_password = findViewById(R.id.activity_register_edit_text2);
        nextBTN = findViewById(R.id.activity_register_btnNext);

    }
}

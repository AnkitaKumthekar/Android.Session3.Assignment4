package com.example.akcreation.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.edit_text_email);
        password=(EditText)findViewById(R.id.edit_text_password);
        login=(Button)findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if (email.getText().toString().trim().length() > 0) {
                    if (password.getText().toString().trim().length() > 0) {
                        Toast.makeText(getApplicationContext(), "Successfully LoggedIn", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Enter valid password.", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Enter Valid Email Address.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

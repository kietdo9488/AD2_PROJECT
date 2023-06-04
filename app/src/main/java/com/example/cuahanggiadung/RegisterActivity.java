package com.example.cuahanggiadung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {
    //tao doi tuong
    TextInputEditText editTextName, editTextEmail, editTextPhome, editTextPassword;
    Button buttonReg,buttonLogi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_layout);
        //lien ket cac doi tuong voi layout thong qua id
        editTextName = findViewById(R.id.usernameRegister);
        editTextEmail = findViewById(R.id.emailRegister);
        editTextPhome = findViewById(R.id.phoneRegister);
        editTextPassword = findViewById(R.id.passwordRegister);

        buttonReg = findViewById(R.id.btnRegister_Register);
        buttonLogi = findViewById(R.id.btnLogin_Register);

        //su ly su kiem nhan nut btnRegister
        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, email, password;\
                

            }
        });
    }
}
package com.example.root.proyecto_titulo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblgotoRegister;
    private Button btnLogin;
    private EditText inputEmail;
    private EditText inputPassword;
    private TextView loginErrorMsg;


    @Override
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        inputEmail=(EditText) findViewById(R.id.txtEmail);
        inputPassword=(EditText) findViewById(R.id.txtPass);
        btnLogin=(Button) findViewById(R.id.btnLogin);
        loginErrorMsg=(TextView) findViewById(R.id.login_error);

        btnLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                String email=inputEmail.getText().toString();
                String password=inputPassword.getText().toString();

                if(email.equals("admin")&&password.equals("admin")){
                    Intent nuevoForm=new Intent(MainActivity.this,Secundario.class);
                    MainActivity.this.startActivity(nuevoForm);
                }

            }

        });

    }
}

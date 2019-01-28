package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignInActivity extends AppCompatActivity {
  private FirebaseAuth mAuth;
  private EditText email;
  private EditText password;
  private Button loginButton;
  private Button signUpButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sign_in_activity);
    mAuth = FirebaseAuth.getInstance();
    email = (EditText) findViewById(R.id.emailTextEdit);
    password = (EditText) findViewById(R.id.passwordTextEdit);
    loginButton = (Button) findViewById(R.id.loginButton);
    signUpButton = (Button) findViewById(R.id.signUpButton);

  }

  @Override
  public void onStart() {
    super.onStart();
    FirebaseUser currentUser = mAuth.getCurrentUser();
    updateUI(currentUser);
  }

  private void updateUI(FirebaseUser user) {

  }




}

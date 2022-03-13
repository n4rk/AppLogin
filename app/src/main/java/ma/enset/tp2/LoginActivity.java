package ma.enset.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = (TextView) findViewById(R.id.usernameIput);
        TextView password = (TextView) findViewById(R.id.pwdInput);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Login Successfull !", Toast.LENGTH_SHORT).show();
                    String userName = username.getText().toString();
                    String passWord = password.getText().toString();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    intent.putExtra("keyName", userName);
                    intent.putExtra("keyPwd", passWord);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this, "Please fill in the form !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
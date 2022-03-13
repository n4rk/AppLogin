package ma.enset.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtGlsid = (TextView) findViewById(R.id.textView);
        TextView txt2022 = (TextView) findViewById(R.id.textView2);

        txtGlsid.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));
        txt2022.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
        getSupportActionBar().hide();
    }
}
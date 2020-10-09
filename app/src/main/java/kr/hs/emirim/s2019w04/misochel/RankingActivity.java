package kr.hs.emirim.s2019w04.misochel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RankingActivity extends AppCompatActivity {

    Button homeBtn;
    Button restartBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        homeBtn = (Button)findViewById(R.id.home_btn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RankingActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        restartBtn = (Button)findViewById(R.id.restart_btn);
        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RankingActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
package com.applications.doc.electronicse_module;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }

    public void gotoSubject1(View view){
        Intent openNewActivity = new Intent(this, Subject1.class);
        startActivity(openNewActivity);
    }

    public void gotoSubject2(View view){
        Intent openNewActivity = new Intent(this, Subject2.class);
        startActivity(openNewActivity);
    }

    public void gotoSubject3(View view){
        Intent openNewActivity = new Intent(this, Subject3.class);
        startActivity(openNewActivity);
    }

}

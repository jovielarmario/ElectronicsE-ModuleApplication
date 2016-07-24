package com.applications.doc.electronicse_module;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PrePostTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_post_test);
    }

    public void gotoPreTest(View view){
        Intent openNewActivity = new Intent(this, PreTest.class);
        startActivity(openNewActivity);
    }

    public void gotoPostTest(View view){
        Intent openNewActivity = new Intent(this, PostTest.class);
        startActivity(openNewActivity);
    }
}

package com.applications.doc.electronicse_module;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.applications.doc.electronicse_module.Globals.*;

public class PreTest extends AppCompatActivity {

    private int question = Globals.q;
    private int pre1_1=1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_test);

        final ImageView imageView = (ImageView) findViewById(R.id.img_question);
        imageView.setImageResource(R.drawable.a_1_1);
    }

    public void nextQ(){
        if(question == pre1_1){
            Intent openNewActivity = new Intent(this, Result.class);
            startActivity(openNewActivity);
        }else if(question == 2){
            final ImageView imageView = (ImageView) findViewById(R.id.img_question);
            imageView.setImageResource(R.drawable.b_1_1);
        }
    }
}

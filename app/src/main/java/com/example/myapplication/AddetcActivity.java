package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddetcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcase);

        Button cancel = (Button) findViewById(R.id.button5);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExcaseActivity();
            }
        });
    }

    private void openExcaseActivity() {
        Intent intent = new Intent(this, ExcaseActivity.class);
        startActivity(intent);
    }
}
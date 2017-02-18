package com.example.vitaly.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


    }

    public void clickOnShowButton(View view) {
        ((TextView) findViewById(R.id.tvResultActivityTest))
                .setText(((EditText) findViewById(R.id.etInputActivityTest))
                        .getText().toString());
    }
}

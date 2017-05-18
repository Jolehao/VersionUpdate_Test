package com.qetc.versionupdate_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fruit.updatelib.UpdateChecker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UpdateChecker.checkForDialog(this);
    }
}

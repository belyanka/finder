package com.birb.finder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    private RobotView robotView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);

        robotView = (RobotView) findViewById(R.id.robot);
    }
}

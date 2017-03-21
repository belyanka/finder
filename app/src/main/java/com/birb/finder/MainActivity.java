package com.birb.finder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button searchButton;
    private ImageView imageIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchButton = (Button) findViewById(R.id.search);
        imageIcon = (ImageView) findViewById(R.id.icon);

        imageIcon.setImageResource(R.drawable.iconbird);
    }
}

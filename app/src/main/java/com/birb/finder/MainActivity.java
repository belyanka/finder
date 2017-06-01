package com.birb.finder;

import android.content.Intent;
import android.os.AsyncTask;
import android.speech.tts.Voice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button searchButton;
    private Button listButton;
    private Button detailButton;
    private ImageView imageIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchButton = (Button) findViewById(R.id.search);
        listButton = (Button) findViewById(R.id.list);
        imageIcon = (ImageView) findViewById(R.id.icon);

        imageIcon.setImageResource(R.drawable.iconbird);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchScreen = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(searchScreen);
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent listScreen = new Intent(getApplicationContext(),ResultListActivity.class);
                startActivity(listScreen);
            }
        });
    }
}

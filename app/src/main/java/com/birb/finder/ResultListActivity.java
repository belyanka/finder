package com.birb.finder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class ResultListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Bird> birds = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        recyclerView = (RecyclerView) findViewById(R.id.listView);

        birds.add(new Bird("Снегирь", "Pyrrhula pyrrhula", "Самка"));
        birds.add(new Bird("Домовый воробей", "Passer domesticus", "Любой"));

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        BirdAdapter bAdapter = new BirdAdapter(birds);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(bAdapter);
    }
}

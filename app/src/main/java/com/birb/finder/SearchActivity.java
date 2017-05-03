package com.birb.finder;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.birb.finder.TabFragments.BeakFragment;
import com.birb.finder.TabFragments.BodyFragment;
import com.birb.finder.TabFragments.SimpleFragment;

public class SearchActivity extends AppCompatActivity implements BeakListener{

    private RobotView robotView;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);

        robotView = (RobotView) findViewById(R.id.robot);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        BodyFragment bodyFragment = new BodyFragment();
        BeakFragment beakFragment = new BeakFragment();
        beakFragment.setListener(this);

        adapter.addFragment(bodyFragment, "Body");
        adapter.addFragment(beakFragment, "Beak");
        adapter.addFragment(new SimpleFragment(), "Tail");
        adapter.addFragment(new SimpleFragment(), "Legs");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void setBeakType(int type) {
        Toast.makeText(this,"Choose " + type,Toast.LENGTH_SHORT).show();
    }
}

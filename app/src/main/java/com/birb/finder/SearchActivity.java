package com.birb.finder;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.birb.finder.TabFragments.BeakFragment;
import com.birb.finder.TabFragments.BodyFragment;
import com.birb.finder.TabFragments.SimpleFragment;

public class SearchActivity extends AppCompatActivity implements BodyDataChangeListener, BeakListener{

    private RobotView robotView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);

        robotView = (RobotView) findViewById(R.id.robot);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.pager);
        search = (Button) findViewById(R.id.proceed_search);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        BodyFragment bodyFragment = new BodyFragment();
        BeakFragment beakFragment = new BeakFragment();
        beakFragment.setListener(this);
        bodyFragment.setContext(this);

        adapter.addFragment(bodyFragment, "Тело");
        adapter.addFragment(beakFragment, "Клюв");
        adapter.addFragment(new SimpleFragment(), "Хвост");
        adapter.addFragment(new SimpleFragment(), "Лапы");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void setBodyType(int type) {
        Toast.makeText(this,"Choose " + type,Toast.LENGTH_SHORT).show();
        this.robotView.changeBodyType(type);
    }

    @Override
    public void setBeakType(int type) {
        Toast.makeText(this,"Choose " + type,Toast.LENGTH_SHORT).show();
    }
}

package com.taskmanager.app.enter;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.taskmanager.app.R;


public class ActivityEnterApp extends Activity implements ActionBar.TabListener{


    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar=getActionBar();

        setContentView(R.layout.activity_enter_app);
            if(getResources().getConfiguration().orientation!= Configuration.ORIENTATION_LANDSCAPE){
               //ORIENTATION_PORTRAIT
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                actionBar.addTab(actionBar.newTab().setText(R.string.tab_login).setTabListener(this));
                actionBar.addTab(actionBar.newTab().setText(R.string.tab_regist).setTabListener(this));

                viewPager=(ViewPager)findViewById(R.id.viewpager);
                viewPager.setAdapter(new EnterViewPagerAdapter(getFragmentManager()));
                viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
                    @Override
                    public void onPageSelected(int position){
                        getActionBar().setSelectedNavigationItem(position);
                    }
                });

            } else{
                //ORIENTATION_LANDSCAPE
            }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_enter_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_UNDEFINED){
        viewPager.setCurrentItem(tab.getPosition());
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}

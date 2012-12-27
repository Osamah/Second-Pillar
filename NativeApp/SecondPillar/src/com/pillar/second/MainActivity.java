package com.pillar.second;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        
        //Defining Tabs
       /* TabHost tabHost = getTabHost();
 
        TabSpec mosque = tabHost.newTabSpec("Mosque");
        // setting Title and Icon for the Tab
        mosque.setIndicator("Mosque", getResources().getDrawable(R.drawable.icon_mosque_tab));
        Intent mosquesIntent = new Intent(this, MosqueActivity.class);
        mosque.setContent(mosquesIntent);
        
        // Prayer Tab
        TabSpec prayer = tabHost.newTabSpec("Prayer");
        // setting Title and Icon for the Tab
        prayer.setIndicator("Prayer", getResources().getDrawable(R.drawable.icon_prayer_tab));
        Intent prayersIntent = new Intent(this, PrayerActivity.class);
        prayer.setContent(prayersIntent);
 
        // Favorite Tab
        TabSpec favorite = tabHost.newTabSpec("Favorite");
        favorite.setIndicator("Favorite", getResources().getDrawable(R.drawable.icon_favorite_tab));
        Intent favoriteIntent = new Intent(this, FavoriteActivity.class);
        favorite.setContent(favoriteIntent);
 
      
        // Adding all TabSpec to TabHost
        tabHost.addTab(mosque);
        tabHost.addTab(prayer); 
        tabHost.addTab(favorite); 
        
    }*/

    //Menu in Actionbar - icons
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    

    
}

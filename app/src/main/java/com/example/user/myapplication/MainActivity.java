package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Picture> albumlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv);
        albumlist = new ArrayList<Picture>();
        Picture picture1 = new Picture("公鹿隊",R.drawable.bucks, 93,"暴龍隊", R.drawable.raptors, 118);
        Picture picture2 = new Picture("勇士隊", R.drawable.warriors, 128,"拓荒者隊", R.drawable.trailblazers, 103);
        albumlist.add(picture1);
        albumlist.add(picture2);

        NbaRecordAdaptor adapter = new NbaRecordAdaptor(this, albumlist);

        lv.setAdapter(adapter);
    }

}

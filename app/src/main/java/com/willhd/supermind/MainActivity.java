package com.willhd.supermind;

/**
 * Created by anhpham on 4/15/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.choosemuse.libmuse.MuseManagerAndroid;


public class MainActivity extends AppCompatActivity {
    private MuseManagerAndroid manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = MuseManagerAndroid.getInstance();
        manager.setContext(this);
    }
}

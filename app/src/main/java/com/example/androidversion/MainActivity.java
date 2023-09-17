package com.example.androidversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Android> androidList;
    RecyclerView recyclerView;
    AndroidAdapter androidAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        androidAdapter = new AndroidAdapter(androidList);
        recyclerView.setAdapter(androidAdapter);

        androidList.add(new Android("Version: Android 1.0","Name: Android Alpha","API: 1","Released on 23 September 2008",R.drawable.android_one_point_zero));
        androidList.add(new Android("Version: Android 1.1","Name: Android Beta","API: 2","Released on 9 February 2009",R.drawable.android_one_point_one));
        androidList.add(new Android("Version: Android 1.5","Name: Cupcake","API: 3","Released on 27 April 2009",R.drawable.android_one_point_five));
        androidList.add(new Android("Android 1.6","Name: Donut","API 4","Released on 15 September 2009",R.drawable.android_one_point_six));

        androidList.add(new Android("Version: Android 2.0","Name: Eclair","API: 5-7","Released on 26 October 2009",R.drawable.android_two_point_zero));
        androidList.add(new Android("Version: Android 2.2","Name: Froyo","API: 8","Released on 20 May 2010",R.drawable.android_two_point_two));
        androidList.add(new Android("Version: Android 2.3","Name: Gingerbread","API: 9-10","6 December 2010",R.drawable.android_two_point_three));

        androidList.add(new Android("Version: Android 3.0","Name: Honeycomb","API: 11-13","Released on 22 February 2011",R.drawable.androd_three_point_zero));

        androidList.add(new Android("Version: Android 4.0","Name: Ice Cream Sandwich","API: 14-16","Released on 18 October 2011",R.drawable.android_four_point_zero));
        androidList.add(new Android("Version: Android 4.1","Name: Jelly Bean","API: 16-18","Released on 9 July 2012",R.drawable.android_four_point_one));
        androidList.add(new Android("Version: Android 4.4","Name: Name: KitKat","API: 19-20","Released on 31 October 2013",R.drawable.android_four_point_four));

        androidList.add(new Android("Version: Android 5.0","Name: Lollipop","API: 20-22","Released on 12 November 2014",R.drawable.android_five_point_zero));

        androidList.add(new Android("Version: Android 6.0","Name: Marshmallow","API: 23","Released on 5 October 2015",R.drawable.android_six_point_zero));

        androidList.add(new Android("Version: Android 7.0","Name: Nougat","API: 24-15","Released on 22 August 2016",R.drawable.android_seven_point_zero));

        androidList.add(new Android("Version: Android 8.0","Name: Oreo","API: 26-27","Released on 21 August 2017",R.drawable.android_eight_point_zero));

        androidList.add(new Android("Version: Android 9","Name: Pie","API: 28","Released on 6 August 2018",R.drawable.android_nine));

        androidList.add(new Android("Version: Android 10","Name: Android 10","API: 29","Released on 3 September 2019",R.drawable.android_ten));

        androidList.add(new Android("Version: Android 11","Name: Android 11","API: 30","Released on 8 September 2020",R.drawable.android_eleven));

        androidAdapter.notifyDataSetChanged();
    }
}
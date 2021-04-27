package com.example.lab_gridviewlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<ElectricThing> arrayList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridviewThing);

        arrayList = new ArrayList<>();

        arrayList.add(new ElectricThing("alo",4,50000,15,R.drawable.dauchuyendoi_1,20));
        arrayList.add(new ElectricThing("alo1",4,50000,15,R.drawable.carbusbtops2_1,20));
        arrayList.add(new ElectricThing("alo2",4,50000,15,R.drawable.daucam_1,20));
        arrayList.add(new ElectricThing("alo3",4,50000,15,R.drawable.dauchuyendoipsps2_1,20));
        arrayList.add(new ElectricThing("alo4",4,50000,15,R.drawable.giacchuyen_1,20));
        arrayList.add(new ElectricThing("alo5",4,50000,15,R.drawable.daynguon_1,20));
        arrayList.add(new ElectricThing("alo6",4,50000,15,R.drawable.giacchuyen_1,20));
        arrayList.add(new ElectricThing("alo7",4,50000,15,R.drawable.giacchuyen_1,20));

        customAdapter = new CustomAdapter(MainActivity.this,R.layout.item_girdview, arrayList);
        gridView.setAdapter(customAdapter);
    }
}
package com.example.bt5_taolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonAn adapter;

        //anh xa
        listView = findViewById(R.id.listviewmonan);

        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("NguyenThanhHoang","2050531200149",R.drawable.banhbao));
        arrayList.add(new MonAn("NguyenThanhHoang","2050531200149",R.drawable.banhcuon));
        arrayList.add(new MonAn("NguyenThanhHoang","2050531200149",R.drawable.banhmi));
        arrayList.add(new MonAn("NguyenThanhHoang","2050531200149",R.drawable.bunbo));
        arrayList.add(new MonAn("NguyenThanhHoang","2050531200149",R.drawable.pho));
        arrayList.add(new MonAn("NguyenThanhHoang","2050531200149",R.drawable.miquang));

        adapter = new AdapterMonAn(MainActivity.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,detail_banhcuon.class);
                    startActivity(intent);
                }
                if(i == 1) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, detail_banhbao.class);
                    startActivity(intent);
                }
            }
        });
    }
}
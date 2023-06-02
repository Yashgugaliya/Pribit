package com.example.pribit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.pribit.ui.adaptor.ChipAdapter;
import com.example.pribit.ui.adaptor.ViewAdapter;
import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    CircleIndicator dot1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        dot1=findViewById(R.id.indicator);
        //viewAdapter=new ViewAdapter(this);
        viewPager.setAdapter(new ViewAdapter(this));
        dot1.setViewPager(viewPager);
        List<String>  s = new ArrayList<>();
         s.add("#2023");
         s.add("#TODAYISMONDAY");
         s.add("#TOP");
         s.add("#WOW");
         s.add("##ROW");
        RecyclerView recyclerView = findViewById(R.id.rvChips);
        ChipAdapter adapter= new ChipAdapter(s);
        recyclerView.setHasFixedSize(true);
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(this);
        layoutManager.setFlexDirection(FlexDirection.ROW);
        //layoutManager.setJustifyContent(JustifyContent.CENTER);
        //layoutManager.setAlignItems(AlignItems.CENTER);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
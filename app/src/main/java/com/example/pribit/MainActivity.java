package com.example.pribit;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pribit.databinding.ActivityMainBinding;
import com.example.pribit.ui.adaptor.ChipAdapter;
import com.example.pribit.ui.adaptor.ViewAdapter;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding  binding ;
    ChipAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    private void init(){
        binding.viewpager.setAdapter(new ViewAdapter(this));
        binding.indicator.setViewPager(binding.viewpager);
        setUpList();
        setUpRv();
    }
    private void setUpList(){
        List<String>  list = new ArrayList<>();
        list.add("#2023");
        list.add("#TODAYISMONDAY");
        list.add("#TOP");
        list.add("#WOW");
        list.add("#POPS!");
        list.add("#ROW");
        adapter = new ChipAdapter(list);
    }
    private void setUpRv() {
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(this);
        layoutManager.setFlexDirection(FlexDirection.ROW);
        binding.rvChips.setHasFixedSize(true);
        binding.rvChips.setLayoutManager(layoutManager);
        binding.rvChips.setAdapter(adapter);
    }


}
package com.example.cse225project;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    String text=" ";
    Context context;
    public MyAdapter(@NonNull FragmentManager fm,Context context) {
        super(fm);
        this.context=context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        if(position==0)
        {
            fragment=new Add();
        }
        else
        {
            fragment=new ViewFragment();
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title[]={"LEFT","RIGHT"};
        return title[position];
    }

    @Override
    public int getCount() {
        return 2;
    }
}

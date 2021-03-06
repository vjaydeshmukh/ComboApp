package com.example.aakash.comboapp.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.aakash.comboapp.Fragment.ReferFragment;
import com.example.aakash.comboapp.Fragment.WithDrawFragment;
import com.example.aakash.comboapp.Fragment.EarnFragment;
import com.example.aakash.comboapp.HomeActivity;

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public MyFragmentAdapter(FragmentManager fm, HomeActivity homeActivity) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) return ReferFragment.getInstace();
        else if (position == 1) return WithDrawFragment.getInstace();
        else if (position == 2) return EarnFragment.getInstace();
        else return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "REFER";
            case 1:
                return "EARN";
            case 2:
                return "WITHDRAW";
        }
        return "";
    }
}

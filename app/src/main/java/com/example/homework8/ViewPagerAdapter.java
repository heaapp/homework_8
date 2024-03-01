package com.example.homework8;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return a NEW fragment instance in createFragment(int)
        if (position == 0) {
            return new MoviesFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else {
            return new TicketsFragment();
        }
    }

    @Override
    public int getItemCount() {
        // Hardcoded, could be dynamic based on a list of tabs
        return 3;
    }
}

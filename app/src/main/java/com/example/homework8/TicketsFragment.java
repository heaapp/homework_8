package com.example.homework8;

// MoviesFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TicketsFragment extends Fragment {

    private RecyclerView recyclerView;
    private SimpleListAdapter adapter;

    public TicketsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        String[] moviesList = new String[] {"2D Tickets", "3D Tickets", "VIP Tickets", "IMAX Tickets"};
        adapter = new SimpleListAdapter(moviesList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
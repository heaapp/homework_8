package com.example.homework8;

// MoviesFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class EventsFragment extends Fragment {

    private RecyclerView recyclerView;
    private SimpleListAdapter adapter;

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        String[] moviesList = new String[] {"2:00pm-4:00pm", "5:00pm-7:10pm", "8:00pm-10:30pm"};
        adapter = new SimpleListAdapter(moviesList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

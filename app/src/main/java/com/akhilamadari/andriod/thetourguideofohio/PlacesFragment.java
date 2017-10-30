package com.akhilamadari.andriod.thetourguideofohio;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ArrayList<Tour> words = new ArrayList<Tour>();

        words.add(new Tour(R.string.place1,R.string.place1_des,R.drawable.place1));
        words.add(new Tour(R.string.place2,R.string.place2_des,R.drawable.place2));
        words.add(new Tour(R.string.place3,R.string.place3_des,R.drawable.place3));
        words.add(new Tour(R.string.place4,R.string.place3_des,R.drawable.place4));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.primary_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }


}

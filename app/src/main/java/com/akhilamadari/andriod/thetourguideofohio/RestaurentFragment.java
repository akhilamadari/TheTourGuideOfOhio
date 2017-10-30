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


public class RestaurentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ArrayList<Tour> words = new ArrayList<Tour>();

        words.add(new Tour(R.string.rest1,R.string.rest1_des,R.drawable.rest1));
        words.add(new Tour(R.string.rest2,R.string.rest2_des,R.drawable.rest2));
        words.add(new Tour(R.string.rest3,R.string.rest3_des,R.drawable.rest3));
        words.add(new Tour(R.string.rest4,R.string.rest4_des,R.drawable.rest4));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.primary_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }


}

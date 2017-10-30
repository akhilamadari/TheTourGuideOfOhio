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


public class ShoppingFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ArrayList<Tour> words = new ArrayList<Tour>();

        words.add(new Tour(R.string.shop1,R.string.shop1_des,R.drawable.shop1));
        words.add(new Tour(R.string.shop2,R.string.shop2_des,R.drawable.shop2));
        words.add(new Tour(R.string.shop3,R.string.shop3_des,R.drawable.shop3));
        words.add(new Tour(R.string.shop4,R.string.shop4_des,R.drawable.shop4));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.primary_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }


}
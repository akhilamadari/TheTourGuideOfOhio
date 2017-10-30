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

public class HotelsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        final ArrayList<Tour> words = new ArrayList<Tour>();

        words.add(new Tour(R.string.hotel1,R.string.hotel1_des,R.drawable.hotel_pic1));
        words.add(new Tour(R.string.hotel2,R.string.hotel2_des,R.drawable.hotel_pic2));
        words.add(new Tour(R.string.hotel3,R.string.hotel3_des,R.drawable.hotel_pic3));
        words.add(new Tour(R.string.hotel4,R.string.hotel4_des,R.drawable.hotel_pic4));

        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.primary_color);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }


}

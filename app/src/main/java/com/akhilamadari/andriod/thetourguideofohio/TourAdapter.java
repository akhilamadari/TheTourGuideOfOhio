package com.akhilamadari.andriod.thetourguideofohio;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by akhilamadari on 10/28/17.
 */

public class TourAdapter extends ArrayAdapter<Tour> {


    private int mColorResourceId;


    public TourAdapter(Context context, ArrayList<Tour> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Tour currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        titleTextView.setText(currentWord.getTitleId());


        TextView desTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        desTextView.setText(currentWord.getdescription1Id());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {

            imageView.setImageResource(currentWord.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        } else {

            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

package com.example.android.miwok;

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
 * Created by caro on 27/12/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;

    public WordAdapter(Context context, ArrayList<Word> pWords, int color) {
        super(context,0, pWords);
        colorResourceId = color;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
       // return super.getView(position,convertView, parent);


        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);

        Word currentWord = getItem(position);
        TextView englishWord = (TextView) listItemView.findViewById(R.id.default_text_view);
        englishWord.setText(currentWord.getEnglishTranslation());

        TextView miworkWord = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miworkWord.setText(currentWord.getMiwokTranslation());

        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);

        if (currentWord.hasImage()) {
            int imageResource = currentWord.getImageId();

            image.setImageResource(imageResource);
            image.setVisibility(View.VISIBLE);
        }
        else
             image.setVisibility(View.GONE);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}

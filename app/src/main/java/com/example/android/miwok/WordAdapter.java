package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by caro on 27/12/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context,0, pWords);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
       // return super.getView(position,convertView, parent);


        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);

        Word currentWord = getItem(position);
        TextView englishWord = (TextView) listItemView.findViewById(R.id.englishWordTextView);
        englishWord.setText(currentWord.getEnglishTranslation());

        TextView miworkWord = (TextView) listItemView.findViewById(R.id.miwokWordTextView);
        miworkWord.setText(currentWord.getMiwokTranslation());

        return listItemView;
    }
}

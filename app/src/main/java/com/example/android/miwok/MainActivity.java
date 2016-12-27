/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //open different activities depending on which textview was clicked
        TextView familymembers_textview = (TextView)findViewById(R.id.family);
        familymembers_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFamilyActivity();
            }
        });

        TextView colors_textview = (TextView)findViewById(R.id.colors);
        colors_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorsActivity();
            }
        });

        TextView numbers_textview = (TextView)findViewById(R.id.numbers);
        numbers_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumbersActivity();
            }
        });

        TextView phrases_textview = (TextView)findViewById(R.id.phrases);
        phrases_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhrasesActivity();
            }
        });
    }


    public void openNumbersActivity (){
        Intent i = new Intent(this,NumbersActivity.class);
        startActivity(i);
    }


    public void openFamilyActivity (){
        Intent i = new Intent(this,FamilyMembersActivity.class);
        startActivity(i);
    }

    public void openColorsActivity (){
        Intent i = new Intent(this,ColorsActivity.class);
        startActivity(i);
    }

    public void openPhrasesActivity (){
        Intent i = new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
}

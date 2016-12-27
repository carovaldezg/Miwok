package com.example.android.miwok;

/**
 * Created by caro on 27/12/16.
 */

public class Word {
    String miwok_translation;
    String english_translation;

    public Word(String miwok, String english){
        this.miwok_translation = miwok;
        this.english_translation = english;
    }

    public String getMiwokTranslation(){
        return miwok_translation;
    }

    public String getEnglishTranslation(){
        return english_translation;
    }
}

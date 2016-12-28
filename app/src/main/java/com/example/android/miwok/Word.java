package com.example.android.miwok;

/**
 * Created by caro on 27/12/16.
 */

public class Word {
    String miwok_translation;
    String english_translation;
    int imageRecourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String miwok, String english, int imgrsc){
        this.miwok_translation = miwok;
        this.english_translation = english;
        this.imageRecourceId = imgrsc;
    }

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

    public int getImageId(){
        return imageRecourceId;
    }

    public boolean hasImage() {
        return imageRecourceId != NO_IMAGE_PROVIDED;
    }
}

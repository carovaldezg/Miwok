package com.example.android.miwok;

/**
 * Created by caro on 27/12/16.
 */

public class Word {
    String miwok_translation;
    String english_translation;
    int imageRecourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    int audioRecourceId = NO_AUDIO_PROVIDED;
    private static final int NO_AUDIO_PROVIDED = -1;


    public Word(String miwok, String english, int imgrsc, int audiorsc){
        this.miwok_translation = miwok;
        this.english_translation = english;
        this.imageRecourceId = imgrsc;
        audioRecourceId = audiorsc;
    }

     public Word(String miwok, String english, int audioRes){
         this.miwok_translation = miwok;
         this.english_translation = english;
         audioRecourceId = audioRes;
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

    public int getAudioId(){
        return audioRecourceId;
    }

    public boolean hasAudio(){
        return imageRecourceId != NO_AUDIO_PROVIDED;
    }
}

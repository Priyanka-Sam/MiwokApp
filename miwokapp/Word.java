package com.example.miwokapp;

public class Word {

    private String englishVersion,miwokVersion;
    private int audioResourceId;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        englishVersion = defaultTranslation;
        miwokVersion = miwokTranslation;
        audioResourceId = audioResourceId;
    }


    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int audioResourceId) {
        englishVersion = defaultTranslation;
        miwokVersion = miwokTranslation;
        imageResourceId = imageResourceId;
        audioResourceId = audioResourceId;
    }


    public String getEnglishVersion()
    {
        return englishVersion;
    }

    public String getMiwokVersion()
    {
        return miwokVersion;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }


    public int getAudioResourceId() {
        return audioResourceId;
    }
}

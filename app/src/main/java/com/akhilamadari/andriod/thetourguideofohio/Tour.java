package com.akhilamadari.andriod.thetourguideofohio;

/**
 * Created by akhilamadari on 10/28/17.
 */

public class Tour {

    private int mTitleId;


    private int mdescription1Id;


    private int mdescription2Id;

    /**
     * Image resource ID
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Tour(int TitleId, int description1Id, int imageResourceId) {
        mTitleId = TitleId;
        mdescription1Id = description1Id;
        mImageResourceId = imageResourceId;

    }


    public int getTitleId() {

        return mTitleId;
    }


    public int getdescription1Id() {

        return mdescription1Id;
    }

    public int getdescription2Id() {

        return mdescription2Id;
    }


    public int getImageResourceId() {

        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}

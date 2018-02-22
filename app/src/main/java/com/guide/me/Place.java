package com.guide.me;

import android.location.Location;


public class Place {

    /** String resource ID for Place name */
    private int PlaceNameId;

    /** String resource ID for Place Adres */
    private int PlaceAdressId;

    /** Image resource ID for the Place */
    private int ImageResourceId ;

    Location cLocation;

    public Place(int mPlaceNameId, int mPlaceAdressId, int mImageResourceId, Location location) {
        this.PlaceNameId = mPlaceNameId;
        this.PlaceAdressId = mPlaceAdressId;this.ImageResourceId = mImageResourceId;
        this.cLocation=location;
    }


    public int getmPlaceNameId() {
        return PlaceNameId;
    }

    public int getmPlaceAdressId() {
        return PlaceAdressId;
    }

    public int getmImageResourceId() {
        return ImageResourceId;
    }

    public Location getcLocation() {
        return cLocation;
    }
}

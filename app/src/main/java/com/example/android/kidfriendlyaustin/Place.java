package com.example.android.kidfriendlyaustin;

/**
 * The Place class represents a place. It contains resource IDs for image, name, information,
 * address, phone, website, and hours for that place.
 */

public class Place {

    // Image resource ID for place
    private int aPlaceImage;

    // String resource IDs for name, information, address, phone, website, and hours for place
    private int aPlaceName;
    private int aPlaceInfo;
    private int aPlaceAddress;
    private int aPlacePhone;
    private int aPlaceWebsite;
    private int aPlaceHours;

    /**
     * Create a new Place object.
     *
     * @param placeImage   Drawable resource ID for an image of the place
     * @param placeName    String resource ID for the name of the place
     * @param placeInfo    String resource ID for information about the place
     * @param placeAddress String resource ID for the address of the place
     * @param placePhone   String resource Id for the phone number of the place
     * @param placeWebsite String resource ID for the website of the place
     * @param placeHours   String resource ID for the hours of the place
     */
    public Place(int placeImage, int placeName, int placeInfo, int placeAddress,
                 int placePhone, int placeWebsite, int placeHours) {
        aPlaceImage = placeImage;
        aPlaceName = placeName;
        aPlaceInfo = placeInfo;
        aPlaceAddress = placeAddress;
        aPlacePhone = placePhone;
        aPlaceWebsite = placeWebsite;
        aPlaceHours = placeHours;
    }

    // Get the drawable resource ID for an image of the place
    public int getPlaceImage() {
        return aPlaceImage;
    }

    // Get the string resource ID for the name of the place
    public int getPlaceName() {
        return aPlaceName;
    }

    // Get the string resource ID for information about the place
    public int getPlaceInfo() {
        return aPlaceInfo;
    }

    // Get the string resource ID for the address of the place
    public int getPlaceAddress() {
        return aPlaceAddress;
    }

    // Get the string resource ID for the phone number the place
    public int getPlacePhone() {
        return aPlacePhone;
    }

    // Get the string resource ID for website about the place
    public int getPlaceWebsite() {
        return aPlaceWebsite;
    }

    // Get the string resource ID for hours about the place
    public int getPlaceHours() {
        return aPlaceHours;
    }

}



package com.example.android.kidfriendlyaustin;

/**
 * The Place class represents a place. It contains resource IDs for image, name, information,
 * address, phone, website, and hours for that place.
 */

public class Place {

    // Image resource ID for place
    private int aPlaceImage;

    // String resource IDs for name, information, address, phone, website, and hours for place
    private String aPlaceName;
    private String aPlaceInfo;
    private String aPlaceAddress;
    private String aPlacePhone;
    private String aPlaceWebsite;
    private String aPlaceHours;

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
    public Place(int placeImage, String placeName, String placeInfo, String placeAddress,
                 String placePhone, String placeWebsite, String placeHours) {
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
    public String getPlaceName() {
        return aPlaceName;
    }

    // Get the string resource ID for information about the place
    public String getPlaceInfo() {
        return aPlaceInfo;
    }

    // Get the string resource ID for the address of the place
    public String getPlaceAddress() {
        return aPlaceAddress;
    }

    // Get the string resource ID for the phone number the place
    public String getPlacePhone() {
        return aPlacePhone;
    }

    // Get the string resource ID for website about the place
    public String getPlaceWebsite() {
        return aPlaceWebsite;
    }

    // Get the string resource ID for hours about the place
    public String getPlaceHours() {
        return aPlaceHours;
    }

}



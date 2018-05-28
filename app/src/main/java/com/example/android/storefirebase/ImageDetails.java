package com.example.android.storefirebase;

public class ImageDetails {
    String name;
    String url;
    String latitude;
    String longitude;

    public ImageDetails() {

    }

    public ImageDetails(String name, String url, String latitude, String longitude) {
        this.name = name;
        this.url = url;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

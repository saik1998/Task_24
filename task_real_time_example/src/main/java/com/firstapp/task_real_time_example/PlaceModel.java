package com.firstapp.task_real_time_example;

public class PlaceModel {
    String mobilenumber,placename;
    int placeimage,callimage,mapimage,linkimage,downarrow;
    boolean expand;
    double longitude,latitude;

    String  link;

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public int getPlaceimage() {
        return placeimage;
    }

    public void setPlaceimage(int placeimage) {
        this.placeimage = placeimage;
    }

    public int getCallimage() {
        return callimage;
    }

    public void setCallimage(int callimage) {
        this.callimage = callimage;
    }

    public int getMapimage() {
        return mapimage;
    }

    public void setMapimage(int mapimage) {
        this.mapimage = mapimage;
    }

    public int getLinkimage() {
        return linkimage;
    }

    public void setLinkimage(int linkimage) {
        this.linkimage = linkimage;
    }

    public int getDownarrow() {
        return downarrow;
    }

    public void setDownarrow(int downarrow) {
        this.downarrow = downarrow;
    }

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public PlaceModel(String mobilenumber, String placename, int placeimage, int callimage, int mapimage,
                      int linkimage, int downarrow, boolean expand, double longitude, double latitude, String link) {
        this.mobilenumber = mobilenumber;
        this.placename = placename;
        this.placeimage = placeimage;
        this.callimage = callimage;
        this.mapimage = mapimage;
        this.linkimage = linkimage;
        this.downarrow = downarrow;
        this.expand = expand;
        this.longitude = longitude;
        this.latitude = latitude;
        this.link = link;
    }
}

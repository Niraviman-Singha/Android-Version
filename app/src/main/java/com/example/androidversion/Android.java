package com.example.androidversion;

public class Android {

    private  String version;
    private String name;
    private String api;
    private  String release;
    private int image;

    public Android() {
    }

    public Android(String version, String name, String api, String release, int image) {
        this.version = version;
        this.name = name;
        this.api = api;
        this.release = release;
        this.image = image;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

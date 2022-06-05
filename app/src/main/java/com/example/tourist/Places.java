package com.example.tourist;

public class Places {
    private int imageProfile;
    private String name,nameDes;
    private int button;



    public Places(int imageProfile, String name, String nameDes, int butt) {
        this.imageProfile = imageProfile;
        this.name = name;
        this.nameDes = nameDes;
        this.button=butt;
    }

    public int getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(int imageProfile) {
        this.imageProfile = imageProfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDes() {
        return nameDes;
    }

    public void setNameDes(String nameDes) {
        this.nameDes = nameDes;
    }
    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }
}

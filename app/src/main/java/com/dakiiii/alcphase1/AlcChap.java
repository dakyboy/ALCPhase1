package com.dakiiii.alcphase1;

public class AlcChap {
    private String name, track, country, email, phoneNumber, slackUsername;

    public AlcChap(String name, String track, String country, String email, String phoneNumber, String slackUsername) {
        this.name = name;
        this.track = track;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.slackUsername = slackUsername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }
}

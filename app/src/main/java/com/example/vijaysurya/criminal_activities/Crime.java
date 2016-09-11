package com.example.vijaysurya.criminal_activities;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by $vijay.surya on 10/09/2016.
 */
public class Crime {

    private UUID uuid;
    private String title;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        uuid = UUID.randomUUID();
        mDate = new Date();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

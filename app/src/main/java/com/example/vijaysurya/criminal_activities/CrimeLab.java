package com.example.vijaysurya.criminal_activities;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by $vijay.surya on 10/09/2016.
 */
public class CrimeLab {

    public static CrimeLab crimeLab;
    private List<Crime> crimeList;

    public static CrimeLab getCrimeLab(Context context){
        if(crimeLab == null){
            crimeLab = new CrimeLab(context);
        }
        return crimeLab;
    }

    private CrimeLab(Context context){
        crimeList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setmSolved(i % 2 == 0); // Every other one
            crimeList.add(crime);
        }
    }

    public List<Crime> getCrimeList(){
        return crimeList;
    }

    public Crime getCrime(UUID uuid){
        for (Crime crime:crimeList){
            if(crime.getUuid().equals(uuid)){
                return crime;
            }
        }
        return null;
    }
}

package com.example.vijaysurya.criminal_activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by $vijay.surya on 10/09/2016.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {

  protected abstract Fragment createFragment();

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_activity_crime);
    FragmentManager fm = getSupportFragmentManager();
    Fragment fragment = fm.findFragmentById(R.id.fragment_container);
    if (fragment == null) {
      fragment = createFragment();
      fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
    }
  }
}

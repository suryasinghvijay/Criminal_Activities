package com.example.vijaysurya.criminal_activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vijaysurya.criminal_activities.Fragments.CrimeFragment;

public class ActivityCrime extends SingleFragmentActivity {

  @Override
  protected Fragment createFragment() {
    return new CrimeFragment();
  }

  /*@Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_activity_crime);
    FragmentManager fragmentManager = getSupportFragmentManager();
    *//*
     * A container view ID serves two purposes: 1> It tells the FragmentManager where in the
     * activity’s view the fragment’s view should appear. 2> It is used as a unique identifier for a
     * fragment in the FragmentManager’s list.
     *//*
    Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
    if (fragment == null) {
      fragment = new CrimeFragment();
    }
    fragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit();

    *//*
     * Now we can summarize the code you added in line 23 from start to finish.
     * First, you ask the FragmentManager for the fragment with a container view ID of R.id.fragment_container. If
     * this fragment is already in the list, the FragmentManager will return it. Why would a
     * fragment already be in the list? The call to CrimeActivity.onCreate(...) could be in response
     * to CrimeActivity being re-created after being destroyed on rotation or to reclaim memory.
     * When an activity is destroyed, its FragmentManager saves out its list of fragments. When the
     * activity is re-created, the new FragmentManager retrieves the list and re-creates the listed
     * fragments to make everything as it was before. On the other hand, if there is no fragment
     * with the given container view ID, then fragment will be null. In this case, you create a new
     * CrimeFragment and a new fragment transaction that adds the fragment to the list
     *//*
  }*/
}

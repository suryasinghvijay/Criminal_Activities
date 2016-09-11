package com.example.vijaysurya.criminal_activities.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.example.vijaysurya.criminal_activities.Crime;
import com.example.vijaysurya.criminal_activities.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CrimeFragment extends Fragment {

  private EditText editText;
  private Button button;
  private CheckBox checkBox;
  /*
   * CrimeFragment is a controller that interacts with model and view objects. Its job is to present
   * the details of a specific crime and update those details as the user changes them.
   */

  private Crime crime;

  public CrimeFragment() {
    // Required empty public constructor
  }


  /*
   * Fragment.onCreate(Bundle) is a public method whereas Activity.onCreate(Bundle) is protected.
   * Fragment.onCreate(...) and other Fragment lifecycle methods must be public because they will be
   * called by whatever activity is hosting the fragment.
   */

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    crime = new Crime();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_crime, container, false);
    Button button = (Button) view.findViewById(R.id.crime_date);
    checkBox = (CheckBox) view.findViewById(R.id.crime_solved);
    checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        checkBox.setChecked(isChecked);
      }
    });
    button.setText(crime.getmDate().toString());
    button.setEnabled(false);
    editText = (EditText) view.findViewById(R.id.crime_title);

    /*
     * Getting references in Fragment.onCreateView(...) works nearly the same as in
     * Activity.onCreate(...). The only difference is that you call View.findViewById(int) on the
     * fragment’s view. The Activity.findViewById(int) method that you used before is a convenience
     * method that calls View.findViewById(int) behind the scenes. The Fragment class does not have
     * a corresponding convenience method, so you have to call the real thing.
     */

    editText.addTextChangedListener(new TextWatcher() {
      @Override
      public void beforeTextChanged(CharSequence s, int start, int count, int after) {

      }

      @Override
      public void onTextChanged(CharSequence s, int start, int before, int count) {
        crime.setTitle(s.toString());
      }

      @Override
      public void afterTextChanged(Editable s) {

      }
    });
    return view;
  }

}

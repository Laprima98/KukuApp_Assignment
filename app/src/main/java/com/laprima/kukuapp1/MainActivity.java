package com.laprima.kukuapp1;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    //public View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    public void selectFrag(View view) {
        //this.view = view;

        Fragment fr;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        if (view == findViewById(R.id.button4)) { //Button 2 pressed
            fr = new HousingForChicken(); //Instantiate Fragment One
            fragmentTransaction.replace(R.id.fragment_place, fr);
            fragmentTransaction.commit();


        } else if (view == findViewById(R.id.button3)) { //Button 1 pressed){                                  //Button 1 pressed
            fr = new FeedingChicken(); //Instantiate Fragment One
            fragmentTransaction.replace(R.id.fragment_place, fr);
            fragmentTransaction.commit();

        }else if (view == findViewById(R.id.button2)) { //Button 1 pressed){                                  //Button 1 pressed
            fr = new Health(); //Instantiate Fragment One
            fragmentTransaction.replace(R.id.fragment_place, fr);
            fragmentTransaction.commit();

        }else if (view == findViewById(R.id.button1)) { //Button 1 pressed){                                  //Button 1 pressed
            fr = new BreedsOfChicken(); //Instantiate Fragment One
            fragmentTransaction.replace(R.id.fragment_place, fr);
            fragmentTransaction.commit();

        }
// Use FragmentManager to create FragmentTransaction


    }
}




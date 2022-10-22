package com.laprima.kukuapp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


public class MainActivity<fr> extends AppCompatActivity {

    private View view;
    private Object FragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //lines added
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView18, new ChickenBreed())
                .addToBackStack(null).commit();
    }




    /**
     * @param view
     */
    public void selectFrag(View view) {
        this.view = view;
        Fragment fr;
        if (view == findViewById(R.id.fragmentContainerView15)) { //Button 2 pressed
            fr = new FeedingChicken(); //Instantiate Fragment One
        } else if (view == findViewById(R.id.fragmentContainerView16)) {
            fr = new Health(); //Instantiate Fragment One
        } else if (view == findViewById(R.id.fragmentContainerView17)) {
            fr = new HousingChicken();
        } else
            fr = new ChickenBreed();

  }


}
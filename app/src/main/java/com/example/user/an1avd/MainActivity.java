package com.example.user.an1avd;
//Package objects contain version information about the implementation and specification
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //AppCompatActivity is a parent class


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
        // This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
        // We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
        // completed.The savedInstanceState Bundle is same as the one used in onCreate().


        super.onCreate(savedInstanceState);
        // call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
    }
}

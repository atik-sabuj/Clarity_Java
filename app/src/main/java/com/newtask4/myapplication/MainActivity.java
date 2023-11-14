package com.newtask4.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


//Clarity dependencies
import com.microsoft.clarity.Clarity;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.models.ApplicationFramework;
import com.microsoft.clarity.models.LogLevel;

import androidx.annotation.Nullable;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    //Clarity Codes and Project ID here
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        ClarityConfig config = new ClarityConfig(
                "joos8fevel",
                null, // Default user id
                LogLevel.None,
                false, // Disallow metered network usage
                true, // Enable web view capturing
                Collections.singletonList("*"), // Allowed domains
                ApplicationFramework.Native);

        Clarity.initialize(getApplicationContext(), config);

    //End of Clarity

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
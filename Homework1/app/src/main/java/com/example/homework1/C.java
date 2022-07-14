package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    private Intent processIntent() {
        Intent i = getIntent();
        int someInt;
        String someString;
        someInt = i.getIntExtra("someInt", 0);
        someString = i.getStringExtra("someString");
        String sayMyFavNumber = someString + someInt;

        Intent resultIntent = new Intent();
        resultIntent.putExtra("sayMyfavNumber", sayMyFavNumber);
        return resultIntent;
    }

    public void onButtonOKClicked(View v) {
        Intent i = getIntent();
        int someInt;
        String someString;
        someInt = i.getIntExtra("someInt", 0);
        someString = i.getStringExtra("someString");
        String sayMyFavNumber = someString + someInt;

        Intent resultIntent = new Intent();
        resultIntent.putExtra("sayMyfavNumber", sayMyFavNumber);
        Log.v("RAZVANTAG","onButtonOKClicked");
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void onButtonCANCELClicked(View v) {
        Intent i = getIntent();
        int someInt;
        String someString;
        someInt = i.getIntExtra("someInt", 0);
        someString = i.getStringExtra("someString");
        String sayMyFavNumber = someString + someInt;

        Intent resultIntent = new Intent();
        resultIntent.putExtra("sayMyfavNumber", sayMyFavNumber);
        Log.v("RAZVANTAG","onButtonCANCELClicked");
        setResult(RESULT_CANCELED, resultIntent);
        finish();
    }
}
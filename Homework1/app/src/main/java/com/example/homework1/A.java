package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("RAZVANTAG","onStart: We are doing Activity A.");
    }

    public void onGoToBButtonClicked(View v) {
        Intent i = new Intent(this, B.class);
        startActivity(i);
    }

    public final int REQUEST_OK_OR_CANCELLED = 7;

    public void onGoToCButtonClicked(View v) {
        Log.v("RAZVANTAG", "goToCButtonClicked");
        Intent i = new Intent(this, C.class);
        i.putExtra("someInt",123);
        i.putExtra("someString", "my fav number is");
        startActivityForResult(i, REQUEST_OK_OR_CANCELLED);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.v("RAZVANTAG", "onActivityResult called");
        String sayMyFavNumber = "";
        sayMyFavNumber = data.getStringExtra("sayMyFavNumber");
        Log.v("RAZVANTAG", sayMyFavNumber);
        if (requestCode == REQUEST_OK_OR_CANCELLED) {
            if (resultCode == RESULT_OK) {
                Log.v("RAZVANTAG","Activity C result seen in A = OK");
            }

            if (resultCode == RESULT_CANCELED) {
                Log.v("RAZVANTAG","Activity C result seen in A = CANCELLED");
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("RAZVANTAG","onResume activity a");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("RAZVANTAG","onPause activity a");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("RAZVANTAG","onStop acitivity a");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("RAZVANTAG","onDestroy activity a");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.v("RAZVANTAG", "changed to landscape orientation");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Log.v("RAZVANTAG", "changed to portrait orientation");
        }
    }
}
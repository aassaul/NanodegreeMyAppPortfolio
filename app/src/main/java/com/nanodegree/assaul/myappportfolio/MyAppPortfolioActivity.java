package com.nanodegree.assaul.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MyAppPortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
    }

    private void showToast(CharSequence message){
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        if( v != null) {
            v.setGravity(Gravity.CENTER);
        }
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
        return true;
    }

    public void onMediaStreamAppButtonClick(View v){
       showToast(getResources().getString(R.string.media_stream_app_message));
    }

    public void onScoresAppButtonClick(View v){
        showToast(getResources().getString(R.string.scores_app_message));
    }

    public void onLibraryAppButtonClick(View v){
        showToast(getResources().getString(R.string.library_app_message));
    }

    public void onAntAppButtonClick(View v){
        showToast(getResources().getString(R.string.ant_app_message));
    }

    public void onMaterializeAppButtonClick(View v){
        showToast(getResources().getString(R.string.materialize_app_message));
    }

    public void onOwnAppButtonClick(View v){
        showToast(getResources().getString(R.string.own_app_button_message));
    }
}

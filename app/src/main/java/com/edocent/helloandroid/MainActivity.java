package com.edocent.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the ListView using the ID
        ListView mobilesList = (ListView) findViewById(R.id.mobilesId);

        //Create an Event Listener
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Log.v(TAG, "--- Item Position is ---"+position);
            }
        };

        mobilesList.setOnItemClickListener(onItemClickListener);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.v(TAG, "In onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.v(TAG, "In onStop");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.v(TAG, "In onStop");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.v(TAG, "In onRestart");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }

    public void clickMe(View view){
        //Toast.makeText(MainActivity.this, "Button Clicked !!", Toast.LENGTH_SHORT).show();

        //Intent intent=new Intent(this, MessageActivity.class);
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, "Hello");
        intent.setType("text/plain");
        startActivity(intent);
    }

    public void sayHello(){

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.v(TAG, "In sayHello");
                Toast.makeText(MainActivity.this, "Do you need any Help ?", Toast.LENGTH_SHORT).show();
            }
        }, 5000);

    }
}

package com.example.p4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Toast.makeText(MainActivity.this,"i am on create",Toast.LENGTH_SHORT).show();

        button = findViewById(R.id.button);

        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.toast_layout));

        final Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });

//        protected void onStart() {
//            Toast.makeText(this, "onStart MainActivity",
//                    Toast.LENGTH_SHORT).show();
//            Log.d(TAG, "onStart MainActivity"); super.onStart();
//        }
//        protected void onResume() {
//            Toast.makeText(this, "onResume MainActivity", Toast.LENGTH_SHORT).show();
//            Log.d(TAG, "onResume MainActivity"); super.onResume();
//        }
//        protected void onPause() {
//            Toast.makeText(this, "onPause MainActivity",
//                    Toast.LENGTH_SHORT).show();
//            Log.d(TAG, "onPause MainActivity"); super.onPause();
//        }
//        protected void onStop() {
//            Toast.makeText(this, "onStop MainActivity",
//                    Toast.LENGTH_SHORT).show();
//            Log.d(TAG, "onStop MainActivity");
//            super.onStop();
//        }
//        protected void onRestart() {
//            Toast.makeText(this, "onRestart MainActivity",
//                    Toast.LENGTH_SHORT).show();
//            Log.d(TAG, "onRestart MainActivity"); super.onRestart();
//        }
//        protected void onDestroy() {
//            Toast.makeText(this, "onDestroy MainActivity",
//                    Toast.LENGTH_SHORT).show();
//            Log.d(TAG, "onDestroy MainActivity"); super.onDestroy();
//        }




    }
}
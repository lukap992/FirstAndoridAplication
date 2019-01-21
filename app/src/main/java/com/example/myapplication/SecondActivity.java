package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity {

    public static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast toast = Toast.makeText(getBaseContext(), "onCreate Druge aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("SecondActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getBaseContext(), "onStart Druge aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("SecondActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getBaseContext(), "onResume Druge aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("SecondActivity", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getBaseContext(), "onStop Druge aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("SecondActivity", "onStop");
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getBaseContext(), "onDestroy Druge aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("SecondActivity", "onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getBaseContext(), "onPause Druge aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("SecondActivity", "onPause");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(getBaseContext(), "onRestart Druge aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("SecondActivity", "onRestart");
    }


    public void btnStartActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void btnOpenCameraClicked(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data != null){
            Toast.makeText(getBaseContext(), data.getDataString(), Toast.LENGTH_SHORT).show();
            Log.i("SecondActivity", "kamera");
        }
    }
}

package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends Activity {

    private static final int PICK_CONTACT_REQUEST = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Toast toast = Toast.makeText(getBaseContext(), "onCreate prve aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("Prva aktivnost" , "onCreate");
    }

    public FirstActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getBaseContext(), "onCreate prve aktivnosti", Toast.LENGTH_SHORT);
        toast.show();


    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(getBaseContext(), "onRestart prve aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("Prva aktivnost" , "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getBaseContext(), "onResume prve aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("Prva aktivnost" , "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getBaseContext(), "onPause prve aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("Prva aktivnost" , "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getBaseContext(), "onStop prve aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("Prva aktivnost" , "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getBaseContext(), "onCreate prve aktivnosti", Toast.LENGTH_SHORT);
        toast.show();
        Log.i("Prva aktivnost" , "onCreate");
    }

    public void prvoDugme(View view){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
    public void onButtonClick(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_PICK);
        intent.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivityForResult(intent, PICK_CONTACT_REQUEST);
    }
    @Override
    protected void onActivityResult(int requestcode, int resultcode, Intent data){
        super.onActivityResult(requestcode, requestcode, data);
        Toast.makeText(getBaseContext(), data.getDataString(), Toast.LENGTH_SHORT).show();
        Log.i("FirstActivity", "kontakti");
   }



}

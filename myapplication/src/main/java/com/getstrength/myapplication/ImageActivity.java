package com.getstrength.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.MyClass;

import java.util.Random;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        MyClass myClass = new MyClass();

// Get an index between 0 and the last index in the messages array
        int randomMsgIndex = new Random().nextInt(myClass.toastMessage.length - 1);
        Toast.makeText(this, myClass.toastMessage[randomMsgIndex], Toast.LENGTH_SHORT).show();
    }
}

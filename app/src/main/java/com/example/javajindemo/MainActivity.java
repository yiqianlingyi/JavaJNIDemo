package com.example.javajindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String test = AndroidJNI.getStringFromNDK();
        Log.i("getJniTest","text ="+test);
        ((TextView)findViewById(R.id.jni_test)).setText(test); //通过JNI修改text。
    }
}

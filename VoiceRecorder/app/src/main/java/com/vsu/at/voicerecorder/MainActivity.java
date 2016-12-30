package com.vsu.at.voicerecorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Audio_Record recorder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recorder = new Audio_Record();
        recorder.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // запуск формы запроса имени, возраста и пола при старте приложения
        Intent intent = new Intent(MainActivity.this, InputActivity.class);
        startActivityForResult(intent, 1);
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) { return; }

        // извлечение значений, введённых пользователем
        String name = data.getStringExtra("name");
    }*/
}

package com.vsu.at.voicerecorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

    TextView nameInput;
    TextView ageInput;
    RadioGroup genderInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        nameInput = (TextView)findViewById(R.id.nameInput);
        ageInput = (TextView)findViewById(R.id.ageInput);
        genderInput = (RadioGroup)findViewById(R.id.genderInput);
    }

    public void onContinueClick(View view) {
        Speaker speaker = Speaker.getInstance();
        speaker.setName(nameInput.getText().toString());
        speaker.setAge(Integer.valueOf(ageInput.getText().toString()));

        int gender = 0;
        if (genderInput.getCheckedRadioButtonId() == R.id.femaleInput)
            gender = 1;

        speaker.setGender(gender);

        Log.d("VOICE", Speaker.getName());
        Log.d("VOICE", String.valueOf(Speaker.getAge()));
        Log.d("VOICE", String.valueOf(Speaker.getGender()));
    }
}

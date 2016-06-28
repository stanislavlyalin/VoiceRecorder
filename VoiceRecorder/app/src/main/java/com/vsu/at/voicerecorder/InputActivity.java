package com.vsu.at.voicerecorder;

import android.content.Intent;
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
        // при клике на "Продолжить" запоминаем параметры, а затем закрываем форму
        Speaker speaker = Speaker.getInstance();
        speaker.setName(nameInput.getText().toString());
        speaker.setAge(Integer.valueOf(ageInput.getText().toString()));
        speaker.setGender((genderInput.getCheckedRadioButtonId() == R.id.femaleInput) ? 1 : 0);

        // возвращаем результат главной форме
        Intent intent = new Intent();
        intent.putExtra("name", speaker.getName());
        intent.putExtra("age", speaker.getAge());
        intent.putExtra("gender", speaker.getGender());
        setResult(RESULT_OK, intent);
        finish();
    }
}

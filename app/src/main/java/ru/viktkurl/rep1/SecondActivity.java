package ru.viktkurl.rep1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static ru.viktkurl.rep1.MainActivity.INTENT_LASTNAME;
import static ru.viktkurl.rep1.MainActivity.INTENT_NAME;
import static ru.viktkurl.rep1.MainActivity.INTENT_SEX;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intentFromMain = getIntent();

        TextView firstNameText = (TextView) findViewById(R.id.firstName);
        TextView lastNameText = (TextView) findViewById(R.id.lastName);
        TextView sexText = (TextView) findViewById(R.id.sex);

        String name = intentFromMain.getStringExtra(INTENT_NAME);
        String lastName = intentFromMain.getStringExtra(INTENT_LASTNAME);
        String sex = intentFromMain.getStringExtra(INTENT_SEX);

        firstNameText.setText(name);
        lastNameText.setText(lastName);
        sexText.setText(sex);
    }
}

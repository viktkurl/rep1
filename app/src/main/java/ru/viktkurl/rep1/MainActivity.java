package ru.viktkurl.rep1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_SEX = "SEX";
    public static final String INTENT_NAME = "NAME";
    public static final String INTENT_LASTNAME = "LASTNAME";

    private Intent intent;

    private EditText name;
    private EditText lastName;

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private RadioButton radioButton2;

    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rad = (RadioButton) v;
            switch (rad.getId()) {
                case R.id.radio1:
                    intent.putExtra(INTENT_SEX, radioButton.getText());
                    break; // Insert here code, what were more usable for you
                case R.id.radio2:
                    intent.putExtra(INTENT_SEX, radioButton2.getText());
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(MainActivity.this, SecondActivity.class);

        name = (EditText) findViewById(R.id.editText1);
        lastName = (EditText) findViewById(R.id.editText2);
        radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioButton = (RadioButton) findViewById(R.id.radio1);
        radioButton.setOnClickListener(radioButtonClickListener);
        radioButton2 = (RadioButton) findViewById(R.id.radio2);
        radioButton2.setOnClickListener(radioButtonClickListener);
    }

    public void sendData(View v) {
        if (name.getText().length() > 0 && lastName.getText().length() > 0
                && radioGroup.getCheckedRadioButtonId() != -1) {
            intent.putExtra(INTENT_NAME, name.getText().toString());
            intent.putExtra(INTENT_LASTNAME, lastName.getText().toString());
            startActivity(intent);
        } else {
            Toast.makeText(this, "Not all fields are filled", Toast.LENGTH_SHORT).show();
        }
    }
}

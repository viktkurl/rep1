package ru.viktkurl.rep1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);
        RadioButton radioButton = (RadioButton) findViewById(R.id.radio1);
        radioButton.setOnClickListener(radioButtonClickListener);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio2);
        radioButton2.setOnClickListener(radioButtonClickListener);
        Button button = (Button) findViewById(R.id.send_button);
    }

    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rad = (RadioButton)v;
            switch (rad.getId()){
                case R.id.radio1: ; break; // Insert here code, what were more usable for you
                case R.id.radio2: ; break;
                default: break;
            }
        }
    };

    public void sendData(View v){
        Toast.makeText(this, "Sending data", Toast.LENGTH_SHORT).show();
    }
}

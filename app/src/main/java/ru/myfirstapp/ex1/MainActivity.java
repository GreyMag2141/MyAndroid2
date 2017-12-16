package ru.myfirstapp.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText input1;
    Button button1;
    TextView output;
    private boolean p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        output = findViewById(R.id.output);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String s1 = input1.getText().toString();
        int x1 = Integer.parseInt(s1);
        switch (v.getId()){
            case R.id.button1:
                output.setText(String.valueOf(x1%10));
                break;
        }
    }
}
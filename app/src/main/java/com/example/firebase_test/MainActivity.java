package com.example.firebase_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button main_button;
    private TextView textView;
    private ImageView imageView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_button = findViewById(R.id.main_button);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        editText =findViewById(R.id.editText);

        main_button.setOnClickListener(this);
        imageView.setOnClickListener(this);
        editText.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.main_button:
                String s = editText.getText().toString();

                imageView.setImageResource(R.drawable.ic_launcher_background);
                if(s.isEmpty())
                {
                    textView.setText("");
                    Toast.makeText(getApplicationContext(),"Empty Field",Toast.LENGTH_LONG).show();
                }
                else{
                    textView.setText(s);
                    Intent intent = new Intent(MainActivity.this,second_Activity.class);
                    intent.putExtra("Passed",s);
                    startActivity(intent);
                }
                break;

        }

    }
}

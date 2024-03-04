package com.example.flashlight_morse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_1;
    private FlashClass flashClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        button_1 = findViewById(R.id.button_1);
        flashClass = new FlashClass(this);
    }

    public void onClickFlash(View view){
        if (flashClass.isFlash_status()){
            flashClass.Off();
        }
        else{
            flashClass.On();
        }
    }

}
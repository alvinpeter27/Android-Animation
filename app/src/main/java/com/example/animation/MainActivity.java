package com.example.animation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    ImageView anm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        anm=(ImageView)findViewById(R.id.anm);
        anm.setBackgroundResource(R.drawable.animation);

    }
    public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        AnimationDrawable frameAnimation =
                (AnimationDrawable) anm.getBackground();


        if(hasFocus) {
            frameAnimation.start();

        } else {
            frameAnimation.stop();
        }
    }

}




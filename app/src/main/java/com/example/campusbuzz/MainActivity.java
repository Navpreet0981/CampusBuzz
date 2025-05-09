package com.example.campusbuzz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottieView = findViewById(R.id.lottieView); // Initialize after setContentView

        // Start the animation
        lottieView.playAnimation();

        // Handler to run the code after 5 seconds (5000 milliseconds)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Navigate to LoginSignupActivity after 5 seconds
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish(); // Optional: Finish the MainActivity so it's not in the backstack
            }
        }, 4000); // 5000 milliseconds = 5 seconds
    }
}

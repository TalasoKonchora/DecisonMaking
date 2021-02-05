package talaso.learning.decisonmaking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnask = findViewById(R.id.btnAsk);
        final ImageView imgDecion = findViewById(R.id.imgBall1);
        final int[] decisions = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,

        };

        //Listen Button
        btnask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random generatednumber = new Random();
                int number = generatednumber.nextInt(5);
                imgDecion.setImageResource(decisions [number]);
            }
        });
    }
}
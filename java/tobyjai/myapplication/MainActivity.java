package tobyjai.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String TAG = "MainActivity";

    ImageButton myImageButton;
    Button btndoSth;
    Button buttonRecord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Application is running");

        Button btnDoSth = (Button)findViewById(R.id.btnDoSth);

        btnDoSth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button was clicked");
                startActivity(new Intent(MainActivity.this, GalleryActivity.class));

        Button buttonRecord = (Button)findViewById(R.id.buttonRecord);

        buttonRecord.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sub1Activity.class));

        myImageButton = (ImageButton) findViewById(R.id.imageButton);

        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentLoadNewActivity = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(intentLoadNewActivity);
                Toast.makeText(MainActivity.this,"About US!", Toast.LENGTH_SHORT).show();
            }
        });

            }
        });

    }
});

    }
}

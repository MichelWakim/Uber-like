package android.example.uber_like;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //creating the 2 buttons
    private Button iDriver, iCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relating the the private buttons to the GUI buttons
        iDriver = (Button) findViewById(R.id.driver);
        iCustomer = (Button) findViewById(R.id.customer);

        //function to open a new view by clicking the button
        iDriver.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
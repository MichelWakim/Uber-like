package android.example.uber_like;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DriverLoginActivity extends AppCompatActivity {
    //creating private variables for the buttons and the text editor
    private EditText myEmail, myPassword;
    private Button myLogin, myRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        //relating the the private texts to the GUI buttons
        myEmail = (EditText) findViewById(R.id.email);
        myPassword = (EditText) findViewById(R.id.password);

        //relating the the private buttons to the GUI buttons
        myLogin = (Button) findViewById(R.id.login);
        myRegistration = (Button) findViewById(R.id.registration);

    }
}
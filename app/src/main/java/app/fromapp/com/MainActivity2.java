package app.fromapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvFirstName;
    private TextView tvLastName;
    private TextView tvDob;
    private TextView tvEmail;
    private TextView tvMale;
    private TextView tvFemale;
    private String firstName1;
    private String lastName1;
    private String dob1;
    public static final String FNAME = "FNAME";
    public static final String LNAME = "LNAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvFirstName = findViewById(R.id.fname);
        tvLastName=findViewById(R.id.lname);
        Intent intent = getIntent();

        firstName1 = intent.getStringExtra(FNAME);
        tvFirstName.setText("   " + firstName1);

        lastName1 = intent.getStringExtra(LNAME);
        tvLastName.setText("   " + lastName1);
    }
}
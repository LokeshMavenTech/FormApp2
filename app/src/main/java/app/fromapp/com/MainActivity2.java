package app.fromapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView firstName;
    private String firstName1;
     public static final String FNAME="FNAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstName= findViewById(R.id.fname);
        Intent intent= getIntent();
        firstName1=intent.getStringExtra(FNAME);
        firstName.setText("A"+firstName);
    }
}
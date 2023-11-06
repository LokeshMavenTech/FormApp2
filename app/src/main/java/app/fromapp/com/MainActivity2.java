package app.fromapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView firstNameView;
    private TextView lastNameView;
    private TextView dobView;
    private TextView emailView;
    private TextView genderView;
    //private RadioGroup radioGroup;
//    private  TextView female;
    private TextView buldingNameView;
    private TextView streetNameView;
    private TextView cityNameView;
    private TextView stateNameView;
    private TextView pinNumberView;
    private TextView contactNumberView;
    private TextView universityView1;
    private TextView passingdateView1;
    private TextView acchiveView1;
    private TextView universityView2;
    private TextView passingdateView2;
    private TextView acchiveView2;
    private TextView universityView3;
    private TextView passingdateView3;
    private TextView acchiveView3;
    private TextView programingViewl1;
    private TextView programingViewl2;
    private TextView programingViewl3;

    private String firstName1;
    private String lastName1;
    private String dob1;
    private String email1;
    private String gender01;
    private String buldingName1;
    private String streetName1;
    private String cityName1;
    private String stateName1;
    private String pinNumber1;
    private String contactNumber1;
    private String university11;
    private String passingdate11;
    private String achive11;
    private String university12;
    private String passingdate12;
    private String achive12;
    private String university13;
    private String passingdate13;
    private String achive13;
    private String programing01;
    private String programing02;
    private String programing03;


    public static final String FNAME = "FNAME";
    public static final String LNAME = "LNAME";
    public static final String DOB = "DOB";
    public static final String EMAIL = "EMAIL";
    public static final String GENDER = "GENDER";
    public static final String BNAME = "BNAME";
    public static final String STREETNAME = "STREETNAME";
    public static final String CITYNAME = "CITYNAME";
    public static final String STATE = "STATE";
    public static final String PIN = "PIN";
    public static final String CONTACTN = "CONTACTN";
    public static final String UNIVERAITY1 = "UNIVERAITY1";
    public static final String PASSINGDATE1 = "PASSINGDATE1";
    public static final String ACHIVE1 = "ACHIVE1";
    public static final String UNIVERAITY2 = "UNIVERAITY2";
    public static final String PASSINGDATE2 = "PASSINGDATE2";
    public static final String ACHIVE2 = "ACHIVE2";
    public static final String UNIVERAITY3 = "UNIVERAITY3";
    public static final String PASSINGDATE3 = "PASSINGDATE3";
    public static final String ACHIVE3 = "ACHIVE3";
    public static final String PROGL1 = "PROGL1";
    public static final String PROGL2 = "PROGL2";
    public static final String PROGL3 = "PROGL3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstNameView = findViewById(R.id.fname);
        lastNameView = findViewById(R.id.lname);
        dobView = findViewById(R.id.dob);
        emailView = findViewById(R.id.email);
        genderView = findViewById(R.id.gender11);

        buldingNameView = findViewById(R.id.bulding_no);
        streetNameView = findViewById(R.id.street_name);
        cityNameView = findViewById(R.id.city);
        stateNameView = findViewById(R.id.state);
        pinNumberView = findViewById(R.id.pin);
        contactNumberView = findViewById(R.id.contact_no);
        universityView1 = findViewById(R.id.university1);
        passingdateView1 = findViewById(R.id.passing_date1);
        acchiveView1 = findViewById(R.id.achive1);
        universityView2 = findViewById(R.id.university2);
        passingdateView2 = findViewById(R.id.passing_date2);
        acchiveView2 = findViewById(R.id.achive2);
        universityView3 = findViewById(R.id.university3);
        passingdateView3 = findViewById(R.id.passing_date3);
        acchiveView3 = findViewById(R.id.achive3);
        programingViewl1 = findViewById(R.id.programingl1);
        programingViewl2 = findViewById(R.id.programingl2);
        programingViewl3 = findViewById(R.id.programingl3);


        Intent intent = getIntent();
        // personal details
        firstName1 = intent.getStringExtra(FNAME);
        firstNameView.setText("  " + firstName1);

        lastName1 = intent.getStringExtra(LNAME);
        lastNameView.setText("  " + lastName1);

        dob1 = intent.getStringExtra(DOB);
        dobView.setText("  " + dob1);

        email1 = intent.getStringExtra(EMAIL);
        emailView.setText("  " + email1);

        gender01 = intent.getStringExtra(GENDER);
        genderView.setText(" " + gender01);

        // address details
        buldingName1 = intent.getStringExtra(BNAME);
        buldingNameView.setText("  " + buldingName1);

        streetName1 = intent.getStringExtra(STREETNAME);
        streetNameView.setText("  " + streetName1);

        cityName1 = intent.getStringExtra(CITYNAME);
        cityNameView.setText("  " + cityName1);

        stateName1 = intent.getStringExtra(STATE);
        stateNameView.setText("  " + stateName1);

        pinNumber1 = intent.getStringExtra(PIN);
        pinNumberView.setText("  " + pinNumber1);

        contactNumber1 = intent.getStringExtra(CONTACTN);
        contactNumberView.setText("  " + contactNumber1);
        //university 1
        university11 = intent.getStringExtra(UNIVERAITY1);
        universityView1.setText("  " + university11);

        passingdate11 = intent.getStringExtra(PASSINGDATE1);
        passingdateView1.setText("  " + passingdate11);

        achive11 = intent.getStringExtra(ACHIVE1);
        acchiveView1.setText("  " + achive11);
        // university2
        university12 = intent.getStringExtra(UNIVERAITY2);
        universityView2.setText("  " + university12);

        passingdate12 = intent.getStringExtra(PASSINGDATE2);
        passingdateView2.setText("  " + passingdate12);

        achive12 = intent.getStringExtra(ACHIVE2);
        acchiveView2.setText("  " + achive12);
        // university 3
        university13 = intent.getStringExtra(UNIVERAITY3);
        universityView3.setText("  " + university13);

        passingdate13 = intent.getStringExtra(PASSINGDATE3);
        passingdateView3.setText("  " + passingdate13);

        achive13 = intent.getStringExtra(ACHIVE3);
        acchiveView3.setText("  " + achive13);
        // programing language
        programing01 = intent.getStringExtra(PROGL1);
        programingViewl1.setText(" " + programing01);

        programing02 = intent.getStringExtra(PROGL2);
        programingViewl2.setText(" " + programing02);

        programing03 = intent.getStringExtra(PROGL3);
        programingViewl3.setText(" " + programing03);

    }
}
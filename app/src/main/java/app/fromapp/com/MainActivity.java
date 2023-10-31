package app.fromapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.view.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextText4, editTextText5, editTextDate, editTextTextEmailAddress, editTextText9, editTextText10, editTextText11, editTextText12, editTextTextPostalAddress, editTextPhone, editTextText14, editTextDate2, editTextNumberDecimal, editTextText15, editTextNumberDecimal3, editTextDate3, editTextText17, editTextNumberDecimal2, editTextText16;
    EditText editTextText20, editTextText21, editTextText22;
    Button button2;
    CheckBox checkBox, checkBox2;
    private String firstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText4 =findViewById(R.id.editTextText4);// First Name
        editTextText5 = findViewById(R.id.editTextText5);//Last Name
        editTextDate = findViewById(R.id.editTextDate);//DOB
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);// Email Addess
        editTextText9 =findViewById(R.id.editTextText9);//Bulding No
        editTextText10 =findViewById(R.id.editTextText10);//Strit Name
        editTextText11 = findViewById(R.id.editTextText11);//City
        editTextText12 =findViewById(R.id.editTextText12);//State
        editTextTextPostalAddress = findViewById(R.id.editTextTextPostalAddress);//pin
        editTextPhone =  findViewById(R.id.editTextPhone);// contact Number

        // for university 1
        editTextText14 =  findViewById(R.id.editTextText14);
        editTextDate2 = findViewById(R.id.editTextDate2);
        editTextNumberDecimal =findViewById(R.id.editTextNumberDecimal);
        // for university 2
        editTextText15 =  findViewById(R.id.editTextText15);
        editTextText16 =findViewById(R.id.editTextText16);
        editTextNumberDecimal2 =findViewById(R.id.editTextNumberDecimal2);
        // for university 3
        editTextText17 =findViewById(R.id.editTextText17);
        editTextDate3 =findViewById(R.id.editTextDate2);
        editTextNumberDecimal3 =findViewById(R.id.editTextNumberDecimal3);
        button2 = findViewById(R.id.button2);
        checkBox =findViewById(R.id.checkBox);
        checkBox2 =findViewById(R.id.checkBox2);

        // programing Language
        editTextText20 =findViewById(R.id.editTextText20);
        editTextText21 =findViewById(R.id.editTextText21);
        editTextText22 =findViewById(R.id.editTextText22);

        boolean isChecked = checkBox.isChecked();
        boolean isChecked2 = checkBox2.isChecked();


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = editTextText4.getText().toString();
                String lname = editTextText5.getText().toString();
                String dob = editTextDate.getText().toString();
                String email = editTextTextEmailAddress.getText().toString();
                String buldingNo = editTextText9.getText().toString();
                String strit = editTextText10.getText().toString();
                String city = editTextText11.getText().toString();
                String pin = editTextTextPostalAddress.getText().toString();
                String state = editTextText12.getText().toString();
                String contactno = editTextPhone.getText().toString();
                String u1 = editTextText14.getText().toString();
                String passd1 = editTextDate2.getText().toString();
                String achive1 = editTextNumberDecimal.getText().toString();
                String u2 = editTextText15.getText().toString();
                String passd2 = editTextText16.getText().toString();
                String achive2 = editTextNumberDecimal2.getText().toString();
                String u3 = editTextText17.getText().toString();
                String passd3 = editTextDate3.getText().toString();
                String achive3 = editTextNumberDecimal3.getText().toString();
                String prog = editTextText20.getText().toString();
                String prog1 = editTextText21.getText().toString();
                String prog3 = editTextText22.getText().toString();

                validateinfo(fname, lname, dob, buldingNo, strit,city,state, pin, contactno, u1, passd1, achive1, u2, passd2, achive2, u3, passd3, achive3, prog, prog1, prog3);
                validateinfo1(email);
                sendData();

            }
        });
    }

    private Boolean validateinfo(String fname, String lname, String dob, String buldingNo, String strit,String city, String state,String pin,String contactno, String u1, String passd1, String achive1, String u2, String passd2, String achive2, String u3, String passd3, String achive3, String prog, String prog1, String prog3) {
        // First Name
        if (fname.length() == 0) {
            editTextText4.requestFocus();
            editTextText4.setError("Please Enter First Name");
            return false;
        } else if (!fname.matches("^[a-zA-Z]*$")) {
            editTextText4.requestFocus();
            editTextText4.setError("Please Enter Character");
            return false;
        }

        // Last Name
        else if (lname.length() == 0) {
            editTextText5.requestFocus();
            editTextText5.setError("Please Enter Last Name");
            return false;
        } else if (!lname.matches("^[a-zA-Z]*$")) {
            editTextText5.requestFocus();
            editTextText5.setError("Please Enter Character");
            return false;
        }

        //Bulding No

        else if (buldingNo.length() == 0) {
            editTextText9.requestFocus();
            editTextText9.setError("Please Enter Bulding No");
            return false;
        }
//        else if (!buldingNo.matches("[a-zA-Z0-9]")) {
//            editTextText9.requestFocus();
//            editTextText9.setError("Please Enter Valid Bulding No");
//            return false;
//        }

        //Street
        else if (strit.length() == 0 ) {
            editTextText10.requestFocus();
            editTextText10.setError("Please Enter Steeet");
            return false;
        } else if (!strit.matches("^[a-zA-Z]*$")) {
            editTextText10.requestFocus();
            editTextText10.setError("Please Enter Valid Street Name");
            return false;
        }
        //city
        else if (city.length() == 0) {
            editTextText11.requestFocus();
            editTextText11.setError("Please Enter City");
            return false;
        } else if (!city.matches("^[a-zA-Z]*$")) {
            editTextText11.requestFocus();
            editTextText11.setError("Please Enter Valid City");
            return false;
        }
        //State
        else if (state.length() == 0) {
            editTextText12.requestFocus();
            editTextText12.setError("Please Enter State");
            return false;
        } else if (!state.matches("^[a-zA-Z]*$")) {
            editTextText12.requestFocus();
            editTextText12.setError("Please Enter Valid State");
            return false;
        }
        //pin
        else if (pin.length() == 0) {
            editTextTextPostalAddress.requestFocus();
            editTextTextPostalAddress.setError("Please Enter Pin Code");
            return false;
        } else if (!pin.matches("^[1-9]{1}[0-9]{2}\\\\s{0, 1}[0-9]{3}$")) {
            editTextTextPostalAddress.requestFocus();
            editTextTextPostalAddress.setError("Please Enter Valid Pin");
            return false;
        }
        // Contact no
        else if (contactno.length() == 0) {
            editTextPhone.requestFocus();
            editTextPhone.setError("Please Enter Enter Phone Number");
            return false;
        } else if (!contactno.matches("^[0-9]{10,13}$")) {
            editTextPhone.requestFocus();
            editTextPhone.setError("Please Enter Valid Phone Number");
            return false;
        }
        //University Name1
        else if (u1.length() == 0) {
            editTextText14.requestFocus();
            editTextText14.setError("Please Enter University Name");
            return false;
        } else if (u1.matches("^[a-zA-Z]*$")) {
            editTextText14.requestFocus();
            editTextText14.setError("Please Enter Valid University Name");
            return false;
        }
        //1mark
        else if (achive1.length() >= 3) {
            editTextNumberDecimal.requestFocus();
            editTextNumberDecimal.setError("Please Enter Mark");
            return false;
        }
        // University name2
        else if (u2.length() == 0) {
            editTextText15.requestFocus();
            editTextText15.setError("Please Enter (2)University Name");
            return false;
        } else if (u2.matches("^[a-zA-Z]*$")) {
            editTextText15.requestFocus();
            editTextText15.setError("Please Enter (2)Valid University Name");
            return false;
        }
        // University name3
        else if (u3.length() == 0) {
            editTextText17.requestFocus();
            editTextText17.setError("Please Enter (3)University Name");
            return false;
        } else if (u3.matches("^[a-zA-Z]*$")) {
            editTextText17.requestFocus();
            editTextText17.setError("Please Enter (3)Valid University Name");
            return false;
        }
        // Programing Language
        else if (prog.length() == 0) {
            editTextText17.requestFocus();
            editTextText17.setError("Please Enter Programing Language");
            return false;
        } else if (prog1.length() == 0) {
            editTextText17.requestFocus();
            editTextText17.setError("Please Enter Programing Language");
            return false;
        } else if (prog3.length() == 0) {
            editTextText17.requestFocus();
            editTextText17.setError("Please Enter Programing Language");
            return false;
        }

        return true;
    }

    private Boolean validateinfo1(String email) {
        // Email id
        if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Email Validation SuccessFully", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    public void sendData() {
        firstName= editTextText4.getText().toString().trim();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra(MainActivity2.FNAME,firstName);
        startActivity(intent);
    }

}



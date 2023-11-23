package app.fromapp.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.SimpleDateFormat;
import android.util.Log;
import android.util.Patterns;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.CheckBox;
import android.view.*;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Locale;

import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class SecondActivity extends AppCompatActivity {
    private TextInputEditText editTextText4;
    private EditText editTextText5;
    private TextInputEditText date_of_birthui;
    int year;
    int month;
    int day;
    private TextInputEditText emailid;
    private TextInputEditText bulding_name;
    private TextInputEditText street_name;
    private TextInputEditText city_name;
    private AutoCompleteTextView state_auto_complete_text;
    private TextInputEditText pin_number;
    private EditText editTextPhone;
    private EditText editTextText14;
    private EditText editTextDate2;
    private EditText editTextNumberDecimal;
    private EditText editTextText15;
    private EditText editTextNumberDecimal3;
    private EditText editTextDate3;
    //maatrial ui date
    private TextInputEditText date_of_birth;
    private TextInputEditText passing_date001;
    private TextInputEditText passing_date002;
    private TextInputEditText passing_date003;

    private EditText editTextText17;
    private EditText editTextNumberDecimal2;
    private EditText editTextText16;
    private EditText editTextText20;
    private EditText editTextText21;
    private EditText editTextText22;
    private Button button2;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private EditText genderOutPut;
    private RatingBar ratingBar;
    private RatingBar ratingBar1;
    private RatingBar ratingBar2;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String genderM;
    private String buldingName;
    private String streetName;
    private String cityName;
    private String stateName;
    private String pinNumber;
    private String contactNumber;
    private String university01;
    private String passingDate01;
    private String achive01;
    private String university02;
    private String passingDate02;
    private String achive02;
    private String university03;
    private String passingDate03;
    private String achive03;
    private String programingL1;
    private String programingL2;
    private String programingL3;

//LOGOUT
    AppCompatButton logout_btn;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    ////////////////////
    //Matrial Ui Gender
    String[] item={"Male","Female"};
    AutoCompleteTextView autoCompleteTextView ;
    ArrayAdapter<String>adapterItem;
    //Matrial Ui State
    String[]stateItam={
            "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
    AutoCompleteTextView stateAutoCompleteTextView;
    ArrayAdapter<String>stateAdapterItem;
    //Matrial Ui institute1
    String[] Qualification={"PG","UG","SCHOOL"};
    AutoCompleteTextView qualificationAutoCompleteTextView;
    ArrayAdapter<String>qualificationAdapterItem;
    //Matrial Ui institute2
    String[] Qualification2={"PG","UG","SCHOOL"};
    AutoCompleteTextView qualification2AutoCompleteTextView;
    ArrayAdapter<String>qualification2AdapterItem;
    //Matrial Ui institute3
    String[] Qualification3={"PG","UG","SCHOOL"};
    AutoCompleteTextView qualification3AutoCompleteTextView;
    ArrayAdapter<String>qualification3AdapterItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //logout
        preferences=getSharedPreferences("MyPreferences",MODE_PRIVATE);
        editor=preferences.edit();
        logout_btn=findViewById(R.id.logout_btn);
        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.clear();
                editor.commit();
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        editTextText4 = findViewById(R.id.editTextText4);// First Name
        editTextText5 = findViewById(R.id.editTextText5);//Last Name
        date_of_birthui = findViewById(R.id.date_of_birthui);//DOB
        emailid = findViewById(R.id.emailid);// Email Addess
        bulding_name = findViewById(R.id.bulding_name);//Bulding No
        street_name = findViewById(R.id.street_name);//Strit Name
        city_name = findViewById(R.id.city_name);//City
        state_auto_complete_text = findViewById(R.id.state_auto_complete_text);//State
        pin_number = findViewById(R.id.pin_number);//pin
        editTextPhone = findViewById(R.id.editTextPhone);// contact Number
        // for university 1
        editTextText14 = findViewById(R.id.editTextText14);
        editTextDate2 = findViewById(R.id.editTextDate2);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        // for university 2
        editTextText15 = findViewById(R.id.editTextText15);
        editTextText16 = findViewById(R.id.editTextText16);
        editTextNumberDecimal2 = findViewById(R.id.editTextNumberDecimal2);
        // for university 3
        //matrial ui date
        date_of_birth=findViewById(R.id.date_of_birthui);
        passing_date001=findViewById(R.id.passing_date001);
        passing_date002=findViewById(R.id.passing_date002);
        passing_date003=findViewById(R.id.passing_date003);
        editTextText17 = findViewById(R.id.editTextText17);
        editTextDate3 = findViewById(R.id.editTextDate3);
        editTextNumberDecimal3 = findViewById(R.id.editTextNumberDecimal3);
        button2 = findViewById(R.id.button2);
        // programing Language
        editTextText20 = findViewById(R.id.editTextText20);
        editTextText21 = findViewById(R.id.editTextText21);
        editTextText22 = findViewById(R.id.editTextText22);
        //find rating bar id
        ratingBar = findViewById(R.id.ratingBar);
        ratingBar1 = findViewById(R.id.ratingBar1);
        ratingBar2 = findViewById(R.id.ratingBar2);
        // Radio Group
        radioGroup = findViewById(R.id.radioGroup);
        genderOutPut = findViewById(R.id.genderOutPut);
        Button buttonapplay = findViewById(R.id.button);

        // matrial ui gender
        autoCompleteTextView= findViewById(R.id.auto_complete_text);
        adapterItem =new ArrayAdapter<String>(this,R.layout.list_item,item);
        autoCompleteTextView.setAdapter(adapterItem);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(SecondActivity.this, "Gender "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        // matrial ui State
        stateAutoCompleteTextView=findViewById(R.id.state_auto_complete_text);
        stateAdapterItem=new ArrayAdapter<String>(this,R.layout.list_item,stateItam);
        stateAutoCompleteTextView.setAdapter(stateAdapterItem);
        stateAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String stateItam=parent.getItemAtPosition(position).toString();
                Toast.makeText(SecondActivity.this, "State "+stateItam, Toast.LENGTH_SHORT).show();
            }
        });

        // matrial ui institude

        qualificationAutoCompleteTextView=findViewById(R.id.qualification_auto_complete_text);
        qualificationAdapterItem=new ArrayAdapter<String>(this,R.layout.list_item,Qualification);
        qualificationAutoCompleteTextView.setAdapter(qualificationAdapterItem);
        qualificationAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Qualification=parent.getItemAtPosition(position).toString();
                Toast.makeText(SecondActivity.this, "Qualification  "+Qualification, Toast.LENGTH_SHORT).show();
            }
        });
        // matrial ui institude2

        qualification2AutoCompleteTextView=findViewById(R.id.qualification2_auto_complete_text);
        qualification2AdapterItem=new ArrayAdapter<String>(this,R.layout.list_item,Qualification2);
        qualification2AutoCompleteTextView.setAdapter(qualification2AdapterItem);
        qualification2AutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Qualification2=parent.getItemAtPosition(position).toString();
                Toast.makeText(SecondActivity.this, "Qualification  "+Qualification2, Toast.LENGTH_SHORT).show();
            }
        });
        // matrial ui institude2

        qualification3AutoCompleteTextView=findViewById(R.id.qualification3_auto_complete_text);
        qualification3AdapterItem=new ArrayAdapter<String>(this,R.layout.list_item,Qualification3);
        qualification3AutoCompleteTextView.setAdapter(qualification3AdapterItem);
        qualification3AutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Qualification2=parent.getItemAtPosition(position).toString();
                Toast.makeText(SecondActivity.this, "Qualification  "+Qualification3, Toast.LENGTH_SHORT).show();
            }
        });
        buttonapplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                genderOutPut.setText("  " + radioButton.getText());

            }
        });
        final Calendar calendar = Calendar.getInstance();
        date_of_birthui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        date_of_birthui.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        editTextDate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        editTextDate2.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });


        editTextText16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        editTextText16.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        editTextDate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        editTextDate3.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        // matrial ui date of birth
        date_of_birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        date_of_birth.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        // matrial ui passing date1
        passing_date001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        passing_date001.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        // matrial ui passing date2
        passing_date002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        passing_date002.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        // matrial ui passing date3
        passing_date003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(SecondActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String formattedDate = String.format(Locale.getDefault(), "%04d-%02d-%02d", year, month + 1, dayOfMonth);
                        passing_date003.setText(formattedDate);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //personal details
                String fname = editTextText4.getText().toString();
                String lname = editTextText5.getText().toString();
                String dob = date_of_birthui.getText().toString();
                String email = emailid.getText().toString();
                String gender1 = genderOutPut.getText().toString();
                //address details
                String buldingNo = bulding_name.getText().toString();
                String strit = street_name.getText().toString();
                String city = city_name.getText().toString();
                String pin = pin_number.getText().toString();
                String state = state_auto_complete_text.getText().toString();
                String contactno = editTextPhone.getText().toString();
                //university details
                String u1 = editTextText14.getText().toString();
                String passd1 = editTextDate2.getText().toString();
                String achive1 = editTextNumberDecimal.getText().toString();
                String u2 = editTextText15.getText().toString();
                String passd2 = editTextText16.getText().toString();
                String achive2 = editTextNumberDecimal2.getText().toString();
                String u3 = editTextText17.getText().toString();
                String passd3 = editTextDate3.getText().toString();
                String achive3 = editTextNumberDecimal3.getText().toString();
                //programing language details
                String prog = editTextText20.getText().toString();
                String prog1 = editTextText21.getText().toString();
                String prog3 = editTextText22.getText().toString();
                //after validation go to second page
                boolean validated = validateinfo(fname, lname, dob, gender1, buldingNo, strit, city, state, pin, contactno, u1, passd1, achive1, u2, passd2, achive2, u3, passd3, achive3, prog, prog1, prog3, email);
                if (validated) {// if all validation true then go to second activity
                    sendData();
                }
            }
        });

    }

    //Radio Button
    public void cheackButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this, "Selected Gender" + radioButton, Toast.LENGTH_SHORT).show();
    }

    private Boolean validateinfo(String fname, String lname, String dob, String gender1, String buldingNo, String strit, String city, String state, String pin, String contactno, String u1, String passd1, String achive1, String u2, String passd2, String achive2, String u3, String passd3, String achive3, String prog, String prog1, String prog3, String email) {
        // First Name
        if (fname.length() == 0) {
            editTextText4.requestFocus();
            editTextText4.setError("Please Enter First Name");
            return false;
        } else if (!fname.matches("^[A-Za-z\\\\s-]+$")) {
            editTextText4.requestFocus();
            editTextText4.setError("Please Enter Character");
            return false;
        }
        // Last Name
        else if (lname.length() == 0) {
            editTextText5.requestFocus();
            editTextText5.setError("Please Enter Last Name");
            return false;
        } else if (!lname.matches("^[A-Za-z\\\\s-]+$")) {
            editTextText5.requestFocus();
            editTextText5.setError("Please Enter Character");
            return false;
        }
        //date of birth
        else if (dob.length() == 0) {
            date_of_birthui.requestFocus();
            date_of_birthui.setError("Please Enter Date Of Birth");
            return false;
        }
        else if (!dob.matches("^(19[0-9]{2}|200[0-2])-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$")) {
            date_of_birthui.requestFocus();
            date_of_birthui.setError("Please Valid Date Of Birth");
            return false;
        }
        // gender validation
        else if (gender1.length() == 0) {
            genderOutPut.requestFocus();
            genderOutPut.setError("Please Enter Gender");
            return false;
        }
        //Bulding No
        else if (buldingNo.length() == 0) {
            bulding_name.requestFocus();
            bulding_name.setError("Please Enter Bulding No");
            return false;
        }
//        else if (!buldingNo.matches("^[A-Za-z0-9\\\\s/#]+$")) {
//            bulding_name.requestFocus();
//            bulding_name.setError("Please Enter Valid Bulding No");
//            return false;
//        }
        //Street
        else if (strit.length() == 0) {
            street_name.requestFocus();
            street_name.setError("Please Enter Steeet");
            return false;
        }
//        else if (!strit.matches("^[A-Za-z0-9\\\\.\\\\s\\\\-\\\\']+")) {
//            street_name.requestFocus();
//            street_name.setError("Please Enter Valid Street Name");
//            return false;
//        }
        //city
        else if (city.length() == 0) {
            city_name.requestFocus();
            city_name.setError("Please Enter City");
            return false;
        } else if (!city.matches("^[A-Za-z\\\\s-]+$")) {
            city_name.requestFocus();
            city_name.setError("Please Enter Valid City");
            return false;
        }
        //State
        else if (state.length() == 0) {
            state_auto_complete_text.requestFocus();
            state_auto_complete_text.setError("Please Enter State");
            return false;
        } else if (!state.matches("^[A-Za-z\\\\s-]+$")) {
            state_auto_complete_text.requestFocus();
            state_auto_complete_text.setError("Please Enter Valid State");
            return false;
        }
        //pin
        else if (pin.length() == 0) {
            pin_number.requestFocus();
            pin_number.setError("Please Enter Pin Code");
            return false;
        } else if (!pin.matches("^[0-9]{6}$")) {
            pin_number.requestFocus();
            pin_number.setError("Please Enter Valid Pin");
            return false;
        }
        // Contact no
        else if (contactno.length() == 0) {
            editTextPhone.requestFocus();
            editTextPhone.setError("Please Enter Enter Phone Number");
            return false;
        } else if (!contactno.matches("^(0|91)?[789]\\\\d{9}$|^0[1-9][0-9]{9}$|^0[1-9][0-9]{2}-[0-9]{7}$")) {
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
        else if (achive1.length() == 0) {
            editTextNumberDecimal.requestFocus();
            editTextNumberDecimal.setError("Please Enter Mark");
            return false;
        } else if (!achive1.matches("^(100(\\.0{1,2})?|\\d{0,2}(\\.\\d{1,2})?)$")) {
            editTextNumberDecimal.requestFocus();
            editTextNumberDecimal.setError("Please Enter Valid Maek");
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
        } else if (achive2.length() == 0) {
            editTextNumberDecimal2.requestFocus();
            editTextNumberDecimal2.setError("(2)Please Enter Mark");
            return false;
        } else if (!achive2.matches("^(100(\\.0{1,2})?|\\d{0,2}(\\.\\d{1,2})?)$")) {
            editTextNumberDecimal2.requestFocus();
            editTextNumberDecimal2.setError("(2)Please Enter Valid Maek");
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
        } else if (achive3.length() == 0) {
            editTextNumberDecimal3.requestFocus();
            editTextNumberDecimal3.setError("(2)Please Enter Mark");
            return false;
        } else if (!achive3.matches("^(100(\\.0{1,2})?|\\d{0,2}(\\.\\d{1,2})?)$")) {
            editTextNumberDecimal3.requestFocus();
            editTextNumberDecimal3.setError("(2)Please Enter Valid Maek");
            return false;
        }
        // Programing Language
        else if (prog.length() == 0) {
            editTextText20.requestFocus();
            editTextText20.setError("Please Enter Programing Language");
            return false;
        } else if (prog1.length() == 0) {
            editTextText21.requestFocus();
            editTextText21.setError("Please Enter Programing Language");
            return false;
        } else if (prog3.length() == 0) {
            editTextText22.requestFocus();
            editTextText22.setError("Please Enter Programing Language");
            return false;
        }

        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;

    }

    public void sendData() {
        // personal details;
        firstName = editTextText4.getText().toString().trim();
        lastName = editTextText5.getText().toString().trim();
        dob = date_of_birthui.getText().toString().trim();
        email = emailid.getText().toString().trim();
        // gender
        genderM = genderOutPut.getText().toString().trim();
        //editTextTextPostalAddress
        // adress details
        buldingName = bulding_name.getText().toString().trim();
        streetName = street_name.getText().toString().trim();
        cityName = city_name.getText().toString().trim();
        stateName = state_auto_complete_text.getText().toString().trim();
        pinNumber = pin_number.getText().toString().trim();
        contactNumber = editTextPhone.getText().toString().trim();
        //university 1 details
        university01 = editTextText14.getText().toString().trim();
        passingDate01 = editTextDate2.getText().toString().trim();
        achive01 = editTextNumberDecimal.getText().toString().trim();
        //university 2 details
        university02 = editTextText15.getText().toString().trim();
        passingDate02 = editTextText16.getText().toString().trim();
        achive02 = editTextNumberDecimal2.getText().toString().trim();
        //university 3 details
        university03 = editTextText17.getText().toString().trim();
        passingDate03 = editTextDate3.getText().toString().trim();
        achive03 = editTextNumberDecimal3.getText().toString().trim();
        //programing language
        programingL1 = editTextText20.getText().toString().trim();
        programingL2 = editTextText21.getText().toString().trim();
        programingL3 = editTextText22.getText().toString().trim();
        // Get the rating value from the RatingBar
        float rating = ratingBar.getRating();
        float rating1 = ratingBar1.getRating();
        float rating2 = ratingBar2.getRating();
        // Create an Intent to navigate to the target activity
        Intent intent = new Intent(SecondActivity.this, MainActivity2.class);
        // personal details
        intent.putExtra(MainActivity2.FNAME, firstName);
        intent.putExtra(MainActivity2.LNAME, lastName);
        intent.putExtra(MainActivity2.DOB, dob);
        intent.putExtra(MainActivity2.EMAIL, email);
        intent.putExtra(MainActivity2.GENDER, genderM);
        // adress details
        intent.putExtra(MainActivity2.BNAME, buldingName);
        intent.putExtra(MainActivity2.STREETNAME, streetName);
        intent.putExtra(MainActivity2.CITYNAME, cityName);
        intent.putExtra(MainActivity2.STATE, stateName);
        intent.putExtra(MainActivity2.PIN, pinNumber);
        intent.putExtra(MainActivity2.CONTACTN, contactNumber);
        // university 1 details
        intent.putExtra(MainActivity2.UNIVERAITY1, university01);
        intent.putExtra(MainActivity2.PASSINGDATE1, passingDate01);
        intent.putExtra(MainActivity2.ACHIVE1, achive01);
        //university 2 details
        intent.putExtra(MainActivity2.UNIVERAITY2, university02);
        intent.putExtra(MainActivity2.PASSINGDATE2, passingDate02);
        intent.putExtra(MainActivity2.ACHIVE2, achive02);
        //university 3 details
        intent.putExtra(MainActivity2.UNIVERAITY3, university03);
        intent.putExtra(MainActivity2.PASSINGDATE3, passingDate03);
        intent.putExtra(MainActivity2.ACHIVE3, achive03);
        //programing language
        intent.putExtra(MainActivity2.PROGL1, programingL1);
        intent.putExtra(MainActivity2.PROGL2, programingL2);
        intent.putExtra(MainActivity2.PROGL3, programingL3);
        // Pass the rating value as an extra to the Intent
        intent.putExtra("rating", rating);
        intent.putExtra("rating1", rating1);
        intent.putExtra("rating2", rating2);
        // Start the target activity
        startActivity(intent);

    }

}


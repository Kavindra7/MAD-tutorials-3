package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edNum1;
    EditText edNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Defining text objects
        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);


    }

        public void openSecond (View view){
        Intent Intent = new Intent(this,SecondActivity.class);

            Intent.putExtra("n1",edNum1.getText().toString());
            Intent.putExtra("n2",edNum2.getText().toString());

            //Toast.makeText(this, "opening Calculator ...", Toast.LENGTH_SHORT).show();
            //Creating the LayoutInflater instance
            LayoutInflater li = getLayoutInflater();
            //Getting the View object as defined in the customtoast.xml file
            View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                    findViewById(R.id.custom_toast_layout));
            //Creating the Toast object
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setView(layout);//setting the view of custom toast layout
            toast.show();


            startActivity(Intent);

    }
}

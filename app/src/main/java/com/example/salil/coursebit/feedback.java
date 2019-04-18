package com.example.salil.coursebit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class feedback extends AppCompatActivity {
    EditText spacer;

    public void send(View view)
    {

        String message=spacer.getText().toString();
        Intent email=new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,new String[]{"salil5chhabra@gmail.com"});

        email.putExtra(Intent.EXTRA_SUBJECT,"aroundme app feedback");
    /*for cc:
    email.putExtra(Intent.EXTRA_CC,subject);
    for bcc:
    email.putExtra(Intent.EXTRA_BCC,subject);
    */

        email.putExtra(Intent.EXTRA_TEXT,message);
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email,"choose an email client"));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        spacer=(EditText)findViewById(R.id.spacer);

    }
}

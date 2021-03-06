package com.example.evaluacion1_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaluacion1_pdm.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView sUser, sEmail;
    private TextView one, two, three, four, five, six, seven, eight, nine, total;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sUser = findViewById(R.id.second_user);
        sEmail = findViewById(R.id.second_email);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        total = findViewById(R.id.second_total);
        mShare = findViewById(R.id.share);

        Intent mIntent = getIntent();
        if (mIntent != null) {
            sUser.setText(mIntent.getStringExtra(AppConstant.TEXT_USER));
            sEmail.setText(mIntent.getStringExtra(AppConstant.TEXT_EMAIL));
            one.setText(mIntent.getStringExtra(AppConstant.TEXT_ONE));
            two.setText(mIntent.getStringExtra(AppConstant.TEXT_TWO));
            three.setText(mIntent.getStringExtra(AppConstant.TEXT_THREE));
            four.setText(mIntent.getStringExtra(AppConstant.TEXT_FOUR));
            five.setText(mIntent.getStringExtra(AppConstant.TEXT_FIVE));
            six.setText(mIntent.getStringExtra(AppConstant.TEXT_SIX));
            seven.setText(mIntent.getStringExtra(AppConstant.TEXT_SEVEN));
            eight.setText(mIntent.getStringExtra(AppConstant.TEXT_EIGHT));
            nine.setText(mIntent.getStringExtra(AppConstant.TEXT_NINE));
            total.setText(mIntent.getStringExtra(AppConstant.RES));
        }

        mShare.setOnClickListener(v->{
            String text = sUser.getText().toString();
            String text1 = sEmail.getText().toString();
            String text2 = total.getText().toString();
            Intent shareIntent = new Intent();
            shareIntent.setType("text/plain");
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(AppConstant.TEXT_USER, text);
            shareIntent.putExtra(AppConstant.TEXT_EMAIL, text1);
            shareIntent.putExtra(AppConstant.RES, text2);
            //Sharing to other apps as text
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Username: " + text + "\nEmail: " + text1 + "\nTotal: " + text2);
            startActivity(shareIntent);
        });
    }
}

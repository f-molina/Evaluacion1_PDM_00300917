package com.example.evaluacion1_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion1_pdm.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText mUser, mEmail;
    private Button submit;
    private TextView one, two, three, four, five, six, seven, eight, nine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = findViewById(R.id.user);
        mEmail = findViewById(R.id.email);
        submit = findViewById(R.id.submit);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);


        submit.setOnClickListener(v->{
            String text = mUser.getText().toString();
            String text2 = mEmail.getText().toString();
            String text3 = one.getText().toString();
            String text4 = two.getText().toString();
            String text5 = three.getText().toString();
            String text6 = four.getText().toString();
            String text7 = five.getText().toString();
            String text8 = six.getText().toString();
            String text9 = seven.getText().toString();
            String text10 = eight.getText().toString();
            String text11 = nine.getText().toString();

            String numero1 = one.getText().toString();
            String numero2 = two.getText().toString();
            String numero3 = three.getText().toString();
            String numero4 = four.getText().toString();
            String numero5 = five.getText().toString();
            String numero6 = six.getText().toString();
            String numero7 = seven.getText().toString();
            String numero8 = eight.getText().toString();
            String numero9 = nine.getText().toString();


            Integer aux1 = Integer.parseInt(numero1);
            Integer aux2 = Integer.parseInt(numero2);
            Integer aux3 = Integer.parseInt(numero3);
            Integer aux4 = Integer.parseInt(numero4);
            Integer aux5 = Integer.parseInt(numero5);
            Integer aux6 = Integer.parseInt(numero6);
            Integer aux7 = Integer.parseInt(numero7);
            Integer aux8 = Integer.parseInt(numero8);
            Integer aux9 = Integer.parseInt(numero9);

            Integer res = aux1+aux2+aux3+aux4+aux5+aux6+aux7+aux8+aux9;
            String total = res+"";

            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstant.TEXT_USER, text);
            mIntent.putExtra(AppConstant.TEXT_EMAIL, text2);
            mIntent.putExtra(AppConstant.TEXT_ONE, text3);
            mIntent.putExtra(AppConstant.TEXT_TWO, text4);
            mIntent.putExtra(AppConstant.TEXT_THREE, text5);
            mIntent.putExtra(AppConstant.TEXT_FOUR, text6);
            mIntent.putExtra(AppConstant.TEXT_FIVE, text7);
            mIntent.putExtra(AppConstant.TEXT_SIX, text8);
            mIntent.putExtra(AppConstant.TEXT_SEVEN, text9);
            mIntent.putExtra(AppConstant.TEXT_EIGHT, text10);
            mIntent.putExtra(AppConstant.TEXT_NINE, text11);
            mIntent.putExtra(AppConstant.RES, total);
            startActivity(mIntent);
        });

        one.setOnClickListener(v->{
            int t = Integer.parseInt(one.getText().toString());
            one.setText(String.valueOf(t+1));
        });

        two.setOnClickListener(v->{
            int t = Integer.parseInt(two.getText().toString());
            two.setText(String.valueOf(t+1));
        });

        three.setOnClickListener(v->{
            int t = Integer.parseInt(three.getText().toString());
            three.setText(String.valueOf(t+1));
        });

        four.setOnClickListener(v->{
            int t = Integer.parseInt(four.getText().toString());
            four.setText(String.valueOf(t+1));
        });
        five.setOnClickListener(v->{
            int t = Integer.parseInt(five.getText().toString());
            five.setText(String.valueOf(t+1));
        });
        six.setOnClickListener(v->{
            int t = Integer.parseInt(six.getText().toString());
            six.setText(String.valueOf(t+1));
        });
        seven.setOnClickListener(v->{
            int t = Integer.parseInt(seven.getText().toString());
            seven.setText(String.valueOf(t+1));
        });
        eight.setOnClickListener(v->{
            int t = Integer.parseInt(eight.getText().toString());
            eight.setText(String.valueOf(t+1));
        });
        nine.setOnClickListener(v->{
            int t = Integer.parseInt(nine.getText().toString());
             nine.setText(String.valueOf(t+1));
        });


    }
}

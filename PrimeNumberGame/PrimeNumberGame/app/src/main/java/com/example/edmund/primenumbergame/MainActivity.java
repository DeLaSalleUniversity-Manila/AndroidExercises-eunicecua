package com.example.edmund.primenumbergame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayRandomNumber();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private int number;
    private int score;
    private boolean answer;

    public void onClickPrime(View view){
        answer = true;
        String msg_prime = "prime.";
        String msg_primeN = "composite.";
        verifyAnswer(msg_prime, msg_primeN);
        displayScore();
        displayRandomNumber();
    }

    public void onClickComposite(View view){
        answer = false;
        String msg_composite = "composite.";
        String msg_compositeN = "prime.";
        verifyAnswer(msg_composite, msg_compositeN);
        displayScore();
        displayRandomNumber();

    }

    private void verifyAnswer(String msg, String msgcomp) {
        if (!(isPrime(number) ^ answer)) {
            score++;
            Toast.makeText(this, "Yup! That was " + msg, Toast.LENGTH_SHORT).show();//Yup! It's correct.
        } else {
            score = score - 5;
            Toast.makeText(this, "Umm, that's wrong! That was " + msgcomp, Toast.LENGTH_SHORT).show();//Umm, that's wrong
        }
        Toast.makeText(this, "The previous number was: "+ number, Toast.LENGTH_SHORT).show();
    }

    private boolean isPrime(int value){
        Boolean temp = true;
        for (int divisor = 2; divisor < Math.sqrt(value); divisor++) {
            if (value % divisor == 0) {
                temp = false;
            }
        }
        return temp;
    }

    private void displayRandomNumber(){
        Random rand = new Random();
        number = 2 + rand.nextInt(1000);
        TextView tv_out = (TextView) findViewById(R.id.numberDisplay);
        tv_out.setText("" + number);
    }

    private void displayScore(){
        TextView tv_out = (TextView) findViewById(R.id.scoreDisplay);
        tv_out.setText("Your score is " + score + ".");
    }
}
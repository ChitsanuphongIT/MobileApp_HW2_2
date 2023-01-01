package com.example.a6306021621138_hw2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int counter = 0;

    Button btnIncrement, btnDecrement, btnReset;
    TextView txtResult;


    private void setup() {
        btnIncrement = (Button) findViewById(R.id.btn_increment);
        btnIncrement.setOnClickListener(this);

        btnDecrement = (Button) findViewById(R.id.btn_decrement);
        btnDecrement.setOnClickListener(this);

        btnReset = (Button) findViewById(R.id.btn_reset);
        btnReset.setOnClickListener(this);

        txtResult = (TextView) findViewById(R.id.txt_result);
    }

    private boolean checkDivisibleNoRemainder(int number, int divisibleBy) {
        return number != 0 && number % divisibleBy == 0;
    }

    private void updateResult() {
        if (this.checkDivisibleNoRemainder(this.counter, 5))
            Toast.makeText(
                    this,
                    "This divisible by 5 no remainder",
                    Toast.LENGTH_SHORT
            ).show();
        txtResult.setText(Integer.toString(this.counter));
    }

    private void onIncrement() {
        this.counter += 1;
    }
    private void onDecrement() {
        this.counter -= 1;
    }
    private void onReset() {
        this.counter = 0;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_increment:
                this.onIncrement();
                this.updateResult();
                break;
            case R.id.btn_decrement:
                this.onDecrement();
                this.updateResult();
                break;
            case R.id.btn_reset:
                this.onReset();
                this.updateResult();
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setup();
    }

}
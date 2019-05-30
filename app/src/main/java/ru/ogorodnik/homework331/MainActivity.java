package ru.ogorodnik.homework331;

//import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvResult;
    Button btnSeven, btnEight, btnNine, btnFour, btnFive, btnSix, btnOne, btnTwo, btnFree, btnZero, btnPoint, btnClear;
    String number = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvResult = (TextView) findViewById(R.id.tvResult);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnFree = (Button) findViewById(R.id.btnFree);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnFree.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        tvResult.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSeven:
                number = "7";
                break;
            case R.id.btnEight:
                number = "8";
                break;
            case R.id.btnNine:
                number = "9";
                break;
            case R.id.btnFour:
                number = "4";
                break;
            case R.id.btnFive:
                number = "5";
                break;
            case R.id.btnSix:
                number = "6";
                break;
            case R.id.btnOne:
                number = "1";
                break;
            case R.id.btnTwo:
                number = "2";
                break;
            case R.id.btnFree:
                number = "3";
                break;
            case R.id.btnZero:
                number = "0";
                break;
            case R.id.btnPoint:
                number = ".";
                break;
            case R.id.btnClear:
                number = "";
                tvResult.setText("");
                break;
            default:
                break;
        }
        String text = tvResult.getText().toString();
        tvResult.setText(text + number);
    }
}

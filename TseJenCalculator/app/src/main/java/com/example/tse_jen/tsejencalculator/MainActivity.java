package com.example.tse_jen.tsejencalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    private TextView TextView;
    private TextView TempTextView;
    private Button ButtonOne;
    private Button ButtonTwo;
    private Button ButtonThree;
    private Button ButtonFour;
    private Button ButtonFive;
    private Button ButtonSix;
    private Button ButtonSeven;
    private Button ButtonEight;
    private Button ButtonNine;
    private Button ButtonZero;
    private Button ButtonAdd;
    private Button ButtonSub;
    private Button ButtonMul;
    private Button ButtonDiv;
    private Button ButtonClear;
    private Button ButtonEqu;

    private int ValueOne = 0;
    private int ValueTwo = 0;
    private boolean OP_Flag = true;
    private boolean Initial_Flag = true;
    private boolean Error_Flag = false;
    private String operator = "none";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findView();
        TextView = (TextView) findViewById(R.id.textView);
        TempTextView = (TextView) findViewById(R.id.TempTextView);

        ButtonOne = (Button) findViewById(R.id.buttonOne);
        ButtonOne.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 1;
                TextView.setText( "" + ValueOne);
                TempTextView.setText("Press The Button 1, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        ButtonTwo = (Button) findViewById(R.id.buttonTwo);
        ButtonTwo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 2;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 2, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });
//3
        ButtonThree = (Button) findViewById(R.id.buttonThree);
        ButtonThree.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 3;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 3, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        //4
        ButtonFour = (Button) findViewById(R.id.buttonFour);
        ButtonFour.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 4;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 4, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        //5
        ButtonFive = (Button) findViewById(R.id.buttonFive);
        ButtonFive.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 5;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 5, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        //6
        ButtonSix = (Button) findViewById(R.id.buttonSix);
        ButtonSix.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 6;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 6, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        //7
        ButtonSeven = (Button) findViewById(R.id.buttonSeven);
        ButtonSeven.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 7;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 7, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        //8
        ButtonEight = (Button) findViewById(R.id.buttonEight);
        ButtonEight.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 8;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 8, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        //9
        ButtonNine = (Button) findViewById(R.id.buttonNine);
        ButtonNine.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = false;
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 ) + 9;
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 9, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        //0
        ButtonZero = (Button) findViewById(R.id.buttonZero);
        ButtonZero.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
//                OP_Flag = true
                Initial_Flag = false;
                if (ValueOne <= 999999 && ValueOne >= -999999 )
                    ValueOne = ( ValueOne * 10 );
                TextView.setText("" + ValueOne);
                TempTextView.setText("Press The Button 2, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        ButtonAdd = (Button) findViewById(R.id.buttonAdd);
        ButtonAdd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Error_Flag = false;
                if(OP_Flag == false)
                    calculate();
                OP_Flag = true;
                Initial_Flag = false;
                operator = "+";
                TempTextView.setText("Press The Button ADD, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        ButtonMul = (Button) findViewById(R.id.buttonMul);
        ButtonMul.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Initial_Flag == true) {
                    Error_Flag = true;
                }else if(OP_Flag == false) {
                    calculate();
                }
                OP_Flag = true;
                operator = "*";
                TempTextView.setText("Press The Button Mul. ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        ButtonSub = (Button) findViewById(R.id.buttonSub);
        ButtonSub.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Error_Flag = false;
                if(OP_Flag == false)   // Something strange.....
                    calculate();
                OP_Flag = true;
                operator = "-";
                TempTextView.setText("Press The Button Sub, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        ButtonDiv = (Button) findViewById(R.id.buttonDiv);
        ButtonDiv.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Initial_Flag == true) {
                    Error_Flag = true;
                }else if(OP_Flag == false)
                    calculate();
                OP_Flag = true;
                operator = "/";
                TempTextView.setText("Press The Button Div, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        ButtonClear = (Button) findViewById(R.id.buttonClear);
        ButtonClear.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                OP_Flag = true;
                Initial_Flag = true;
                Error_Flag = false;
                ValueOne = 0;
                ValueTwo = 0;
                operator = "none";
                TextView.setText("" + ValueTwo);
                TempTextView.setText("Press The Button Clear, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });

        ButtonEqu = (Button) findViewById(R.id.buttonEqu);
        ButtonEqu.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Error_Flag == true) {
                    TextView.setText("Error!");
                }else if(OP_Flag == false) {
                    calculate();
                    ValueOne = ValueTwo;
                    ValueTwo = 0;
                    operator = "none";
                    OP_Flag = false;
                }else{
                    TextView.setText("Error!");
                }
                TempTextView.setText("Press The Button Equal, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
            }
        });
    }
    private void calculate() {
        if(operator == "+") {
            ValueTwo = ValueTwo + ValueOne;
            if (ValueTwo <= 9999999 && ValueTwo >= -9999999 ){
                ValueOne = 0;
                TextView.setText("" + ValueTwo);
            }else{
                ValueOne = 0;
                ValueTwo = 0;
                TextView.setText("OverFlow! ");
            }
            TempTextView.setText("Press The Button Equal, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
        }else if( operator == "-" ) {
            ValueTwo = ValueTwo - ValueOne;
            if (ValueTwo <= 9999999 && ValueTwo >= -9999999 ){
                ValueOne = 0;
                TextView.setText("" + ValueTwo);
            }else{
                ValueOne = 0;
                ValueTwo = 0;
                TextView.setText("OverFlow! ");
            }
            TempTextView.setText("Press The Button Equal, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
        }else if(operator == "*") {
            ValueTwo = ValueTwo * ValueOne;
            if (ValueTwo <= 9999999 && ValueTwo >= -9999999 ){
                ValueOne = 0;
                TextView.setText("" + ValueTwo);
            }else{
                ValueOne = 0;
                ValueTwo = 0;
                TextView.setText("OverFlow! ");
            }
            TempTextView.setText("Press The Button Equal, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
        }else if(operator == "/" ) {
            if( ValueOne == 0) {
                TextView.setText("Error! ");
            }else{
                if(((10 * ValueTwo / ValueOne) % 10) >= 5) {
                    ValueTwo = (ValueTwo / ValueOne) + 1;
                }else if(((10 * ValueTwo / ValueOne) % 10) <= -5) {
                    ValueTwo = (ValueTwo / ValueOne) - 1;
                }else{
                    ValueTwo = (ValueTwo / ValueOne);
                }
                TextView.setText("" + ValueTwo);
            }
        }else if(operator == "none"){
            ValueTwo = ValueOne;
            ValueOne = 0;
            TextView.setText("" + ValueTwo);
            TempTextView.setText("Press The Button Equal, ValueOne: " + ValueOne + "  ValueTwo: " + ValueTwo + "  Op: " + operator );
//            ValueOne = 0;
        }
    }
}

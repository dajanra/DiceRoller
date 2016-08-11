package com.example.jesi.diceroller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        Button oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB,
                nineB, zeroB, plusB, minusB, rollB,
                deleteB, d100B, d20B, d12B, d10B, d8B, d6B, d4B, d3B, d2B;
        TextView EquationField;
        String theEquation ="";
        String randomHolding;
        Random randomGenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button oneB = (Button) findViewById(R.id.Btn1);
        Button twoB = (Button) findViewById(R.id.Btn2);
        Button threeB = (Button) findViewById(R.id.Btn3);
        Button fourB = (Button) findViewById(R.id.Btn4);
        Button fiveB = (Button) findViewById(R.id.Btn5);
        Button sixB = (Button) findViewById(R.id.Btn6);
        Button sevenB = (Button) findViewById(R.id.Btn7);
        Button eightB = (Button) findViewById(R.id.Btn8);
        Button nineB = (Button) findViewById(R.id.Btn9);
        Button zeroB = (Button) findViewById(R.id.Btn0);
        Button plusB = (Button) findViewById(R.id.BtnPlus);
        Button minusB = (Button) findViewById(R.id.BtnMinus);
        Button rollB = (Button) findViewById(R.id.rollBtn);
        Button deleteB = (Button) findViewById(R.id.deleteBtn);
        Button d100B = (Button) findViewById(R.id.d100Btn);
        Button d20B = (Button) findViewById(R.id.d20Btn);
        Button d12B = (Button) findViewById(R.id.d12Btn);
        Button d10B = (Button) findViewById(R.id.d10Btn);
        Button d8B = (Button) findViewById(R.id.d8Btn);
        Button d6B = (Button) findViewById(R.id.d6Btn);
        Button d4B = (Button) findViewById(R.id.d4Btn);
        Button d3B = (Button) findViewById(R.id.d3Btn);
        Button d2B = (Button) findViewById(R.id.d2Btn);

        EquationField = (TextView)findViewById(R.id.equationField);

       // EquationField.setText(theEquation);
        //Set the equation to display the contents of a String

        oneB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "1 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
                //startActivity(i);
            }

        });

        twoB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "2 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
                //startActivity(i);
            }

        });

        threeB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "3 ";
                EquationField.setText(theEquation);
                //Intent i = (new Intent(Bar.this, Drinks.class));
                //startActivity(i);
            }

        });

        fourB.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
                theEquation = theEquation + "4 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
                //startActivity(i);
            }

        });

        fiveB.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
                theEquation = theEquation + "5 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
              //  startActivity(i);
            }

        });

        sixB.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
                theEquation = theEquation + "6 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
               // startActivity(i);
            }

        });

        sevenB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "7 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
                //startActivity(i);
            }

        });

        eightB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "8 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
               // startActivity(i);
            }

        });

        nineB.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
                theEquation = theEquation + "9 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
               // startActivity(i);
            }

        });

        zeroB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "0 ";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
                //startActivity(i);
            }

        });

        plusB.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
                theEquation = theEquation + "+ ";
                EquationField.setText(theEquation);
              //  Intent i = (new Intent(Bar.this, Drinks.class));
              //  startActivity(i);
            }

        });

        minusB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "- ";
                EquationField.setText(theEquation);
              // Intent i = (new Intent(Bar.this, Drinks.class));
               // startActivity(i);
            }

        });

        rollB.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
               // Intent i = (new Intent(Bar.this, Drinks.class));
               // startActivity(i);
            }

        });

        deleteB.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
                theEquation = "";
                EquationField.setText(theEquation);
               // Intent i = (new Intent(Bar.this, Drinks.class));
               // startActivity(i);
            }

        });

        d2B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(2)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding + " ";
                EquationField.setText(theEquation);
            }

        });

        d3B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(3)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding+ " ";
                EquationField.setText(theEquation);
            }

        });

        d4B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(4)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding+ " ";
                EquationField.setText(theEquation);
            }

        });

        d6B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(6)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding+ " ";
                EquationField.setText(theEquation);
            }

        });

        d8B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(8)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding+ " ";
                EquationField.setText(theEquation);
            }

        });

        d10B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(10)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding+ " ";
                EquationField.setText(theEquation);
            }

        });

        d12B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(12)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding+ " ";
                EquationField.setText(theEquation);
            }

        });

        d20B.setOnClickListener(new OnClickListener() {
           // @Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(20)+1;
                randomHolding = Integer.toString(randomInt);
                theEquation = theEquation +" " + randomHolding+ " ";
                EquationField.setText(theEquation);
            }

        });

        d100B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(100)+1;
                randomHolding = Integer.toString(randomInt);
                    theEquation = theEquation +" " + randomHolding+ " ";
                    EquationField.setText(theEquation);
            }

            //ScriptEngineManager mgr = new ScriptEngineManager();
            //ScriptEngine engine = mgr.getEngineByName("JavaScript");
            //String infix = "3+2*(4+5)";
            //System.out.println(engine.eval(infix));
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}

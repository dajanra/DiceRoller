package com.example.jesi.diceroller;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

import java.util.Random;
import java.lang.Object;
public class MainActivity extends AppCompatActivity {

    Button oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB,
            nineB, zeroB, plusB, minusB, rollB,
            deleteB, d100B, d20B, d12B, d10B, d8B, d6B, d4B, d3B, d2B;
    TextView EquationField;
    String theEquation = "";
    int i, multiply;
    int answer = 0;
    String randomHolding, toast;
    Random randomGenerator = new Random();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    //AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

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

        EquationField = (TextView) findViewById(R.id.equationField);
        //Set the equation to display the contents of a String

        oneB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "1 ";
                EquationField.setText(theEquation);
            }

        });

        twoB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "2 ";
                EquationField.setText(theEquation);
            }

        });

        threeB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "3 ";
                EquationField.setText(theEquation);
            }

        });

        fourB.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {
                theEquation = theEquation + "4 ";
                EquationField.setText(theEquation);
            }

        });

        fiveB.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {
                theEquation = theEquation + "5 ";
                EquationField.setText(theEquation);
            }

        });

        sixB.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {
                theEquation = theEquation + "6 ";
                EquationField.setText(theEquation);
            }

        });

        sevenB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "7 ";
                EquationField.setText(theEquation);
            }

        });

        eightB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "8 ";
                EquationField.setText(theEquation);
            }

        });

        nineB.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {
                theEquation = theEquation + "9 ";
                EquationField.setText(theEquation);
            }

        });

        zeroB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "0 ";
                EquationField.setText(theEquation);
            }

        });

        plusB.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {
                theEquation = theEquation + "+ ";
                EquationField.setText(theEquation);
            }

        });

        /*minusB.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                theEquation = theEquation + "- ";
                EquationField.setText(theEquation);
            }

        });*/

        rollB.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {

                String[] result = theEquation.split("\\s+");


                /*ScriptEngineManager se = new ScriptEngineManager();
                ScriptEngine scriptengine = se.getEngineByName("JavaScript");
                String theEquation = "2 + 3 * 6";
                System.out.println(scriptengine.eval(theEquation));
                */

                for(i=0; i<result.length; i++)
                {
                    if(result[i].equals("*") {
                    multiply = Integer.parseInt(result[i-1])* Integer.parseInt(result[i+1]);
                }
                }
                    for (i = 0; i < result.length; i++) {

                        if (result[i].equals("d2")) {
                            int randomInt = randomGenerator.nextInt(2) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d3")) {
                            int randomInt = randomGenerator.nextInt(3) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d4")) {
                            int randomInt = randomGenerator.nextInt(4) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d6")) {
                            int randomInt = randomGenerator.nextInt(6) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d8")) {
                            int randomInt = randomGenerator.nextInt(8) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d10")) {
                            int randomInt = randomGenerator.nextInt(10) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d12")) {
                            int randomInt = randomGenerator.nextInt(12) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d20")) {
                            int randomInt = randomGenerator.nextInt(20) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("d100")) {
                            int randomInt = randomGenerator.nextInt(100) + 1;
                            answer = answer + randomInt;
                        } else if (result[i].equals("+")) {
                            answer = answer;
                        } else {
                            answer = answer + Integer.parseInt(result[i]);
                        }


                        // AlertDialog alertDialog = alertDialogBuilder.create();
                        // alertDialog.show();

                    }
                }

                String SAnswer = Integer.toString(answer);
                EquationField.setText(SAnswer);
                theEquation = "";
                answer = 0;
                toast = "";
            }

        });

        deleteB.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {
                theEquation = "";
                EquationField.setText(theEquation);
            }

        });

        d2B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                // int randomInt = randomGenerator.nextInt(2)+1;
                //randomHolding = Integer.toString(randomInt);
                // theEquation = theEquation +" " + randomHolding + " ";
                theEquation = theEquation + "d2 ";
                EquationField.setText(theEquation);
            }

        });

        d3B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                //int randomInt = randomGenerator.nextInt(3)+1;
                //randomHolding = Integer.toString(randomInt);
                //theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d3 ";
                EquationField.setText(theEquation);
            }

        });

        d4B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                //int randomInt = randomGenerator.nextInt(4)+1;
                //randomHolding = Integer.toString(randomInt);
                //theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d4 ";
                EquationField.setText(theEquation);
            }

        });

        d6B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                // int randomInt = randomGenerator.nextInt(6)+1;
                //randomHolding = Integer.toString(randomInt);
                // theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d6 ";
                EquationField.setText(theEquation);
            }

        });

        d8B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                // int randomInt = randomGenerator.nextInt(8)+1;
                //randomHolding = Integer.toString(randomInt);
                //theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d8 ";
                EquationField.setText(theEquation);
            }

        });

        d10B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                //int randomInt = randomGenerator.nextInt(10)+1;
                // randomHolding = Integer.toString(randomInt);
                //theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d10 ";
                EquationField.setText(theEquation);
            }

        });

        d12B.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                //int randomInt = randomGenerator.nextInt(12)+1;
                //randomHolding = Integer.toString(randomInt);
                //theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d12 ";
                EquationField.setText(theEquation);
            }

        });

        d20B.setOnClickListener(new OnClickListener() {
            // @Override
            public void onClick(View v) {
                //int randomInt = randomGenerator.nextInt(20)+1;
                // randomHolding = Integer.toString(randomInt);
                //theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d20 ";
                EquationField.setText(theEquation);
            }

        });

        d100B.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // int randomInt = randomGenerator.nextInt(100)+1;
                //randomHolding = Integer.toString(randomInt);
                // theEquation = theEquation +" " + randomHolding+ " ";
                theEquation = theEquation + "d100 ";
                EquationField.setText(theEquation);
            }

            //ScriptEngineManager mgr = new ScriptEngineManager();
            //ScriptEngine engine = mgr.getEngineByName("JavaScript");
            //String infix = "3+2*(4+5)";
            //System.out.println(engine.eval(infix));
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.jesi.diceroller/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.jesi.diceroller/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

package com.maria.helloworld3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v){
        EditText ed=(EditText)findViewById(R.id.text);
        RadioButton rb1=(RadioButton)findViewById(R.id.rb1);
        RadioButton rb2=(RadioButton)findViewById(R.id.rb2);
        try {
            double nbr = (double) Double.parseDouble(ed.getText().toString());
            if (rb1.isChecked()) {
                ed.setText(((nbr * 9 / 5) + 32) + "");
            } else if (rb2.isChecked()) {
                ed.setText((nbr - 32) * 5 / 9 + "");
            }
        }catch(Exception e){

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
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

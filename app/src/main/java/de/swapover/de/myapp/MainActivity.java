package de.swapover.de.myapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btn_spotify = (Button) findViewById(R.id.btn_spotify);
        btn_spotify.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Context ctx = getApplicationContext();
                CharSequence text = "This button will launch my spotify streamer app!";
                Toast toast = Toast.makeText(ctx, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button btn_scores = (Button) findViewById(R.id.btn_scores);
        btn_scores.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Context ctx = getApplicationContext();
                CharSequence text = "This button will launch my scores app!";
                Toast toast = Toast.makeText(ctx, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button btn_library = (Button) findViewById(R.id.btn_library);
        btn_library.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Context ctx = getApplicationContext();
                CharSequence text = "This button will launch my library app!";
                Toast toast = Toast.makeText(ctx, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button btn_build = (Button) findViewById(R.id.btn_build);
        btn_build.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Context ctx = getApplicationContext();
                CharSequence text = "This button will launch my build it bigger app!";
                Toast toast = Toast.makeText(ctx, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button btn_xyz = (Button) findViewById(R.id.btn_xyz);
        btn_xyz.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Context ctx = getApplicationContext();
                CharSequence text = "This button will launch my xyz reader app!";
                Toast toast = Toast.makeText(ctx, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button btn_capstone = (Button) findViewById(R.id.btn_capstone);
        btn_capstone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context ctx = getApplicationContext();
                CharSequence text = "This button will launch my capstone app!";
                Toast toast = Toast.makeText(ctx, text, Toast.LENGTH_SHORT);
                toast.show();
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

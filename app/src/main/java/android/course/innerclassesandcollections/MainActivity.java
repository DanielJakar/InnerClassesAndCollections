package android.course.innerclassesandcollections;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton fab;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);





        //1) init a house is easy:
        //House.Room...


        //2) init a room from outside:
        //requires a special syntax
        //the syntax requires an instance of a house
        //in order to create a room.



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
    public void onClick(View v) {
        House.Builder  b = new House.Builder();
        House newHouse = b.addRoom(8,10).
                addRoom(20,20).
                addRoom(14,56).
                addRoom(34,34).
                setAddress("Derech Hamelech 1").
                build();

        Toast.makeText(this, newHouse.toString(), Toast.LENGTH_LONG).show();



        fab.setOnClickListener(new View.OnClickListener(){
            private String s = "123";
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, this.getClass().getName(), Toast.LENGTH_SHORT).show();
            }


        });

    }
}

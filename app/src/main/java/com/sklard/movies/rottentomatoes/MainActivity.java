package com.sklard.movies.rottentomatoes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        // The above line *INFLATES* the XML file into widgets/views.
        // So after this line, you can fill the widgets with the dynamic content.
        // See the "lifecycle" diagram.
        // Others include: onStart, onResume, onPause, onStop
        ArrayList<Movie> movies = Movie.getFakeMovies();

        // Get recycleview reference
        RecyclerView rvList = (RecyclerView) findViewById(R.id.rvListMovies);

        // create adapter
        MoviesAdapter adapter = new MoviesAdapter(movies);

        // set adapter
        rvList.setAdapter(adapter);

        // Set the layout style
        rvList.setLayoutManager(new LinearLayoutManager(this));

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

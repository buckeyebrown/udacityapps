package proj1.udacity.dbrown.udacityproj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMoviesToaster(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This launches the Popular Movies app!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void stockHawkToaster(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This launches the Stock Hawk app!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void buildItBiggerToaster(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This launches the Build It Bigger app!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void makeYourAppMaterialToaster(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This launches the Make Your App Material app!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }


    public void goUbiquitousToaster(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This launches the Go Ubiquitous app!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void capstoneToaster(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This launches the Capstone app!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

}

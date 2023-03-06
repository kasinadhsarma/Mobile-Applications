package com.example.p11_fragments;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Begin a new fragment transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Create a new instance of the fragment
        ExampleFragment fragment = new ExampleFragment();

        // Replace the fragment_container with the new fragment
        fragmentTransaction.replace(R.id.fragment_container, fragment);

        // Commit the transaction
        fragmentTransaction.commit();
    }
}

package com.example.mdcollapsingtoolbarlayoutsectionproject;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;

    private void initialise() {
        toolbar = findViewById(R.id.tool_bar);
        floatingActionButton = findViewById(R.id.floating_action_button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Floating Action Button was pressed", Snackbar.LENGTH_SHORT).show();
            }
        });
        /* Checking if old remote repo address works if name of repo at remote is changed and
        reverted back with the help of this comment which will be used as a commit to be pushed to
        remote repo.
        */
    }
}
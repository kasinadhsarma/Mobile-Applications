package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout tableLayout = findViewById(R.id.table_layout);

        for (int i = 0; i < 3; i++) {
            TableRow tableRow = new TableRow(this);

            TextView textView1 = new TextView(this);
            textView1.setText("Cell " + (i + 1) + ", Column 1");
            tableRow.addView(textView1);

            TextView textView2 = new TextView(this);
            textView2.setText("Cell " + (i + 1) + ", Column 2");
            tableRow.addView(textView2);

            tableLayout.addView(tableRow);
        }
    }
}

package com.applications.doc.electronicse_module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Subject1 extends AppCompatActivity {

    ExpandableListView1 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject1);
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView1);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListView1(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("MAIN TOPIC 1");
        listDataHeader.add("MAIN TOPIC 2");
        listDataHeader.add("MAIN TOPIC 3");
        listDataHeader.add("MAIN TOPIC 4");

        // Adding child data
        List<String> topic1 = new ArrayList<String>();
        topic1.add("Fundamentals of Tube and Other Devices");
        topic1.add("Introduction of Semiconductors");
        topic1.add("QUIZ");

        List<String> topic2 = new ArrayList<String>();
        topic2.add("Diode Equivalent Circuits");
        topic2.add("Wave Shaping Circuits");
        topic2.add("Special Diode Application");
        topic2.add("Power supply and Voltage Regulations");
        topic2.add("QUIZ");

        List<String> topic3 = new ArrayList<String>();
        topic3.add("Bipolar Junction Transistor");
        topic3.add("Small Signal Analysis");
        topic3.add("QUIZ");

        List<String> topic4 = new ArrayList<String>();
        topic4.add("Field Effect Transistor");
        topic4.add("Small Signal Analysis");
        topic4.add("Large Signal Analysis");
        topic4.add("QUIZ");

        listDataChild.put(listDataHeader.get(0), topic1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), topic2);
        listDataChild.put(listDataHeader.get(2), topic3);
        listDataChild.put(listDataHeader.get(3), topic4);
    }
}

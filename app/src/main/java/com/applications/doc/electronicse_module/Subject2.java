package com.applications.doc.electronicse_module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Subject2 extends AppCompatActivity {
    ExpandableListView2 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject2);
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView2);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListView2(this, listDataHeader, listDataChild);

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
        listDataHeader.add("MAIN TOPIC 5");

        // Adding child data
        List<String> topic1 = new ArrayList<String>();
        topic1.add("Introduction and Review of Logarithms and Decibels");
        topic1.add("BJT Lower Critical Frequency Response");
        topic1.add("BJT Higher Critical Frequency Response");
        topic1.add("JFET Higher Frequency Response");
        topic1.add("Cascade and Cascode Connection");
        topic1.add("QUIZ");

        List<String> topic2 = new ArrayList<String>();
        topic2.add("Introduction to Feedback System");
        topic2.add("Feedback Connections and Practical Feedback Circuits");
        topic2.add("Negative Feedback System");
        topic2.add("Positive Feedback System");
        topic2.add("QUIZ");

        List<String> topic3 = new ArrayList<String>();
        topic3.add("Introduction to Operational Amplifier");
        topic3.add("Practical Operational Amplifier");
        topic3.add("Operational Amplifier Specification");
        topic3.add("QUIZ");

        List<String> topic4 = new ArrayList<String>();
        topic4.add("Introduction to Oscillator");
        topic4.add("RC Feedback Oscillator Circuits");
        topic4.add("LC Feedback Oscillator Circuits");
        topic4.add("Other Types of Oscillators");
        topic4.add("QUIZ");

        List<String> topic5 = new ArrayList<String>();
        topic5.add("Introduction to Filters");
        topic5.add("Designing Filters");
        topic5.add("Types of Filters");
        topic5.add("Transistor Fabrication");
        topic5.add("QUIZ");

        listDataChild.put(listDataHeader.get(0), topic1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), topic2);
        listDataChild.put(listDataHeader.get(2), topic3);
        listDataChild.put(listDataHeader.get(3), topic4);
        listDataChild.put(listDataHeader.get(4), topic5);
    }
}

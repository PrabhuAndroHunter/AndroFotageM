package com.pub.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mMyList;
    private MyContactData[] contactArray;

    ArrayList<MyContactData> contactsList = new ArrayList<MyContactData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*  Instantiation of UI Components */
        mMyList = (ListView) findViewById(R.id.activity_main_listview);

        loadContact();
        contactArray = new MyContactData[contactsList.size()];
        contactArray = contactsList.toArray(contactArray);
        /*  create object of adapter class and set adapter to listview */
        MyAdapter adapter = new MyAdapter(getBaseContext(), contactArray);
        mMyList.setAdapter(adapter);
    }

    /* Load dataSet*/
    private void loadContact() {
        contactsList.add(new MyContactData("prabhu", "8197920000"));
        contactsList.add(new MyContactData("sada", "8100920000"));
        contactsList.add(new MyContactData("shiva", "8111120500"));
        contactsList.add(new MyContactData("swamy", "9749002255"));
        contactsList.add(new MyContactData("ravi", "9785368527"));
        contactsList.add(new MyContactData("raki", "8197920000"));
        contactsList.add(new MyContactData("somashekar", "8100920000"));
        contactsList.add(new MyContactData("rayker", "8111120500"));
        contactsList.add(new MyContactData("pammy", "9749002255"));
        contactsList.add(new MyContactData("deggu", "9785368527"));
        contactsList.add(new MyContactData("nandan", "8197920000"));
        contactsList.add(new MyContactData("yogi", "8100920000"));
        contactsList.add(new MyContactData("shashi", "8111120500"));
        contactsList.add(new MyContactData("jeevan", "9749002255"));
        contactsList.add(new MyContactData("ashoka", "9785368527"));
    }
}

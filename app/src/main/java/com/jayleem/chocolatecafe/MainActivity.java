package com.jayleem.chocolatecafe;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    static final String webUrl = "https://chocolatharlem.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] dessertSpecials = {"Chocolate Mousse", "Chocolate Cake", "Chocolate Macaroon", "Chocolate Cafe Website"};

        //Bind array to our ListView layout
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.dessert, dessertSpecials));
    }

    //Event listener
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        switch (position) {
            case 0:
                //Display the first dessert special
                startActivity(new Intent(MainActivity.this, ChocolateMousse.class));
                break;
            case 1:
                //Display the second dessert special
                startActivity(new Intent(MainActivity.this, ChocolateCake.class));
                break;
            case 2:
                //Display the third dessert special
                startActivity(new Intent(MainActivity.this, ChocolateMacaroon.class));
                break;
            case 3:
                //Display Chocolate Cafe Website
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(webUrl)));
                break;
            default:
                startActivity(new Intent(MainActivity.this, ChocolateCake.class));
                break;
        }
    }
}

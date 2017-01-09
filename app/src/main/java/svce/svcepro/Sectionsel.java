package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Sectionsel extends AppCompatActivity implements OnItemClickListener {

    Integer x, y, z;
    public static final String[] onesec = new String[]{"A SECTION"};
    public static final String[] twosec = new String[]{"A SECTION",
            "B SECTION"};
    public static final String[] threesec = new String[]{"A SECTION", "B SECTION",
            "C SECTION"};

    public static final Integer[] onesecimages = {R.drawable.asection};
    public static final Integer[] twosecimages = {R.drawable.asection,
            R.drawable.bsec};
    public static final Integer[] threesecimages = {R.drawable.asection,
            R.drawable.bsec, R.drawable.csec};
    ListView listView;
    List<rowitem> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);

        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");
        rowItems = new ArrayList<rowitem>();
        switch (z) {
            case 1://auto
            {
                for (int i = 0; i < onesec.length; i++) {
                    rowitem item = new rowitem(onesecimages[i], onesec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 2://biotech
            {
                for (int i = 0; i < onesec.length; i++) {
                    rowitem item = new rowitem(onesecimages[i], onesec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 3://chem
            {
                for (int i = 0; i < twosec.length; i++) {
                    rowitem item = new rowitem(twosecimages[i], twosec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 4://civil
            {
                for (int i = 0; i < onesec.length; i++) {
                    rowitem item = new rowitem(onesecimages[i], onesec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 5://eee
            {
                for (int i = 0; i < twosec.length; i++) {
                    rowitem item = new rowitem(twosecimages[i], twosec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 6://it
            {
                for (int i = 0; i < twosec.length; i++) {
                    rowitem item = new rowitem(twosecimages[i], twosec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 7://ece
            {
                for (int i = 0; i < threesec.length; i++) {
                    rowitem item = new rowitem(threesecimages[i], threesec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 8://cse
            {
                for (int i = 0; i < threesec.length; i++) {
                    rowitem item = new rowitem(threesecimages[i], threesec[i]);
                    rowItems.add(item);
                }
                break;
            }
            case 9://mech
            {
                for (int i = 0; i < twosec.length; i++) {
                    rowitem item = new rowitem(twosecimages[i], twosec[i]);
                    rowItems.add(item);
                }
                break;
            }

        }


        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuinfalter = getMenuInflater();
        menuinfalter.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.About:
                Intent newintent2 = new Intent(Sectionsel.this, bout.class);
                startActivity(newintent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (z) {
            case 1: { //automobile

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }

            case 2: { //biotech

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }
            case 3: { //chem

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 1: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 2);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }
            case 4: { //civil

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }

                }
                break;
            }
            case 5: { //eee

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 1: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 2);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }
            case 6: { //it

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 1: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 2);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }
            case 7: { //ece

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 1: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 2);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 2: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 3);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }
            case 8: { //cse

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 1: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 2);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 2: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 3);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }
            case 9: { //mech

                switch (position) {
                    case 0: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 1);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                    case 1: {
                        Intent newintent = new Intent(Sectionsel.this, selectme.class);
                        newintent.putExtra("sec", 2);
                        newintent.putExtra("year", x);
                        newintent.putExtra("sem", y);
                        newintent.putExtra("sel", z);
                        startActivity(newintent);
                        break;
                    }
                }
                break;
            }


        }
    }
}

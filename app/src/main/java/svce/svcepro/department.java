package svce.svcepro;

import android.app.Activity;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class department extends AppCompatActivity implements OnItemClickListener {

    public static final String[] titles = new String[] { "AUTOMOBILE",
            "BIOTECH", "CHEMICAL","CIVIL","EEE","IT","ECE","CSE","MECHANICAL","MARINE" };

    public static final Integer[] images = { R.drawable.auto,
            R.drawable.biotech, R.drawable.chemical,R.drawable.civil,R.drawable.eee
            ,R.drawable.it,R.drawable.ece,R.drawable.cse,R.drawable.mech,R.drawable.marine };
    Integer y,x;


    ListView listView;
    List<rowitem> rowItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);
        rowItems = new ArrayList<rowitem>();
        for (int i = 0; i < titles.length; i++) {
            rowitem item = new rowitem(images[i], titles[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        Bundle extras=getIntent().getExtras();
        x=extras.getInt("year");
        y=extras.getInt("sem");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuinfalter=getMenuInflater();
        menuinfalter.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.About:
                Intent newintent2=new Intent(department.this,bout.class);
                startActivity(newintent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        switch(position)
        {
            case 0: {//aut0
                Intent newintent = new Intent(department.this, Sectionsel.class);
                newintent.putExtra("sel", 1);
                newintent.putExtra("year", x);
                newintent.putExtra("sem", y);
                startActivity(newintent);
                break;
            }
            case 1: {//biotech
                Intent newintent = new Intent(department.this, Sectionsel.class);
                newintent.putExtra("sel", 2);
                newintent.putExtra("year", x);
                newintent.putExtra("sem", y);
                startActivity(newintent);
                break;
            }
            case 2:
        {    //chem
            Intent newintent=new Intent(department.this,Sectionsel.class );
            newintent.putExtra("sel",3);
            newintent.putExtra("year",x);
            newintent.putExtra("sem",y);
            startActivity(newintent);
            break;
        }
            case 3:
            {  ///civil
                Intent newintent=new Intent(department.this,Sectionsel.class );
                newintent.putExtra("sel",4);
                newintent.putExtra("year",x);
                newintent.putExtra("sem",y);
                startActivity(newintent);
                break;

            }
            case 4:
            {    //eee
                Intent newintent=new Intent(department.this,Sectionsel.class );
                newintent.putExtra("sel",5);
                newintent.putExtra("year",x);
                newintent.putExtra("sem",y);
                startActivity(newintent);
                break;

            }
            case 5:
            {   //it
                Intent newintent=new Intent(department.this,Sectionsel.class );
                newintent.putExtra("sel",6);
                newintent.putExtra("year",x);
                newintent.putExtra("sem",y);
                startActivity(newintent);
                break;

            }
            case 6:
            { //ece
                Intent newintent=new Intent(department.this,Sectionsel.class );
                newintent.putExtra("sel",7);
                newintent.putExtra("year",x);
                newintent.putExtra("sem",y);
                startActivity(newintent);
                break;
            }
            case 7:
            {  //cse
                Intent newintent=new Intent(department.this,Sectionsel.class );
                newintent.putExtra("sel",8);
                newintent.putExtra("year",x);
                newintent.putExtra("sem",y);
                startActivity(newintent);
                break;
            }
            case 8:
            {  //mech
                Intent newintent=new Intent(department.this,Sectionsel.class );
                newintent.putExtra("sel",9);
                newintent.putExtra("year",x);
                newintent.putExtra("sem",y);
                startActivity(newintent);
                break;
            }
            case 9:
            {
                Toast.makeText(this,"Not Available",Toast.LENGTH_LONG).show();
            }

        }




    }

}

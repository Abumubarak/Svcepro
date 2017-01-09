package svce.svcepro;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class clubs extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static final String[] titles = new String[] { "NCC",
            "NSS", "RED CROSS","CARE","LEO CLUB","MUSIC CLUB"};

    public static final Integer[] images = { R.drawable.ncc,
            R.drawable.nss, R.drawable.redcross,R.drawable.care,R.drawable.leo,R.drawable.violin};



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



    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position)
        {
            case 0: {//ncc
                Toast.makeText(this,"Registrations for NCC are not yet open",Toast.LENGTH_SHORT).show();
                /*Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 3);
                startActivity(newint); */
                break;
            }
            case 1: { //nss
                Toast.makeText(this,"Registrations for NSS are not yet open",Toast.LENGTH_SHORT).show();
               /* Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 4);
                startActivity(newint);*/
                break;
            }
            case 2: { //redcross
                Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 1);
                startActivity(newint);
                break;
            }
            case 3: { //care
                Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 2);
                startActivity(newint);
                break;
            }
            case 4: { //leo
                Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 3);
                startActivity(newint);
                break;
            }
            case 5:  //music
            {
                Intent newint = new Intent(clubs.this, webloader.class);
                newint.putExtra("firsel", 4);
                startActivity(newint);
                break;

            }

        }

    }
}

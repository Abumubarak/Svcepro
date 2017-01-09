package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class year extends AppCompatActivity implements OnItemClickListener{

    public static final String[] titles = new String[] { "FIRST YEAR",
            "SECOND YEAR", "THIRD YEAR","FINAL YEAR"};

    public static final Integer[] images = { R.drawable.first,
            R.drawable.second, R.drawable.third,R.drawable.fourth };
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
        switch (position) {
            case 0:
            {
                Intent newintent=new Intent(year.this,semester.class);
                newintent.putExtra("year",1);
                startActivity(newintent);
                break;
            }
            case 1:
            {
                Intent newintent=new Intent(year.this,semester.class);
                newintent.putExtra("year",2);
                startActivity(newintent);
                break;
            }
            case 2:
            {
                Intent newintent=new Intent(year.this,semester.class);
                newintent.putExtra("year",3);
                startActivity(newintent);
                break;
            }
            case 3:
            {
                Intent newintent=new Intent(year.this,semester.class);
                newintent.putExtra("year",4);
                startActivity(newintent);
                break;
            }

        }

    }
}


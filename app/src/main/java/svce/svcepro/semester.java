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

public class semester extends AppCompatActivity implements OnItemClickListener {

     Integer x;
    public static final String[] firstyear = new String[] { "FIRST SEMESTER",
            "SECOND SEMESTER"};
    public static final String[] secondyear = new String[] { "THIRD SEMESTER",
            "FOURTH SEMESTER"};
    public static final String[] thirdyear = new String[] { "FIFTH SEMESTER",
            "SIXTH SEMESTER"};
    public static final String[] finalyear = new String[] { "SEVENTH SEMESTER","EIGHTH SEMESTER"};


    public static final Integer[] fimages = { R.drawable.eg,
            R.drawable.secondsem };
    public static final Integer[] simages = { R.drawable.thirdsem,
            R.drawable.fourthsem };
    public static final Integer[] timages = { R.drawable.fifthsem,
            R.drawable.sixthsem };
    public static final Integer[] finalimages = { R.drawable.seventhsem,
            R.drawable.eighthsem };
    ListView listView;
    List<rowitem> rowItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);
        Bundle extras=getIntent().getExtras();
        x=extras.getInt("year");

        rowItems = new ArrayList<rowitem>();
        for (int i = 0; i < firstyear.length; i++) {
            switch(x) {
                case 1: {
                    rowitem item = new rowitem(fimages[i], firstyear[i]);
                    rowItems.add(item);
                    break;
                }
                case 2: {
                    rowitem item = new rowitem(simages[i], secondyear[i]);
                    rowItems.add(item);
                    break;
                }
                case 3: {
                    rowitem item = new rowitem(timages[i], thirdyear[i]);
                    rowItems.add(item);
                    break;
                }
                case 4: {
                    rowitem item = new rowitem(finalimages[i], finalyear[i]);
                    rowItems.add(item);
                    break;
                }
            }
        }

        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(x) {
            case 1:
            switch (position) {
                case 0: {
                    Intent newint=new Intent(semester.this,department.class);
                    newint.putExtra("sem",1);
                    newint.putExtra("year",x);
                    startActivity(newint);
                    break;
                }
                case 1:
                {
                    Intent newint=new Intent(semester.this,department.class);
                    newint.putExtra("sem",2);
                    newint.putExtra("year",x);
                    startActivity(newint);
                    break;
                }
            } break;
            case 2:
                switch (position) {
                    case 0: {
                        Intent newint=new Intent(semester.this,department.class);
                        newint.putExtra("sem",3);
                        newint.putExtra("year",x);
                        startActivity(newint);
                        break;
                    }
                    case 1:
                    {
                        Intent newint=new Intent(semester.this,department.class);
                        newint.putExtra("sem",4);
                        newint.putExtra("year",x);
                        startActivity(newint);
                        break;
                    }
                } break;
            case 3:
                switch (position) {
                    case 0: {
                        Intent newint=new Intent(semester.this,department.class);
                        newint.putExtra("sem",5);
                        newint.putExtra("year",x);
                        startActivity(newint);
                        break;
                    }
                    case 1:
                    {
                        Intent newint=new Intent(semester.this,department.class);
                        newint.putExtra("sem",6);
                        newint.putExtra("year",x);
                        startActivity(newint);
                        break;
                    }
                } break;
            case 4:
                switch (position) {
                    case 0: {
                        Intent newint=new Intent(semester.this,department.class);
                        newint.putExtra("sem",7);
                        newint.putExtra("year",x);
                        startActivity(newint);
                        break;
                    }
                    case 1:
                    {
                        Intent newint=new Intent(semester.this,department.class);
                        newint.putExtra("sem",8);
                        newint.putExtra("year",x);
                        startActivity(newint);
                        break;
                    }
                } break;
        }
    }
}

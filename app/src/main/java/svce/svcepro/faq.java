package svce.svcepro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 11/10/16.
 */

public class faq extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static final String[] Questions = new String[]{"What are the courses offered in SVCE?"};
    public static final String[] Answers = new String[]{"AUTOMOBILE BIOTECH CHEMICAL CIVIL EEE IT ECE CSE MECHANICAL"};
    ListView listView;
    List<faqrowitem> faqrowitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);
        faqrowitem = new ArrayList<faqrowitem>();
        for (int i = 0; i < Questions.length; i++) {
            faqrowitem item = new faqrowitem(Questions[i], Answers[i]);
            faqrowitem.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        faqcustomlistadapter adapter = new faqcustomlistadapter(this,
                R.layout.faqlist, faqrowitem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

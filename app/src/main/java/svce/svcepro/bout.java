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

public class bout extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static final String[] Names = new String[]{" Mugunthan N"," Shyam Ravishankar"," Harish A"," Abdullah M"};
    public static final String[] Dept = new String[]{"Second Year IT A","Final Year ECE C","Second Year IT A","Second Year IT A"};
    public static final String[] namei=new String[]{" Dr M Sivanandham"," Prof.S.Ganesh Vaidyanathan"," Dr D Balasubramanian"," Dr S.Muthukumar"," The HSS Department"};
    public static final String[] post=new String[]{"Secretary","Principal","HOD IT Department","HOD ECE Department","SVCE"};
    ListView listView;
    ListView listView2;
    List<faqrowitem> faqrowitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bout);
        {
            faqrowitem = new ArrayList<faqrowitem>();
            for (int i = 0; i < Names.length; i++) {
                faqrowitem item = new faqrowitem(Names[i], Dept[i]);
                faqrowitem.add(item);
            }

            listView = (ListView) findViewById(R.id.devlist);
            faqcustomlistadapter adapter = new faqcustomlistadapter(this,
                    R.layout.faqlist, faqrowitem);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(this);
        }

        {
            faqrowitem = new ArrayList<faqrowitem>();
            for (int i = 0; i < namei.length; i++) {
                faqrowitem item = new faqrowitem(namei[i], post[i]);
                faqrowitem.add(item);
            }


            listView2 = (ListView) findViewById(R.id.spllist);
            faqcustomlistadapter adapter = new faqcustomlistadapter(this,
                    R.layout.faqlist, faqrowitem);
            listView2.setAdapter(adapter);
            listView2.setOnItemClickListener(this);
        }



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

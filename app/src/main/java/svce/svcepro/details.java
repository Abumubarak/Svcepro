package svce.svcepro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class details extends AppCompatActivity implements OnItemClickListener {
//Button proceed;
    //TextView emailad,hey,svcepro;

    public static final String[] titles = new String[] { "ABOUT SVCE",
            "STUDENT CORNER", "ANTI RAGGING","CLUBS","BUS SCHEDULE","ASSOCIATION","APP"};

    public static final Integer[] images = { R.drawable.svce,
            R.drawable.studentscorner, R.drawable.antirag,R.drawable.antirag,R.drawable.bus
            ,R.drawable.asso,R.drawable.abtpro};
    ListView listView;
    List<rowitem> rowItems;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        if (isNetworkAvailable(details.this)) {

        } else {
            final AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
            myAlert.setMessage("Internet Connection not enabled");
            myAlert.create();
            myAlert.show();
            // code
        }


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
    public boolean isNetworkAvailable(final Context context) {
        final ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position)
        {
            case 0:
            {
                Intent newintent = new Intent(details.this, aboutcollege.class);
                startActivity(newintent);

                break;
            }
            case 1:
            {
                Intent newintent = new Intent(details.this, year.class);
                startActivity(newintent);
                break;
            }
            case 2:
            {
                Intent newint = new Intent(details.this,webloader.class);
                newint.putExtra("firsel",5);
                startActivity(newint);
                break;
            }
            case 3:
            {
                Intent newint = new Intent(details.this,clubs.class);
                //newint.putExtra("firsel",3);
                startActivity(newint);
                break;
            }
            case 4:
            {
                Intent newint = new Intent(details.this,jsonbus.class);
                newint.putExtra("json",1);
                startActivity(newint);
                break;
            }
            case 5:
            {
                Intent newintent = new Intent(details.this, studentasso.class);
                startActivity(newintent);
                break;

            }
             case 6:
            {
                Intent newintent = new Intent(details.this, bottomact.class);
                startActivity(newintent);
                break;
            }


        }
    }
}





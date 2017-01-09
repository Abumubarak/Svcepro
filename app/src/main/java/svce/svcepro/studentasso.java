package svce.svcepro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by harishananth on 17/09/16.
 */
public class studentasso extends Activity  {
    ListView listView;

    String[] stcouncil={"1-Students' President -CHIDAMBARAM SP , IV-Year, AE","2-General Secretary - ROHAN CHANDHOKE III-Year, CS 'C'","3-Joint Secretary POOJA M III-Year,Bio Tech","4-Sports Secretary    -KESHAV ADITYA RP, III Year CS 'B'","5-Treasurer -SRESHTA KANNAN, II Year EC 'C'","6-Post Graduate Representative - MERLIN MONISHA A , II-Year CS"};

    Integer r,x,y,z,t;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttday);

        listView = (ListView) findViewById(R.id.days);




        listView.setAdapter(new ArrayAdapter<String>(studentasso.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
        new Async().execute();

        }

    public class Async extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBar);

            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:stcouncil)
            {
                publishProgress(value);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


}

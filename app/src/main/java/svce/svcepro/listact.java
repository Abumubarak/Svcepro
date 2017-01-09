package svce.svcepro;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class listact extends AppCompatActivity {

    ListView listview;
Integer x;
    String[] autoone= {"HOD : Dr J Venkatesan","Associate Professor :Dr V Ganesh"};
    String[] itaone={"HOD : Dr D Balasubramanian", "Associate Professor :Dr C Yashuwanth"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listact);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("myteacher");
        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(new ArrayAdapter<String>(listact.this, android.R.layout.simple_list_item_1, new ArrayList<String>()));
        switch(x) {
            case 1:
            {
                new Async().execute();
                break;
            }
            case 2:
            {
                new Async2().execute();
                break;
            }
        }

    }
    public class Async extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>)listview.getAdapter();
            progressBar= (ProgressBar) findViewById(R.id.progressBar);

            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }


        @Override
        protected String doInBackground(Void... voids) {

            for(String value:autoone)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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
    public class Async2 extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>)listview.getAdapter();
            progressBar= (ProgressBar) findViewById(R.id.progressBar);

            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }


        @Override
        protected String doInBackground(Void... voids) {

            for(String value:itaone)
            {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
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


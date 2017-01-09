package svce.svcepro;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

/**
 * Created by harishananth on 14/10/16.
 */

public class officeb extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    String[] mech={"1-President-Piyush Chopra-IV year B","2- Vice - President- Mihir Kaushik-IV year– A","3-General secretary- Ashwin Natra-III year– A","4-Treasurer-Navin Kamesh-III year – B","5-Executive Members-Felix Danial R, Gautham M,Nirmal Raj D-II year","6-Executive Members-Vijay Durai A S,Saikrishna H,Vigneshwar S-  II year– B"};
    String[] it={"1-President-KISHORE K-Final Year IT ‘A’ Batch","2-Vice President-UTHRA V-Final Year IT ‘B’ Batch","3-Secretary-VISHWANG R SHAH-Third Year IT ‘B’ Batch","4-Treasurer-HEMAVATHY R-Third Year IT ‘A’ Batch","5-Executive Member-HARISH A-Second Year IT ‘A’ Batch","6-Executive Member-NIWEDHEETHAA M-Second Year IT ‘B’ Batch"};
    String[] ece={"1-President-Vishnu Srinivasan-Final Yr,ECE-C","2-Vice President-Deepika A-Final Yr,ECE-A","3-Secretary-Dhanraj Vedanth R-Third Yr,ECE-A","4-Treasurer-Joshua A Samuel-Third Yr,ECE-A","5-Joint Secretary - Lokesh B, Madumitha P-Second Yr,ECE-B","6-Executive Members-Keerthana T-Third Yr,ECE-B,lakshmi Narayanan N.V- Third Yr,ECE-B,Ms. Anantha Bhairavi-Third Yr,ECE-A, Jeyenth Kumar G.K-Third Yr,ECE-A,Roshini B.S-Third Yr,ECE-C,Sanjay P- Third Yr,ECE-C"};
    String[] cse={"1-President-M.Adithya -IV year CS A","2-Vice President- V.K. Hari Siddharth","3-Secretary-R.Thiurvenkatam-III year CS C","4-Joint Secretary- S.Chran -II year CS A","5-Treasurer-S.Sivasubramaniam-III year CS C","6-Executive Members- K.Afrish (III year CS A),V.Akshaya Sai(III year CS A),E.Karthik Raja (III year CS B),A.Vikkram (III year CS C),G.Sneeha (III year CS C),Madhuvanti Muralikrishnan (II year CS B),S.Santhoshkumar(II year CS C)"};
    String[] civil ={"1-PRESIDENT-K.Keerthana-4th year","2-GENERAL SECRETARY-S.Anuwar Husain-3rd year","3- JOINT SECRETARY-A.S.PraveenRaj-3rd year","4-SENIOR EXECUTIVE MEMBER- B.Pachiappan-3rd year","5-  SENIOR EXECUTIVE MEMBER-G.Manikandan-3rd year","6-TREASURER-S.Arun Eshwar-2nd year","7-EXECUTIVE MEMBER-J.Sree Swathi-2nd year"};
    String[] chem ={"1-President-S. Arunachalam-4th year","2-Vice- President- C. Nithin-4th year","3-secretary- Sanjana V Menon-3rd year","4-Joint Secretary- Kiran Prabhu & I. Jyothi Meenakshi"};
    String[]bio={"1-President: Ms. Pooja Smruthi K - IV yr B.Tech Biotech ","2-General Secretary: Ms.Azhagammal S -III yr B.Tech Biotech","3-Treasurer: Ms.Sivapriya K-III yr B.Tech Biotech","4-Joint Secretary: Ms. Sai Harshini II yr B.Tech Biotech ","5-Executive Member: Ms. Lavanya II yr B.Tech Biotech","6-Student Adviser: Ms. Shubhashini A, II Year M.Tech Biotech"};
    String[]auto ={"1- President-M. Rajkumar-Final year Automobile Engineering","2- General Secretary- N. Aravinthraj-III year Automobile Engineering","3- Treasurer - S. Praveen Kumar -III year Automobile Engineering","4- Executive Member - M. Ramshan -II year Automobile Engineering","5- Executive Member -G. Sargunan -II year Automobile Engineering"};
            Integer x,y,z;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttday);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");
        listView = (ListView) findViewById(R.id.days);

        listView.setAdapter(new ArrayAdapter<String>(officeb.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
        switch (z)
        {
            case 1:
                new automobile().execute();
                break;
            case 2:
                new biotech().execute();
                break;
            case 3:
                new chemical().execute();
                break;
            case 4:
                new civil().execute();
                break;
            case 5:
                new eee().execute();
                break;
            case 6:
                new it().execute();
                break;
            case 7:
                new ece().execute();
                break;
            case 8:
                new it().execute();
                break;
            case 9:
                new mech().execute();
                break;
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public class automobile extends AsyncTask<Void ,String,String>
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

            for(String value:auto)
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

    public class biotech extends AsyncTask<Void ,String,String>
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

            for(String value:bio)
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

    public class chemical extends AsyncTask<Void ,String,String>
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

            for(String value:chem)
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

    public class comp extends AsyncTask<Void ,String,String>
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

            for(String value:cse)
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

    public class civil extends AsyncTask<Void ,String,String>
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

            for(String value:civil)
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

    public class eee extends AsyncTask<Void ,String,String>
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

            for(String value:ece)
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

    public class ece extends AsyncTask<Void ,String,String>
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

            for(String value:ece)
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

    public class it extends AsyncTask<Void ,String,String>
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

            for(String value:it)
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
    public class mech extends AsyncTask<Void ,String,String>
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

            for(String value:mech)
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

package svce.svcepro;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class facultyadv extends AppCompatActivity {

    ListView listView;

    String[] ftautoone={"Ramanjaneyulu Kolla [1-30]","K.Paul Durai[31-60]"};
    String[] ftbioone={"P.Jaibaba[01-31]","J.Hariharan[32-63]"};
    String[] ftchemaone={"G.Sudha[1-20]","S.Bharath[21-40]"};
    String[] ftchembone={"S.Rajasekar[61-80]","G.Saraswathy[81-100]","M.Yogesh Kumar[101-120]"};
    String[] ftcivilone={"P.Venkateswara Rao","K.Sathyapriya","C.Sandhiya"};
    String[] ftcseaone={"S.Rajalakshmi","B.Lalithambigai","T.Padmavathy"};
    String[] ftcsebone={"E.Rajalakshmi","R.Senthil kumar","S.K.umamaheswari"};
    String[] ftcsecone={"V.Rajalakshmi","K.Kumanan","U.Muthunagai"};
    String[] fteceaone={"P.Muthukumaran [1-23]","Rajeswari Ramraj[24-46]","P.Arul [47-60]"};
    String[] ftecebone={"M.vidya[61-83]","S.Mehzabeen[84-106]","C.Gomatheeswari preethika[107-120]"};
    String[] ftececone={"B.Hemalatha[121-143]","M.Anushya[144-166]","S.Reethi[167-180]"};
    String[] fteeeaone={"D S Purushothaman[1-20]","S Arulmozhi[21-40]","C Kamal[41-60]"};
    String[] fteeebone={"S Anitha[61-80]","I Venkatraman[81-100]","M Rajalakshmi[101-120]"};
    String[] ftitaone={"G.S.Sangeetha[1-21]","S.Uvaraj Arutkumaran[22-41]","V.Saroja[42-61]"};
    String[] ftitbone={"P.Leela Rani[62-81]","V.Rajaram[82-101]","V.Ranjith[102-121]"};
    String[]  ftmechaone={"G.Kirubarakan[1-25]","M.ArulKumar[26-50]","R.Ganesan[51-63+LE]"};
    String[] ftmechbone={"Kumaraswamy[64-88]","E.Suresh[89-113]","Nishal[114-123+LE]"};

    Integer r, x, y, z, t, d;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttperiod);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");

        t = extras.getInt("sec");
        d = extras.getInt("day");
        listView = (ListView) findViewById(R.id.period);


        listView.setAdapter(new ArrayAdapter<String>(facultyadv.this, android.R.layout.simple_list_item_1, new ArrayList<String>()));

        if(x==1)
        {
        switch (z) // getting the valuefor depatrmnt
        {
            case 1:// automobile
            {
                switch (t) {
                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {

                            new Asyncftautoone().execute();

                        }
                    }
                    break;
                }
            }
            break;

            case 2: // biotech
            {
                switch (t) {
                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {
                            new Asyncftbiotechone().execute();

                        }
                        break;
                    }

                }

                break;
            }

            case 3: // chemical
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftchemaone().execute();

                            }

                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                        } else {

                            new Asyncftchembone().execute();


                        }

                    }
                    break;
                }

                break;
            }
            case 4: // civil
            {

                switch (t) {
                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftcivilone().execute();

                            }

                        }
                        break;
                    }
                }
                break;
            }
            case 5: //eee
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncfteeeaone().execute();

                            }

                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncfteeebone().execute();

                            }

                        }
                        break;
                    }

                }
                break;

            }
            case 6: // it
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftitaone().execute();
                            }

                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftitbone().execute();
                            }

                        }
                        break;
                    }

                }
                break;
            }
            case 7://ece
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncfteceaone().execute();

                            }

                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {

                            Toast.makeText(facultyadv.this, "Teacher list not available ", Toast.LENGTH_LONG).show();
                        } else {

                            {
                                new Asyncftecebone().execute();

                            }

                        }
                        break;
                    }
                    case 3: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftececone().execute();

                            }

                        }
                        break;

                    }

                }
                break;
            }
            case 8: // cse
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftcseaone().execute();

                            }

                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftcsebone().execute();
                            }

                        }
                        break;
                    }
                    case 3: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftcsecone().execute();

                            }

                        }
                        break;

                    }

                }
                break;

            }
            case 9:  // mech
            {
                switch (t)       // selecting the respective section
                {

                    case 1: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                        } else {

                            {
                                new Asyncftmechaone().execute();

                            }

                        }
                        break;
                    }

                    case 2: {
                        if (y % 2 == 0) // calling the even semester
                        {
                            Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();

                        } else {

                            {
                                new Asyncftmechbone().execute();

                            }

                        }
                        break;
                    }

                }
                break;

            }
        }
        }
        else
            Toast.makeText(this,"Faculty Advisors details not available",Toast.LENGTH_LONG).show();



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 1: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 2: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 3: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 4: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 5: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 6: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 7: {
                        Toast.makeText(facultyadv.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }


                }

            }
        });


    }

    public class Asyncftautoone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftautoone)
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

    public class Asyncftbiotechone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftbioone)
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

    public class Asyncftchemaone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftchemaone)
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

    public class Asyncftchembone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftchembone)
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

    public class Asyncftcivilone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftcivilone)
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

    public class Asyncftcseaone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftcseaone)
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

    public class Asyncftcsebone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftcsebone)
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

    public class Asyncftcsecone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftcsecone)
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

    public class Asyncfteceaone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:fteceaone)
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

    public class Asyncftecebone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftecebone)
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

    public class Asyncftececone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftececone)
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

    public class Asyncfteeeaone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:fteeeaone)
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

    public class Asyncfteeebone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:fteeebone)
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

    public class Asyncftitaone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftitaone)
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
    public class Asyncftitbone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftitbone)
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
    public class Asyncftmechaone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftmechaone)
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
    public class Asyncftmechbone extends AsyncTask<Void ,String,String>
    {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter= (ArrayAdapter<String>) listView.getAdapter();
            progressBar= (ProgressBar)findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count=0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for(String value:ftmechbone)
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








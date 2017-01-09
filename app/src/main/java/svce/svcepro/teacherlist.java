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

public class teacherlist extends AppCompatActivity {

    ListView listView;

    String[] fteeeaone = {"Technical English-I-Sam Dawsan", "Mathematics_I-R.Suresh", "Engineering Physics-I-Sambath Krishnan", "ENgineering Chemistry-I-T.Balaswami", "Computer Porgramming-A.Rohini", "Engineering graphics-Nishal/G.Kirubaran", "Computer Practise Laboratory-A.Rohini/G.Sangeetha/P.Nirmala/V.Saroja", "Engineering Practise Laboratory-K.Ram Prasad/A.Deepak/C.Kamal/S.Anita/I.Venkat Raman/", "Physics/Chemistry Lab-S.Sambath Krishnan/S.Anantha Babu", "Sports-M.Raja Lakshmi/S.Angala Vaishnavi/G.Vinoth Kumar"};

    String[] fteeebone = {"Technical English-I-Amutha Sharu Sheela", "Mathematics-I-V.Valliammal", "Engineering Physics-I-S.Hari Krishnan", "Engineering Chemistry-I-G.Devasagayan", "Computer Programming-V.M.Meghala", "Engineering Graphics-Ganeshan/Nishal", "Computer Practise Laboratory-V.M.Meghala/R.Sakhteeshwari/Silambarasi", "Engineering Practise Laboratory-Suganthi/Deepak/Sundararaman/M.Shankar/Nishal", "Physics/Chemistry Lab-S.Hari Krishan/G.Baskar", "Sports-Tamil Mani/Kamal/Suresh Kumar"};

    String[] ftitaone = {"Technical English-I-Anichamalar", "Mathematics-I-R.Suresh", "Engineering Physics-I-Hari Krishnan", "Engineering Chemistry-I-T.Baluswamy", "Computer Programming-V.M.Meghala/D.Balasubramaniyam", "Engineering Graphics-A.Kumarswamy/Nishal", "Computer Practise Laboratory-V.M.Meghala/V.Saroja/Uvaraj Arathkumaran/D.Balasubramanian", "Engineering Practise Laboratory-S.Kalyanasundaram/A.Deepak", "Physics/Chemistry Lab-S.Harikrishnan/M.Thirumalaikumar", "Sports-N.Devi/S.Kalavathi/P.Sharon Femi/A.Indumathi"};

    String[] ftitbone = {"Technical English-I-Sakthivel", "Mathematics-I-S.Prabhu", "Engineering Physics-I-R.Sheela", "Engineering Chemistry-I-S.Ananthababu", "Computer Programming-N.Uma/D.Balasubramnian", "Engineering Graphics-M.Maheshwaran/S.Kalyanasundaram", "Computer Practise Laboratory-N.Uma/P.Nirmala/V.Saroja", "Engineering Practise Laboratory-K.Ramprasad/M.Rajalakshmi", "Physics/Chemistry Lab-N.R.Sheela/R.Raja", "Sports-K.Krithika devi/B.T.Shobana/N.Devi/D.Jayanthi"};

    String[] ftautoone = {"Technical English-I-Sam Dawson", "Mathematics-I-Vishalakshi Subramniyan", "Engineering Physics-I-N.R.Sheela", "Engineering Chemistry-I-S.Stanley", "Computer Programming-V.Ranjith", "Engineering Graphics-R.Sakthivel/A.K.Boobalasenthilraj", "Computer Practise Laboratory-V.Ranjith/A.R.Guru Gokul/V.M.Meghala/S.Uvarajarutkumar", "Engineering Practise Laboratory-R.Sakthivel/D.Amudhavalli", "Physics/Chemistry Lab-N.R.Sheela/G.Devasagayam", "Sports-R.Sakthivel"};

    String[] ftbioone = {"Technical English-I-M.Lavanya", "Mathematics-I-A.Subha", "Engineering Physics-I-A.Anandavadivel", "Engineering Chemistry-I-S.Ananda Babu", "Computer Programming-Kiruba Wesley", "Engineering Graphics-R.Sakthivel/Ramanjaneyulu Kolla", "Computer Practise Laboratory-Kiruba Wesley/P.Leela Rani/V.Saroja", "Engineering Practise Laboratory-K.Suganthi/Nishal", "Physics/Chemistry Lab-A.Anandavadivel/S.AnandaBabu", "Sports-J.hariharan/P.Jaibiba"};

    String[] ftchemaone = {"Technical English-I-Sakthivel", "Mathematics-I-N.S.Priya", "Engineering Physics-I-G.Barathy", "Engineering Chemistry-I-T.Balusamy", "Computer Programming-M.Sugacini", "Engineering Graphics-S.Kalyanasundaram/K.Ramprasad", "Computer Practise Laboratory-M.Sugacini/N.Uma/V.Saroja", "Engineering Practise Laboratory-A.SureshKumar/S.Kalyanasundaram", "Physics/Chemistry Lab-G.Barathy/T.Balusamy", "Sports-S.Swathi/P.g.Priyadarshini/D.Sivakumar"};

    String[] ftchembone = {"Technical English-I-T.Ravindaran", "Mathematics-I-P.Veeraiah", "Engineering Physics-I-S.Kalpana", "Engineering Chemistry-I-S.AnandaBabu", "Computer Programming-AR.GuruGokul", "Engineering Graphics-V.Senthivelan/S.Kalyanasundaram", "Computer Practise Laboratory-AR.GuruGokul/S.UvarajArutkumaran/M.Sugacini", "Engineering Practise Laboratory-S.G.Karthick/S.Sinthamani", "Physics/Chemistry Lab-S.Kalpana/S.Stanly", "Sports-S.Swathi/P.G.Priyadarshini/D.Sivakumar"};

    String[] ftcseaone = {"Technical English-I-M.Lavanya", "Mathematics-I-M.Ramya", "Engineering Physics-I-S.Harikrishnan", "Engineering Chemistry-I-S.SelvaKumar", "Computer Programming-K.S.Gayathri", "Engineering Graphics-G.Kirubaran/Ganesan", "Computer Practise Laboratory-S.RajaLakshmi/A.Sowmiya Narayanan/M.P.LakshmanaKumar/R.Bhuvaneshwari", "Engineering Practise Laboratory-S.Diraviabalan/I.Venkatraman(I/C)", "Physics/Chemistry Lab-S.hariKrishnan/G.Baskar", "Sports-K.S.Gayathri/S.Senthmizhselvi/S.Rajalakshmi"};

    String[] ftcsebone = {"Technical English-I-T.Murugavel", "Mathematics-I-Vishalakshi Subramanian", "Engineering Physics-I-S.Kalpana", "Engineering Chemistry-I-S.SelvaKumar", "Computer Programming-J.Gunasekar", "Engineering Graphics-M.Kalaimani/K.Ramprasad", "Computer Practise Laboratory-R.bhuvaneshwari,K.S.Gayathru,M.P.Lakshmanakumar,R.Jayabhaduri", "Engineering Practise Laboratory-Ganesan,C.Kamal(I/C)", "Physics/Chemistry Lab-S.Kalpana/G.Devasagayam", "Sports-R.Bhuvaneshwari/M.P.Lakshmana Kumar/R.Jayabhaduri"};

    String[] ftcsecone = {"Technical English-I-S.Anichamalar", "Mathematics-I-T.Kulandaivel", "Engineering Physics-I-G.Barathy", "Engineering Chemistry-I-S.SelvaKumar", "Computer Programming-P.Janardhanan", "Engineering Graphics-S.Muniraj/S.Kalyanasundaram", "Computer Practise Laboratory-K.S.Gayathri,M.P.LakshmanaKumar,S.Rajalakshmi,A.Sowmiya Narayanan", "Engineering Practise Laboratory-Ganesan/S.Tamilmani(I/C)", "Physics/Chemistry Lab-G.Bharathy/N.Nachiyappan", "Sports-P.Janarthanan/D.Sasikala/A.Sowmynarayan"};

    String[] ftcivilone = {"Technical English-I-Sakthivel", "Mathematics-I-M.Ramya", "Engineering Physics-I-G.Bharathy", "Engineering Chemistry-I-R.Raja", "Computer Programming-E.Sakthivel", "Engineering Graphics-V.Tamizhselvi,G.Arun", "Computer Practise Laboratory-E.Sakthivel,Kiruba Wesley,R.Saktheeswari,V.M.Megala", "Engineering Practise Laboratory-S.Diraviabalan/I Venkatraman(I/C)", "Physics/Chemistry Lab-G.Bharathy/T.Balusamy", "Sports-C.Sandhiya"};


    String[] fteceaone = {"Technical English-I-S.B.Lavanya", "Mathematics-I-S.Prabhu", "Engineering Physics-I-N.R.Sheela", "Engineering Chemistry-I-N.Nachiappan", "Computer Programming-U.Poornima", "Engineering Graphics-E.Suresh/R.Ganesan", "Computer Practise Laboratory-U.Pornima,P.Sharon Femi,V.Ranjith,P.Nirmala", "Engineering Practise Laboratory-C.Kamal(I/C)/R.Ganesan", "Physics/Chemistry Lab-N.R.Sheeela/S.Stanly", "Sports-S.Reethi/S.Sangeethapriya"};


    String[] ftecebone = {"Technical English-I-R.Premraj", "Mathematics-I-N.S.Priya", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-N.Nachiyappan", "Computer Programming-A.Indumathi", "Engineering Graphics-V.Sridharan/Nishal", "Computer Practise Laboratory-A.Indumathi,V.Ranjith,V.Saroja", "Engineering Practise Laboratory-K.Ramprasad", "Physics/Chemistry Lab-K.Raju/S.Stanly", "Sports-N.Santhish,A.Bharathipriya"};


    String[] ftececone = {"Technical English-I-C.Amutha Charu Sheela", "Mathematics-I-Visalkshi Subramanian", "Engineering Physics-I-A.Anandavadival", "Engineering Chemistry-I-N.Nachiyappan", "Computer Programming-C.Silambarasi", "Engineering Graphics-M.Mohandass/V.Sridharan", "Computer Practise Laboratory-C.SilambarasiV.Saroja,S.Uvaraj Aruthkumar(I/C)", "Engineering Practise Laboratory-S.Kalyana Sundaram/A.Sureshkumar(I/C)", "Physics/Chemistry Lab-A.Anandavadivel,T.Balusamy", "Sports-S.Nithya/G.Loganathan"};

    String[] ftmechaone = {"Technical English-I-Ganapathi", "Mathematics-I-A.Suba", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-R.Raja", "Computer Programming-N.Uma", "Engineering Graphics-M.Prem Ananth/V.Senthilvelan", "Computer Practise Laboratory-N.Uma,V.Saroja,AR.Guru Gokul,R.Sakhteeshwari", "Engineering Practise Laboratory-R.Sakthivel/D Amudhavalli (I/C)", "Physics/Chemistry Lab-K.Raja/R.Raja", "Sports-G.Kirubakaran/M.Arulkumar/R.Ganesan"};

    String[] ftmechbone = {"Technical English-I", "Mathematics-I", "Engineering Physics-I", "Engineering Chemistry", "Computer Programming", "Engineering Graphics", "Computer Practise Laboratory", "Engineering Practise Laboratory", "Physics/Chemistry Lab", "Sports"};

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


        listView.setAdapter(new ArrayAdapter<String>(teacherlist.this, android.R.layout.simple_list_item_1, new ArrayList<String>()));

        if(x==1) {
            switch (z) // getting the valuefor depatrmnt
            {
                case 1:// automobile
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();
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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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

                                Toast.makeText(teacherlist.this, "Teacher list not available ", Toast.LENGTH_LONG).show();
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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list not available", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();

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
                                Toast.makeText(teacherlist.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
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
                                Toast.makeText(teacherlist.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();

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
        Toast.makeText(this,"Teachers list not available",Toast.LENGTH_LONG).show();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 1: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 2: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 3: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 4: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 5: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 6: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case 7: {
                        Toast.makeText(teacherlist.this, "Have a Great Day", Toast.LENGTH_SHORT).show();
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





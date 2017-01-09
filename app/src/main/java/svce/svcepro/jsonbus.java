package svce.svcepro;;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class jsonbus extends AppCompatActivity {

    Integer x;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsonbus);
        Bundle extras=getIntent().getExtras();
        x=extras.getInt("json");



        button=(Button)findViewById(R.id.btn);
        textView= (TextView) findViewById(R.id.mytext);
        textView.setText("Hit on Load");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(x)
                {
                    case 1:
                        Toast.makeText(jsonbus.this,"Acquiring json script",Toast.LENGTH_SHORT).show();
                        new Json().execute("https://feed43.com/3337533344320228.xml");
                        break;
                    case 2:
                        Toast.makeText(jsonbus.this,"Acquiring json script",Toast.LENGTH_SHORT).show();
                        new Jsonmain().execute("https://www.svce.ac.in/");
                        break;

                }



            }
        });

    }

    public class Json extends AsyncTask<String ,String ,String >
    {

       ProgressBar pro;


        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection connection=null;
            BufferedReader reader=null;
            StringBuffer buffer=new StringBuffer();
            pro=(ProgressBar)findViewById(R.id.progress);



            try {
                URL url=new URL(strings[0]);
                connection= (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream inputStream=connection.getInputStream();
                reader=new BufferedReader(new InputStreamReader(inputStream));

                String line="";

                while ((line=reader.readLine())!=null)
                {
                    buffer.append(line);
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            finally {
                if(connection!=null)
                {
                    connection.disconnect();
                }
                if(reader!=null)
                {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            String json=buffer.toString();
            try {
                JSONObject jsonObject=new JSONObject(json);
                JSONArray jsonArray=jsonObject.getJSONArray("table");
                buffer=new StringBuffer();

                for (int i=0;i<jsonArray.length();i++)
                {
                    jsonObject=jsonArray.getJSONObject(i);
                    String moviename=jsonObject.getString("Table");
                    int year=jsonObject.getInt("Date");
                    buffer.append(moviename+" - "+year+"\n");
                }
                return buffer.toString();

            } catch (JSONException e) {
                e.printStackTrace();
            }


            return buffer.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            String newstr=s.replaceAll("<tr>", " ");
            String newst=newstr.replaceAll("<td>"," ");
            String news=newst.replaceAll("</td>"," ");
            String strs=news.replaceAll("<br />","\n");
            String str=strs.replaceAll("</tr>"," ");
            String trys=str.replaceAll("<td colspan=" ," -> ");




            textView.setText(trys.substring(4300));
                Toast.makeText(jsonbus.this,"Json Acquired from Svce.ac.in",Toast.LENGTH_SHORT).show();
            pro.setVisibility(View.INVISIBLE);


        }
    }
    public class Jsonmain extends AsyncTask<String ,String ,String >
    {

        ProgressBar pro;


        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection connection=null;
            BufferedReader reader=null;
            StringBuffer buffer=new StringBuffer();
            pro=(ProgressBar)findViewById(R.id.progress);



            try {
                URL url=new URL(strings[0]);
                connection= (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream inputStream=connection.getInputStream();
                reader=new BufferedReader(new InputStreamReader(inputStream));

                String line="";

                while ((line=reader.readLine())!=null)
                {
                    buffer.append(line);
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            finally {
                if(connection!=null)
                {
                    connection.disconnect();
                }
                if(reader!=null)
                {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            String json=buffer.toString();
            try {
                JSONObject jsonObject=new JSONObject(json);
                JSONArray jsonArray=jsonObject.getJSONArray("table");
                buffer=new StringBuffer();

                for (int i=0;i<jsonArray.length();i++)
                {
                    jsonObject=jsonArray.getJSONObject(i);
                    String moviename=jsonObject.getString("Table");
                    int year=jsonObject.getInt("Date");
                    buffer.append(moviename+" - "+year+"\n");
                }
                return buffer.toString();

            } catch (JSONException e) {
                e.printStackTrace();
            }


            return buffer.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            String newstr=s.replaceAll("<tr>", " ");
            String newst=newstr.replaceAll("<td>"," ");
            String news=newst.replaceAll("</td>"," ");
            String strs=news.replaceAll("<br />","\n");
            String str=strs.replaceAll("</tr>"," ");
            String trys=str.replaceAll("<td colspan=" ," -> ");
            String dff=trys.replaceAll("<li class='news-item'>","\n");
            String dsl=dff.replaceAll("&nbsp"," ");
            String gfd=dsl.replaceAll("<a href="," ");
            String lkj=gfd.replaceAll("</li>","\n");
            String ff=lkj.replaceAll("</a>"," ");
            String hj=ff.replaceAll(";"," ");
            String gg=hj.replaceAll("/news/item.php?newsid="," ");
            String uu=gg.replaceAll("<ul>"," ");
            String rt=uu.replaceAll("<li>"," ");
            String hp=rt.replaceAll("</h2>"," ");
            String jj=hp.replaceAll("</ul>","\n");
            

            textView.setText(jj.substring(16400));
            Toast.makeText(jsonbus.this,"Json Acquired from Svce.ac.in",Toast.LENGTH_SHORT).show();
            pro.setVisibility(View.INVISIBLE);


        }
    }


}
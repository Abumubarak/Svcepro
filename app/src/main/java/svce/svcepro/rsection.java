package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class rsection extends AppCompatActivity {

    public int x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsection);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");
        List<data> data = fill_with_data();
        setTitle("Choose your Section");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(rsection.this,recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (z) {
                    case 1: { //automobile

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }

                    case 2: { //biotech

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }
                    case 3: { //chem

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 1: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 2);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }
                    case 4: { //civil

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }

                        }
                        break;
                    }
                    case 5: { //eee

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 1: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 2);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }
                    case 6: { //it

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 1: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 2);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }
                    case 7: { //ece

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 1: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 2);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 2: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 3);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }
                    case 8: { //cse

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 1: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 2);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 2: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 3);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }
                    case 9: { //mech

                        switch (position) {
                            case 0: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 1);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                            case 1: {
                                Intent newintent = new Intent(rsection.this, selectme.class);
                                newintent.putExtra("sec", 2);
                                newintent.putExtra("year", x);
                                newintent.putExtra("sem", y);
                                newintent.putExtra("sel", z);
                                startActivity(newintent);
                                break;
                            }
                        }
                        break;
                    }


                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("A SECTION", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.nasec));
        data.add(new data("B SECTION", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nbsec));
        data.add(new data("C SECTION", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.ncsec));

        return data;
    }
}
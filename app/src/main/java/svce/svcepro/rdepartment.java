package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class rdepartment extends AppCompatActivity {

    TextView deptdesc;
    public int x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdepartment);
        Bundle extras=getIntent().getExtras();
        x=extras.getInt("year");
        y=extras.getInt("sem");
        deptdesc=(TextView)findViewById(R.id.deptdesc);
        deptdesc.setText("All the departments\n are NBA, NAAC and \n ISO accrdited");

        List<data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerviewdept);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, rdepartment.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(rdepartment.this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(rdepartment.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 1);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 1: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 2);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 2: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 3);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 3: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 4);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 4: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 5);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 5: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 6);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 6: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 7);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 7: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 8);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                            case 8: {
                                Toast.makeText(rdepartment.this, "item one", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(rdepartment.this, rsection.class);
                                intent.putExtra("sel", 9);
                                intent.putExtra("year", x);
                                intent.putExtra("sem", y);
                                startActivity(intent);
                                break;
                            }
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                                Toast.makeText(rdepartment.this,"item one long",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        // do whatever
                    }
                })
        );

    }
    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("Automobile", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.nauto));
        data.add(new data("Biotech", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nbio));
        data.add(new data("Chemical", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nchem));
        data.add(new data("Civil", "After reuniting with his long-lost father, Po  must train a village of pandas", R.drawable.ncivil));
        data.add(new data("CSE", "After reuniting with his long-lost father, Po  must train a village of pandas", R.drawable.ncse));
        data.add(new data("EEE", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.neee));
        data.add(new data("ECE", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nece));
        data.add(new data("IT", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nit));
        data.add(new data("Mechanical", "After reuniting with his long-lost father, Po  must train a village of pandas", R.drawable.nmech));
        data.add(new data("Marine", "After reuniting with his long-lost father, Po  must train a village of pandas", R.drawable.nmarine));

        return data;
    }


}
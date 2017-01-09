package svce.svcepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class rsemester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsemester);
        List<data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerviewsem);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, rsemester.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(rsemester.this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(rsemester.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {
                            case 0: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 1);
                                intent.putExtra("year", 1);
                                startActivity(intent);
                                break;
                            }
                            case 1: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 2);
                                intent.putExtra("year", 1);
                                startActivity(intent);
                                break;
                            }
                            case 2: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 3);
                                intent.putExtra("year", 2);
                                startActivity(intent);
                                break;
                            }
                            case 3: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 4);
                                intent.putExtra("year", 2);
                                startActivity(intent);
                                break;
                            }
                            case 4: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 5);
                                intent.putExtra("year", 3);
                                startActivity(intent);
                                break;
                            }
                            case 5: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 6);
                                intent.putExtra("year", 3);
                                startActivity(intent);
                                break;
                            }

                            case 6: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 7);
                                intent.putExtra("year", 4);
                                startActivity(intent);
                                break;
                            }
                            case 7: {
                                Intent intent = new Intent(rsemester.this, rdepartment.class);
                                intent.putExtra("sem", 8);
                                intent.putExtra("year", 4);
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
                                Toast.makeText(rsemester.this,"item one long",Toast.LENGTH_SHORT).show();
                                break;
                        }
                        // do whatever
                    }
                })
        );

    }


    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("First Semester", "We didnt realize we were making memories we just knew we were having fun", R.drawable.nfirstsem));
        data.add(new data("Second Semester", "Every new friend is a new adventure and yes the start of a new tale ", R.drawable.nsecondsem));
        data.add(new data("Third Semester", "Prediction is very difficult,especially if its about M3 ", R.drawable.nthirdsem));
        data.add(new data("Fourth Semester", "After reuniting with his long-lost father, Po  must train a village of pandas", R.drawable.nfourthsem));
        data.add(new data("Fifth Semester", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.nfifthsem));
        data.add(new data("Sixth Semester", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nsixthsem));
        data.add(new data("Seventh Semester", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nseventhsem));
        data.add(new data("Eighth Semester", "After reuniting with his long-lost father, Po  must train a village of pandas", R.drawable.neighthsem));

        return data;
    }


}
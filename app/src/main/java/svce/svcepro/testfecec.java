package svce.svcepro;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 06/01/17.
 */

public class testfecec extends Fragment{
    int x,y,z,t;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        x=getArguments().getInt("year");
        y=getArguments().getInt("sem");
        z=getArguments().getInt("sel");
        t=getArguments().getInt("sec");
        View view= inflater.inflate(R.layout.nfinallay,null);
        List<data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewfinal);
        finalRecycler_View_Adapter adapter = new finalRecycler_View_Adapter(data,getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (y) {
                    case 1: {
                        Toast.makeText(getActivity(),"first",Toast.LENGTH_SHORT).show();
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable first", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 2: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 3: {
                        Toast.makeText(getActivity(),"third",Toast.LENGTH_SHORT).show();
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable Not Available", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors details not available", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 3);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 3);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff details not available", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);

                                break;
                            }


                        }
                        break;
                    }
                    case 4: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 5: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable Not Available", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors details not available", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 5);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 5);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);

                                break;
                            }


                        }
                    }
                    case 6: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
                                break;
                            }


                        }
                        break;
                    }
                    case 7: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable Not Available", Toast.LENGTH_SHORT).show();

                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors details not available", Toast.LENGTH_SHORT).show();
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 7);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfececone.class);
                                newint.putExtra("yearsem", 7);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;

                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);

                                break;
                            }


                        }
                        break;
                    }
                    case 8: {
                        switch (position) {
                            case 0: {
                                Toast.makeText(getActivity(), "Class Timetable", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), ttday.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                startActivity(newint);
                                break;
                            }
                            case 1: {
                                Toast.makeText(getActivity(), "Bus Routes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 1);
                                startActivity(newint);
                                break;
                            }
                            case 2: {
                                Toast.makeText(getActivity(), "Faculty Advisors", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), facultyadv.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 3: {
                                Toast.makeText(getActivity(), "Notes", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 4);
                                startActivity(newint);
                                break;
                            }
                            case 4: {
                                Toast.makeText(getActivity(), "Question Papers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), wfecectwo.class);
                                newint.putExtra("yearsem", 1);
                                startActivity(newint);
                                newint.putExtra("mysel", 5);
                                startActivity(newint);
                                break;
                            }
                            case 5: {
                                Toast.makeText(getActivity(), "Notifications", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), jsonbus.class);
                                newint.putExtra("json", 2);
                                startActivity(newint);
                                break;
                            }
                            case 6: {
                                Toast.makeText(getActivity(), "Handling Staff", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), teacherlist.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 7: {
                                Toast.makeText(getActivity(), "Office Bearers", Toast.LENGTH_SHORT).show();
                                Intent newint = new Intent(getActivity(), officeb.class);
                                newint.putExtra("sec", t);
                                newint.putExtra("year", x);
                                newint.putExtra("sem", y);
                                newint.putExtra("sel", z);
                                ;
                                startActivity(newint);
                                break;
                            }
                            case 8: {
                                Intent newint = new Intent(getActivity(), clgmap.class);
                                startActivity(newint);
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
        return view;
    }

    public List<data> fill_with_data() {

        List<data> data = new ArrayList<>();

        data.add(new data("Timetable", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.ntt));
        data.add(new data("Bus Schedule", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nbus));
        data.add(new data("Faculty Advisors", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nteachers));
        data.add(new data("Notes", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.nnotes));
        data.add(new data("Question Papers", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nqp));
        data.add(new data("Notifications", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nnotif));
        data.add(new data("Teachers", "Following the destruction of Metropolis, Batman embarks on a personal vendetta against Superman ", R.drawable.nteachers));
        data.add(new data("Office Bearers", "X-Men: Apocalypse is an upcoming American superhero film based on the X-Men characters that appear in Marvel Comics ", R.drawable.nofficeb));
        data.add(new data("College Map", "A feud between Captain America and Iron Man leaves the Avengers in turmoil.  ", R.drawable.nmap));


        return data;
    }
}
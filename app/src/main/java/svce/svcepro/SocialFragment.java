package svce.svcepro;

/**
 * Created by harishananth on 22/12/16.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SocialFragment extends Fragment {

    ImageSwitcher sw;
    Button prev,nxt;
    int pc=0,nc=0;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.second_layout,null);

        sw=(ImageSwitcher)v.findViewById(R.id.imgsw);
        prev=(Button)v.findViewById(R.id.button2) ;
        nxt=(Button)v.findViewById(R.id.button3);

        if (savedInstanceState == null) {
            addRssFragment();
        }


        sw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView= new ImageView(getActivity());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });

        sw.setImageResource(R.drawable.svceaa);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pc==0) {
                    //Toast.makeText(getActivity(),"one",Toast.LENGTH_SHORT).show();
                    sw.setImageResource(R.drawable.svceentt);
                    pc=pc-1;
                }
               else if(pc==-1) {
                    //Toast.makeText(getActivity(),"two",Toast.LENGTH_SHORT).show();
                    sw.setImageResource(R.drawable.svceauditt);
                    pc--;
                }
                else {
                   // Toast.makeText(getActivity(),"three",Toast.LENGTH_SHORT).show();
                    sw.setImageResource(R.drawable.svcebuill);
                    pc=0;
                }
            }
        });
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nc==0) {
                   // Toast.makeText(getActivity(),"one",Toast.LENGTH_SHORT).show();
                    sw.setImageResource(R.drawable.svcehostell);
                    nc=nc-1;
                }
                else if(nc==-1) {
                    //Toast.makeText(getActivity(),"two",Toast.LENGTH_SHORT).show();
                    sw.setImageResource(R.drawable.svcecricc);
                    nc--;
                }
                else {
                    //Toast.makeText(getActivity(),"three",Toast.LENGTH_SHORT).show();
                    sw.setImageResource(R.drawable.svcelcir);
                    nc=0;
                }
            }
        });

          return v;
    }
    private void addRssFragment() {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        RssFragment fragment = new RssFragment();
        transaction.add(R.id.fragment_container, fragment);
        transaction.commit();
    }


}
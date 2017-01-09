package svce.svcepro;

/**
 * Created by harishananth on 26/12/16.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Iterator;

/**
 * Created by harishananth on 29/06/16.
 */
public class busfone extends Fragment
{
    private TextView busdata;
    private String user_name,room_name;
    private DatabaseReference root;
    private String chat_msg="",chat_user_name;
    private String temp_key;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_a,container,false);
        busdata=(TextView)view.findViewById(R.id.busdata);
        root = FirebaseDatabase.getInstance().getReference().child("BUS");

        root.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                //append_chat_conversation(dataSnapshot);
                Iterator i=dataSnapshot.getChildren().iterator();
                while(i.hasNext())
                {
                    chat_user_name= (String) ((DataSnapshot)i.next()).getValue();
                    busdata.append(chat_user_name +"\n");
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                append_chat_conversation(dataSnapshot);
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        return view;
    }



    private void append_chat_conversation(DataSnapshot dataSnapshot)
    {
        Iterator i=dataSnapshot.getChildren().iterator();
        while(i.hasNext())
        {
            chat_user_name= (String) ((DataSnapshot)i.next()).getValue();

            busdata.append(chat_user_name  + "\n");
        }
    }
}
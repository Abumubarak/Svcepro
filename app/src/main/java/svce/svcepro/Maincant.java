package svce.svcepro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harishananth on 20/12/16.
 */

public class Maincant extends AppCompatActivity {
    int x=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        List<cdata> cdata = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mcrecyadapter adapter = new mcrecyadapter(cdata,Maincant.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(Maincant.this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        switch (position)
                        {

                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        switch (position)
                        {
                            case 1:
                                Toast.makeText(Maincant.this,"item one long",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(Maincant.this,userrate.class);
                                startActivity(intent);
                                break;
                        }
                        // do whatever
                    }
                })
        );
    }
    public List<cdata> fill_with_data() {

        List<cdata> data = new ArrayList<>();

        data.add(new cdata("Breakfast", (float) x,"Rs 45", R.drawable.breakfast));
        data.add(new cdata("Lunch", (float) x,"Rs 30", R.drawable.meals));
        data.add(new cdata("Snacks",(float) x ,"Rs 10 per piece", R.drawable.burgr));
        data.add(new cdata("Chocolates", (float) x,"Rs 5/10/20", R.drawable.choc));
        data.add(new cdata("Parle biscuits", (float) x,"Rs 5/10/20", R.drawable.biscu));
        data.add(new cdata("Chips", (float) x,"Rs 5/10/20", R.drawable.chips));
        data.add(new cdata("Britannia biscuits", (float) x,"Rs 5/10/20", R.drawable.britbisc));
        data.add(new cdata("Soft drinks", (float) x,"Rs 5/10/20", R.drawable.softdrinks));
        return data;
    }
}

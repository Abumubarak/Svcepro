package svce.svcepro;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class finalactivity extends AppCompatActivity {
ImageView bus,timetable,notes,notifications,teachers,roll,map,qp,assesment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalactivity);
        actions();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuinfalter=getMenuInflater();
        menuinfalter.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.About:
                Intent newintent2=new Intent(finalactivity.this,bout.class);
                startActivity(newintent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void actions()
    {
        bus=(ImageView)findViewById(R.id.busc);
        timetable=(ImageView)findViewById(R.id.timetable);
        notifications=(ImageView)findViewById(R.id.noti);
        qp=(ImageView)findViewById(R.id.qp);
        notes=(ImageView)findViewById(R.id.notes);
        teachers=(ImageView)findViewById(R.id.teacher);
        roll=(ImageView)findViewById(R.id.roll);
        map=(ImageView)findViewById(R.id.map);
        assesment=(ImageView)findViewById(R.id.asses);
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.svce.ac.in/departments/transport/schedule.php"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        assesment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"Your Assesment details",Toast.LENGTH_SHORT).show();
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/testing.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"SVCE Map",Toast.LENGTH_SHORT).show();
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"Notes",Toast.LENGTH_SHORT).show();
            }
        });
        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"Class Timetable",Toast.LENGTH_SHORT).show();
            }
        });
        teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"Handling Staff",Toast.LENGTH_SHORT).show();
            }
        });
        qp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"Question Papers",Toast.LENGTH_SHORT).show();
            }
        });
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"Roll Number list",Toast.LENGTH_SHORT).show();
            }
        });
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalactivity.this,"Notifications",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

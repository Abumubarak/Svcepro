package svce.svcepro;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.pushbots.push.Pushbots;

public class display extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Pushbots.sharedInstance().init(this);
        Pushbots.sharedInstance().setCustomHandler(customHandler.class);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
       final ImageView logo= (ImageView) findViewById(R.id.logo);
        final Animation an= AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        //final Animation an2= AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade_out);
        logo.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //logo.startAnimation(an2);
                finish();
                Intent nextintent = new Intent(display.this,navandtab.class);
                startActivity(nextintent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                //start your activity here
                Intent nextintent = new Intent(display.this,navandtab.class);
                startActivity(nextintent);
            }

        }, 1000);
        transit();
    }

    public void transit()
    {
ImageView logo=(ImageView)findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newintent=new Intent(display.this,navandtab.class);
                startActivity(newintent);
            }
        });

    }

}

package svce.svcepro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class wfcsebtwo extends Activity {


    private WebView mywebview;
    Integer x, r;

    Activity activity;
    private ProgressDialog progDailog;

    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webcli);


        Bundle extras = getIntent().getExtras();
        r = extras.getInt("yearsem");
        x = extras.getInt("mysel");
        activity = this;

        progDailog = ProgressDialog.show(activity, "Loading", "Please wait...", true);
        progDailog.setCancelable(false);


        mywebview = (WebView) findViewById(R.id.webview);


        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.getSettings().setLoadWithOverviewMode(true);
        mywebview.getSettings().setUseWideViewPort(true);
        mywebview.getSettings().setSupportZoom(true);
        mywebview.getSettings().setDisplayZoomControls(true);
        mywebview.getSettings().setBuiltInZoomControls(true);
        mywebview.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // progDailog.show();
                view.loadUrl(url);

                return true;
            }

            @Override
            public void onPageFinished(WebView view, final String url) {
                progDailog.dismiss();
            }
        });
// switch here

        switch (r)  //  hee r act as respective sem )2,4,6,8)

        {
            case 2: // scnd sem
            {

                switch (x) {
                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!AoX_vuToRJmpcPucQl1rCeHbI8I");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!AoX_vuToRJmpcPucQl1rCeHbI8I");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;
            }
            case 4: // 4th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://www.dropbox.com/sh/2x2b2jyq566fsvf/AADtCbV_3jBvrp-zaToNWtJPa?dl=0");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!AoX_vuToRJmpcPucQl1rCeHbI8I");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;
            }
            case 6: // 6th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!AoX_vuToRJmpcPucQl1rCeHbI8I");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!AoX_vuToRJmpcPucQl1rCeHbI8I");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;

            }
            case 8://8th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!AoX_vuToRJmpcPucQl1rCeHbI8I");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }
                    case 5: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!AoX_vuToRJmpcPucQl1rCeHbI8I");
                        mywebview.setDownloadListener(new DownloadListener() {
                            public void onDownloadStart(String url, String userAgent,
                                                        String contentDisposition, String mimetype,
                                                        long contentLength) {
                                Intent i = new Intent(Intent.ACTION_VIEW);

                                i.setData(Uri.parse(url));
                                startActivity(i);
                            }
                        });

                        break;
                    }

                }
                break;
            }



        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mywebview.canGoBack()) {
                        mywebview.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }

}

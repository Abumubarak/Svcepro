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


public class wfautoone extends Activity {


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

        switch (r)  //  hee r act as respective sem )1,3,5,7)

        {
            case 1: // frst sem
            {

                switch (x) {
                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65ugQGbm__mTqyZYKhV");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65ugQKO1RVtyQYfobiI");
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
            case 3: // 3rd sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65ucswms3CUtfKMeWU");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65ucxJWVHUi3l-LYYM");
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
            case 5: // 5th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65udNNMdQlKzAmaI7M");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65udZlsc7rNfKp6x4c");
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
            case 7://7th sem
            {
                switch (x) {

                    case 4: {
                        Toast.makeText(this,"Connecting to One Drive Server please wait",Toast.LENGTH_LONG).show();
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65udhdXf6wl4HXdOfo");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!ArbNhL4Su65ud3uoLcI7x_E1X0g");
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
    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
            Intent newint=new Intent(wfautoone.this,department.class);
            startActivity(newint);
            // do your stuff here
            return true;
        }
        return super.onKeyLongPress(keyCode, event);
    }

}

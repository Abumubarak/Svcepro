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


public class wfeeeaone extends Activity {


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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgcL7z5pMIkakxy78");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgcWz9R2D8hTyvLN4");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgfFU_WfTSj5tUYdw");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgeDN5pZjhfcRB8Nc");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgdjYp82fMcXBE1mw");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgd_zDaL7ybxGYuUs");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgct0z9dyH9i40Opc");
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
                        mywebview.loadUrl("https://1drv.ms/f/s!AoBPwamchuHgc5eRcoYpWz7yfrw");
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

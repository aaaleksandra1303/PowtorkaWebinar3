package webinar3.webinar.akademiakodu.pl.powtorkawebinar3;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {


    @BindView(R.id.openActivity)
    Button openActivity;
    public String text = "Przekazuje informacje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);




    }

    @OnClick(R.id.openActivity)
    public void clicked(View v)
    {

        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Pobieram muzyke");
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setIndeterminate(false);
        dialog.setMax(10);
        dialog.show();
        dialog.setProgress(5);

        for( int i =1;i<=10;i++)
        {

            dialog.show();
            dialog.setProgress(i);

        }






    }
}

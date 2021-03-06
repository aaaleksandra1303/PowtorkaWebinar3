package webinar3.webinar.akademiakodu.pl.powtorkawebinar3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends Activity {

    @BindView(R.id.responseText)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        Intent i = getIntent();
        if(i.hasExtra("key"))
        {
            String response = i.getStringExtra("key");
            textView.setText(response);
        }
    }
}

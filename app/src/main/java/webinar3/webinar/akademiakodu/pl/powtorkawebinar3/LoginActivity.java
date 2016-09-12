package webinar3.webinar.akademiakodu.pl.powtorkawebinar3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent i = getIntent();
        if(i.hasExtra("hej"))
        {
            String response = i.getExtras().getString("key");
        }
    }
}

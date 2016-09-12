package webinar3.webinar.akademiakodu.pl.powtorkawebinar3;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        String text = "Przekazuje informacje";
        Intent i = new Intent(this,LoginActivity.class);

        i.putExtra("key",text);

        startActivity(i);

    }
}

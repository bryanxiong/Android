package mobile.application;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    Button bLogin;
    ImageButton bFacebook;
    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        bLogin = (Button) findViewById(R.id.btLogin);
        bFacebook = (ImageButton) findViewById(R.id.btFacebook);
        etEmail = (EditText) findViewById(R.id.Email);
        etPassword = (EditText) findViewById(R.id.Password);

        bLogin.setOnClickListener(this);
        bFacebook.setOnClickListener(this);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0: return null;
                case 1: return null;
                default: return null;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }



    @Override
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.btLogin:
                break;
            case R.id.btFacebook:
                break;
        }
    }
}

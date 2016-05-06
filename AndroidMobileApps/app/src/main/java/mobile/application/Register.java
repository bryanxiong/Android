package mobile.application;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Register extends Fragment implements View.OnClickListener{

    Button bRegister;
    EditText etUsername, etEmail, etPassword, etConfirmPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        View v = inflater.inflate(R.layout.register, container, false);

        bRegister = (Button) v.findViewById(R.id.btRegister);
        etUsername = (EditText) v.findViewById(R.id.Username);
        etEmail = (EditText) v.findViewById(R.id.Email);
        etPassword = (EditText) v.findViewById(R.id.Password);
        etConfirmPassword = (EditText) v.findViewById(R.id.ConfirmPassword);

        bRegister.setOnClickListener(this);

        /* http://stackoverflow.com/questions/18413309/how-to-implement-a-viewpager-with-different-fragments-layouts/18413437#18413437 */
        return v;
    }

    public static Register newInstance()

/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        bRegister = (Button) findViewById(R.id.btRegister);
        etUsername = (EditText) findViewById(R.id.Username);
        etEmail = (EditText) findViewById(R.id.Email);
        etPassword = (EditText) findViewById(R.id.Password);
        etConfirmPassword = (EditText) findViewById(R.id.ConfirmPassword);

        bRegister.setOnClickListener(this);
    }
*/

    @Override
    public void onClick(View v)
    {
        switch(v.getId()){
            case R.id.Register:
                break;
        }
    }
}

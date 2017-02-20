package lamln.startactivityforresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    public static final int LOGIN_REQUEST = 1;
    private TextView lblWellcom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) this.findViewById(R.id.btn_Login);
        btnLogin.setOnClickListener(this);
        lblWellcom = (TextView)this.findViewById(R.id.lbl_wellcom);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivityForResult(intent,LOGIN_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == LOGIN_REQUEST){
            if(resultCode==RESULT_OK){
                lblWellcom.setText("Login Success");
                btnLogin.setVisibility(View.INVISIBLE);
            }else{
                lblWellcom.setText("Login Fail");
            }
        }
    }
}

package lamln.startactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;
    public EditText edtName;
    public EditText edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnLogin =(Button)this.findViewById(R.id.btn_Login);
        btnLogin.setOnClickListener(this);

        edtName = (EditText)this.findViewById(R.id.edt_Name);
        edtPass = (EditText)this.findViewById(R.id.edt_Password);

    }

    @Override
    public void onClick(View v) {
        String name = edtName.getText().toString();
        String pass = edtPass.getText().toString();
        Intent intent = new Intent();
         if(name.equals("Lamln") && pass.equals("123")){
             setResult(Activity.RESULT_OK,intent);
             finish();
         }else{
             setResult(Activity.RESULT_CANCELED, intent);
             finish();
         }
    }
}

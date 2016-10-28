package com.example.jhon.materialdesign;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jhon.materialdesign.Util.ValidateStrings;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn;
    TextInputLayout email;
    TextInputLayout pass;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        btn = (Button) findViewById(R.id.btn);
        email = (TextInputLayout) findViewById(R.id.email);
        pass = (TextInputLayout) findViewById(R.id.pass);
        linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        btn.setOnClickListener(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bienvenido");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                if (ValidateStrings.areStringsValidate(email.getEditText().getText().toString(),
                        pass.getEditText().getText().toString())){

                }
                else {
                    Snackbar snackbar = Snackbar.make(linearLayout,"Campos invalidos, por favor revisar",Snackbar.LENGTH_INDEFINITE);
                    snackbar.setAction("Aceptar", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, "El usuario acepto la sugerencia", Toast.LENGTH_SHORT).show();
                        }
                    });
                    snackbar.show();
                }
                break;
        }
    }


}

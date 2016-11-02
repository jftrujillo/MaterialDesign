package com.example.jhon.materialdesign;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jhon.materialdesign.Util.ValidateStrings;
import com.example.jhon.materialdesign.fragments.TimeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,TimeFragment.OnTimeI {
    Toolbar toolbar;
    Button btn,hora;
    TextInputLayout email;
    TextInputLayout pass;
    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        btn = (Button) findViewById(R.id.btn);
        hora = (Button) findViewById(R.id.hora);
        hora.setOnClickListener(this);
        email = (TextInputLayout) findViewById(R.id.email);
        pass = (TextInputLayout) findViewById(R.id.pass);
        //linearLayout = (LinearLayout) findViewById(R.id.linear_layout);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
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

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                if (ValidateStrings.areStringsValidate(email.getEditText().getText().toString(),
                        pass.getEditText().getText().toString())){

                }
                else {
                    Snackbar snackbar = Snackbar.make(coordinatorLayout,"Campos invalidos, por favor revisar",Snackbar.LENGTH_INDEFINITE);
                    snackbar.setAction("Aceptar", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, "El usuario acepto la sugerencia", Toast.LENGTH_SHORT).show();
                        }
                    });
                    snackbar.show();
                }


                break;
            case R.id.hora:
                android.app.DialogFragment timePicker = new TimeFragment();
                timePicker.show(getFragmentManager(),"TimePicker");
                break;
        }
    }


    @Override
    public void onTimeSetInterface(int hour, int minute) {
        Toast.makeText(this, "" + hour + minute, Toast.LENGTH_SHORT).show();
    }
}

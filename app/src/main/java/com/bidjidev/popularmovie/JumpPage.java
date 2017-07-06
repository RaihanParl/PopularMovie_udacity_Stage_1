package com.bidjidev.popularmovie;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JumpPage extends AppCompatActivity {
EditText edPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_page);
        edPage = (EditText)findViewById(R.id.edPage);
        TextView txtPage = (TextView)findViewById(R.id.pageNow);
        txtPage.setText(MainActivity.page + "");

    }
public void oJump (View view){
    String sdatPage = edPage.getText().toString();
    int idatPage =Integer.parseInt(sdatPage);
    if (idatPage >= 1001){
        Toast.makeText(this, "page must be less than or equal to 1000", Toast.LENGTH_SHORT).show();
    }else {
        MainActivity.page = idatPage;
        startActivity(new Intent(this, MainActivity.class));
    }
}
}

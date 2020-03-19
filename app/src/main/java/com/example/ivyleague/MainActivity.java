package com.example.ivyleague;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this, "Your file is shared", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.save:
                Toast.makeText(this, "Your file is saved", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.recycleView:
                jump();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void jump(){
        Intent intent = new Intent(this, RecycleActivity.class);
        startActivity(intent);

    }
}

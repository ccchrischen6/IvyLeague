package com.example.ivyleague;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class RecyclerActivity extends AppCompatActivity {

    UniversityAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        setTitle("University List");
        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new UniversityAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.secend_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                Universities.add(uniGenerator());
                adapter.notifyDataSetChanged();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }


    private void initialData(){
        University u1 = new University(
                "Harvard",
                "Harvard University is devoted to excellence in teaching, learning, and research, and to developing leaders in many disciplines who make a difference globally.",
                R.drawable.harvard);

        University u2 = new University(
                "Yale",
                "Since its founding in 1701, Yale University has been dedicated to expanding and sharing knowledge, inspiring innovation, and preserving cultural and scientific ...",
                R.drawable.yale);

        University u3 = new University(
                "Columbia",
                "Because a member of the Columbia community has been quarantined as a result of exposure to the coronavirus (COVID-19), classes are suspended on ...",
                R.drawable.columbia);
    }

    private University uniGenerator(){
        return Universities.get((int) (Math.random()*Universities.size()));
    }
}

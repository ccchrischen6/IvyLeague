package com.example.ivyleague;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
    }

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

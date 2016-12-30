package com.example.ameer_mw.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Lesson> lessonList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LessonsAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new LessonsAdapter(lessonList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
        FillList();
    }

    private  void FillList(){
        Lesson lesson=new Lesson("Andriod","t1","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t2","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t3","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t4","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t5","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t6","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t7","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t8","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t9","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t10","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t11","1/12/2016");
        lessonList.add(lesson);
        lesson=new Lesson("Andriod","t12","1/12/2016");
        lessonList.add(lesson);

    }
}

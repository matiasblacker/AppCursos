package com.example.projectapp.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectapp.Adapter.CoursesAdapter;
import com.example.projectapp.Model.CoursesModel;
import com.example.projectapp.R;

import java.util.ArrayList;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourseList;
    private RecyclerView recyclerViewCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);
        initRecyclerView();
    }
    private void initRecyclerView(){
        ArrayList<CoursesModel> items = new ArrayList<>();
        items.add(new CoursesModel("Programa de certificacion \nen Inteligencia Artificial",150.000,"ic_1"));
        items.add(new CoursesModel("Arquitectura de \nGoogle Cloud Platform",69.000,"ic_2"));
        items.add(new CoursesModel("Programacion fundamental \nde Java",150.000,"ic_3"));
        items.add(new CoursesModel("Introducccion a \ndiseño UX/UI",80.000,"ic_4"));
        items.add(new CoursesModel("Programa de Post Grado en \nIngenieria de Big Data",59.000,"ic_5"));

        recyclerViewCourse=findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapterCourseList=new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourseList);
    }
}
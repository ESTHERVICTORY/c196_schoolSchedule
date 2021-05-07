package com.example.schoolscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class CourseInstructor extends AppCompatActivity {

    Button btnAdd, btnEdit, btnDelete;
    EditText insertInstructorName, insertPhoneNumber, insertEmailText;
    ListView courseInstructorListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_instructor);

        btnAdd =findViewById(R.id.btnAdd);
        btnEdit =findViewById(R.id.btnEdit);
        btnDelete =findViewById(R.id.btnDelete);
        insertInstructorName =findViewById(R.id.courseInstructor);
        insertPhoneNumber =findViewById(R.id.insertPhoneNumber);
        insertEmailText =findViewById(R.id.insertEmailText);
        courseInstructorListView =findViewById(R.id.courseInstructorListView);

        //Onclick Listeners
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CourseInstructor.this, "Add Button", Toast.LENGTH_SHORT).show();

            }
        });
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CourseInstructor.this, "Edit Button", Toast.LENGTH_SHORT).show();

            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CourseInstructor.this, "Delete Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
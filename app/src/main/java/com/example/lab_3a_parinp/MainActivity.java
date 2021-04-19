package com.example.lab_3a_parinp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.widget.ListView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student studentOne = new Student("Michael","Smith","Computer Science");
        Student studentTwo = new Student("Valerie","Walker","Computer Science");
        Student studentThree = new Student("Stephanie","Freeman","Computer Science");
        Student studentFour = new Student("Stephen","Getbetter","Computer Science");
        Student studentFive = new Student("Dwayne","Johnson","Computer Science");

        studentArrayList.add(studentOne);
        studentArrayList.add(studentTwo);
        studentArrayList.add(studentThree);
        studentArrayList.add(studentFour);
        studentArrayList.add(studentFive);
        StudentAdapter studentAdapter = new StudentAdapter(getApplicationContext(), studentArrayList);
        ListView listView = findViewById(R.id.student);
        listView.setAdapter(studentAdapter);
    }
}
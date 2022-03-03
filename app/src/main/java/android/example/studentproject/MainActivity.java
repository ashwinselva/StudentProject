package android.example.studentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    View addData;
    String ETname;
    String ETnumber;
    private ProjectViewModel projectViewModel;
    private Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addData(View view) {
        ETname = findViewById(R.id.ETname).toString();
        ETnumber = findViewById(R.id.ETnumber).toString();
        student.name = ETname;
        student.ph = ETnumber;
        projectViewModel.insertProject(student);
        finish();
    }
}
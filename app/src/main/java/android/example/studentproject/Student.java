package android.example.studentproject;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Student_DB")
public class Student {

    @PrimaryKey(autoGenerate = true)
    public int pid;

    @ColumnInfo(name = "Name")
    public String name;
    @ColumnInfo(name = "Phone_Number")
    public String ph;

}

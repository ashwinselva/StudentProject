package android.example.studentproject;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ProjectDao {

    @Insert
    void insertProject(Student student);

    @Update
    void updateProject(Student student);

    @Delete
    void deleteProject(Student student);

    @Query("SELECT * FROM Student_DB")
    List<Student> getAllProject();
}

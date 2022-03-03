package android.example.studentproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.List;

public class ProjectViewModel extends AndroidViewModel {

    private AppRepo apprepo;

    public ProjectViewModel(@NonNull Application application) {
        super(application);
        apprepo = new AppRepo(application);
    }

    public void insertProject(Student student){
        apprepo.insertProject(student);
    }
    public void updateProject(Student student){
        apprepo.updateProject(student);
    }
    public void deleteProject(Student student){
        apprepo.deleteProject(student);
    }

    public List<Student> getAllProject(){
        return apprepo.getAllProject();
    }

}

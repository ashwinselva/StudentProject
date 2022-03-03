package android.example.studentproject;

import android.content.Context;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppRepo {

    private AppDatabase appDatabase;
    private Executor executor = Executors.newSingleThreadExecutor();

    public AppRepo(Context context){
        appDatabase = AppDatabase.getInstance(context);

    }

    public void insertProject(Student student){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                appDatabase.projectDao.insertProject(student);
            }
        });


    }

    public void updateProject(Student student){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                appDatabase.projectDao.updateProject(student);

            }
        });
    }

    public void deleteProject(Student student){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                appDatabase.projectDao.deleteProject(student);
            }
        });


    }
    public List<Student> getAllProject(){
        return appDatabase.projectDao.getAllProject();
    }
}

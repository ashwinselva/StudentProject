package android.example.studentproject;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Student.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {
    public static AppDatabase instance;
    public static final String DATABASE_NAME = "student.db";;
    //private static final Object LOCK = new Object();
    public ProjectDao projectDao;

    public static AppDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class,
                    DATABASE_NAME).build();
        }
        return instance;
    }

}

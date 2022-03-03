package android.example.studentproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    List<Student> localData;
    private ProjectViewModel viewModel;

    public StudentAdapter() {
        localData = viewModel.getAllProject();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_item,
                parent, false);
        return new ViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student mCurrent = localData.get(position);
        ViewHolder.nameView.setText(mCurrent.name);
        ViewHolder.numView.setText(mCurrent.ph);
    }

    @Override
    public int getItemCount() {
        if(localData!=null){
        return localData.size();}
        else
            return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        static TextView nameView;
        static TextView numView;
        final StudentAdapter mAdapter;

        public ViewHolder(View view ,StudentAdapter mAdapter ) {
            super(view);
            nameView = view.findViewById(R.id.textName);
            numView = view.findViewById(R.id.textNumber);
            this.mAdapter = mAdapter;
        }
    }
}

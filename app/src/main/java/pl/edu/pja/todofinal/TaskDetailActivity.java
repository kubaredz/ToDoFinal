package pl.edu.pja.todofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TaskDetailActivity extends AppCompatActivity {

    private EditText titleEditText, descEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);
        initWidgets();
    }

    private void initWidgets() {
        titleEditText = findViewById(R.id.titleEditText);
        descEditText = findViewById(R.id.descriptionEditText);
    }

    public void saveTask(View view) {
        String title = String.valueOf(titleEditText.getText());
        String desc = String.valueOf(descEditText.getText());

        int id = Task.taskArrayList.size();
        Task newTask = new Task(id, title, desc);
        Task.taskArrayList.add(newTask);
        finish();
    }
}
package com.example.campusbuzz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlertAdapter alertAdapter;
    private List<Alert> alertList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize alert list and adapter
        alertList = new ArrayList<>();
        alertAdapter = new AlertAdapter(alertList);

        // Set the adapter to RecyclerView
        recyclerView.setAdapter(alertAdapter);

        // Add some sample data (You can replace this with dynamic data from a database or API)
        loadSampleAlerts();
    }

    private void loadSampleAlerts() {
        alertList.add(new Alert(
                "Campus Event 1",
                "Join us for the campus annual event this Saturday.",
                "2025-05-10 10:00 AM",
                "Student Council",
                "Cultural Committee"
        ));
        alertList.add(new Alert(
                "Placement Drive",
                "A placement drive is scheduled for next week.",
                "2025-05-12 09:00 AM",
                "Placement Cell",
                "Recruitment"
        ));
        alertList.add(new Alert(
                "Sports Meet",
                "Get ready for the upcoming sports meet.",
                "2025-05-15 02:00 PM",
                "Sports Department",
                "Physical Education"
        ));
        alertList.add(new Alert(
                "Workshop",
                "A workshop on web development will be held tomorrow.",
                "2025-05-09 03:00 PM",
                "IT Department",
                "Web Development"
        ));

        // Notify adapter to update RecyclerView
        alertAdapter.notifyDataSetChanged();
    }
}

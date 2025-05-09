package com.example.campusbuzz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AlertAdapter extends RecyclerView.Adapter<AlertAdapter.AlertViewHolder> {

    private List<Alert> alertList;

    // Constructor
    public AlertAdapter(List<Alert> alertList) {
        this.alertList = alertList;
    }

    @NonNull
    @Override
    public AlertViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alert, parent, false);
        return new AlertViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlertViewHolder holder, int position) {
        Alert alert = alertList.get(position);
        holder.titleTextView.setText(alert.getTitle());
        holder.descriptionTextView.setText(alert.getDescription());
        holder.dateTimeTextView.setText(alert.getDateTime());
        holder.authorTextView.setText(alert.getAuthor());
        holder.departmentTextView.setText(alert.getDepartment());
    }

    @Override
    public int getItemCount() {
        return alertList.size();
    }

    // ViewHolder class
    public static class AlertViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, descriptionTextView, dateTimeTextView, authorTextView, departmentTextView;

        public AlertViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.alert_title);
            descriptionTextView = itemView.findViewById(R.id.alert_description);
            dateTimeTextView = itemView.findViewById(R.id.alert_date_time);
            authorTextView = itemView.findViewById(R.id.alert_author);
            departmentTextView = itemView.findViewById(R.id.alert_department);
        }
    }
}


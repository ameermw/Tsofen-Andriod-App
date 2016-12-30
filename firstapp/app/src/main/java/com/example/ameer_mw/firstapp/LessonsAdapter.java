package com.example.ameer_mw.firstapp;

/**
 * Created by Ameer_MW on 26/12/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.MyViewHolder> {

    private List<Lesson> lessonslist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, subject, date;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            subject = (TextView) view.findViewById(R.id.subject);
            date = (TextView) view.findViewById(R.id.date);
        }
    }


    public LessonsAdapter(List<Lesson> lessonslist) {
        this.lessonslist = lessonslist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lessonlayout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Lesson lesson = lessonslist.get(position);
        holder.title.setText(lesson.getTitle());
        holder.subject.setText(lesson.getSubject());
        holder.date.setText(lesson.getDate());
    }

    @Override
    public int getItemCount() {
        return lessonslist.size();
    }


}

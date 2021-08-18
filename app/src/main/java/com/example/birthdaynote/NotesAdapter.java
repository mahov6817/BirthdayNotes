package com.example.birthdaynote;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder>{
    private ArrayList<Notes> note;

    public NotesAdapter(ArrayList<Notes> notes) {
        note = notes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_birthday_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotesAdapter.ViewHolder holder, int position) {
        Notes notes = note.get(position);
        holder.textViewName.setText(notes.getName());
        holder.textViewDesc.setText(notes.getDesc());
    }

    @Override
    public int getItemCount() {
        return note.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName;
        public TextView textViewDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.tv_name);
            textViewDesc = itemView.findViewById(R.id.tv_description);
        }
    }
}

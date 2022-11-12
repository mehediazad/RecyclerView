package com.example.recycleviewstander;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdopter extends RecyclerView.Adapter<MyAdopter.MyViewHolder> {

    private ArrayList<User> nameList;

    public MyAdopter(ArrayList<User> nameList)
    {
        this.nameList = nameList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView myNameTextView, lastName, age;

        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);

            myNameTextView = itemView.findViewById(R.id.FirstNameTextId);
            lastName = itemView.findViewById(R.id.LastNameTextId);
            age = itemView.findViewById(R.id.AgeTextId);
        }
    }

    @NonNull
    @Override
    public MyAdopter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.childlayout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdopter.MyViewHolder holder, int position) {
        User user = nameList.get(position);
        holder.myNameTextView.setText(user.getFirstName());
        holder.lastName.setText(" "+user.getLastName());
        holder.age.setText(String.valueOf(user.getAge()));

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }


}

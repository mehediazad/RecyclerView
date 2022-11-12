package com.example.recycleviewstander;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private RecyclerView myRecyclerView;

    private ArrayList<User> nameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = (RecyclerView) findViewById(R.id.RecyclerViewID);
        nameList = new ArrayList<>();
        
        setUserInfo();
        setAdapter();
        
    }

    private void setAdapter() {
        MyAdopter myAdopter = new MyAdopter(nameList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        myRecyclerView.setLayoutManager(layoutManager);
        myRecyclerView.setItemAnimator(new DefaultItemAnimator());
        myRecyclerView.setAdapter(myAdopter);
    }

    private void setUserInfo() {
        nameList.add(new User("Mehedi","Hasan", 23));
        nameList.add(new User("Hasan","Mahabub",32));
        nameList.add(new User("Azad","Sorkar",27));
        nameList.add(new User("Md Abbad ","Hosen",12));
        nameList.add(new User("Md Ali","Sorkar",18));
        nameList.add(new User("Md Sazzad","Hossain",25));
        nameList.add(new User("Md Shamin","Hosen",22));
        nameList.add(new User("Md Momin","Hak",25));
        nameList.add(new User("Md Tuhin","Islam",22));
        nameList.add(new User("Md Tuha","Islam",19));
    }
}
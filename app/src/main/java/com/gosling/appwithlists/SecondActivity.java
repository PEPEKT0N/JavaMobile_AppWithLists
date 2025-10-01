package com.gosling.appwithlists;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AnimalAdapter adapter;
    private List<Animal> animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Заполняем список животных
        animalList = new ArrayList<>();
        animalList.add(new Animal("Кот"));
        animalList.add(new Animal("Собака"));
        animalList.add(new Animal("Лев"));
        animalList.add(new Animal("Тигр"));
        animalList.add(new Animal("Слон"));

        adapter = new AnimalAdapter(animalList);
        recyclerView.setAdapter(adapter);
    }
}

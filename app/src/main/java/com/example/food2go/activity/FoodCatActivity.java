package com.example.food2go.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import com.example.food2go.R;
import com.example.food2go.activity.Domain.CategoryDomain;
import com.example.food2go.activity.Domain.FoodDomain;
import com.example.food2go.activity.adapter.ItemsAdapter;

public class FoodCatActivity extends AppCompatActivity  {
    private RecyclerView recyclerViewItemsList;
    private RecyclerView.Adapter adapter2;
    private String pos;
    private static final String TAG = "FoodCatActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_cat);


        if(getIntent().hasExtra("selected_cat")) {
            CategoryDomain categoryDomain = getIntent().getParcelableExtra("selected_cat");
            pos=categoryDomain.getTitle();
            Log.d(TAG, "onCreate: " + categoryDomain.getTitle());
        }

        recyclerViewPopularList();

    }


    private void recyclerViewPopularList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerViewItemsList=findViewById(R.id.recyclerView3);
        recyclerViewItemsList.setLayoutManager(linearLayoutManager);
        ArrayList<FoodDomain> foodlist = new ArrayList<>();

        switch (pos){
            case "Pizza":
                foodlist.add(new FoodDomain("Paperoni pizza" ,"pizza1","",15.00));
                foodlist.add(new FoodDomain("Vegetable pizza" , "pizza2","",12.50));
                foodlist.add(new FoodDomain("Vegetable pizza","pizza3","",9.76));
                foodlist.add(new FoodDomain("Vegetable pizza","pizza4","",9.76));
                adapter2= new ItemsAdapter(foodlist);
                recyclerViewItemsList.setAdapter(adapter2);
                break;
            case "Burger":
                foodlist.add(new FoodDomain("Hamburger Veggie" ,"burger","",6.50));
                foodlist.add(new FoodDomain("Cheeseburger Whopper", "burger1", "", 14.00));
                foodlist.add(new FoodDomain("Burger with Ham and Cheese","burger2","",11.50));
                foodlist.add(new FoodDomain("Bacon Cheeseburger","burger3","",17.00));
                adapter2= new ItemsAdapter(foodlist);
                recyclerViewItemsList.setAdapter(adapter2);
                break;
            case "Hotdog":
                foodlist.add(new FoodDomain("Hotdog" ,"hotdog","",8.00));
                foodlist.add(new FoodDomain(" Yerevan Hot dog" , "hotdog1","",5.25));
                foodlist.add(new FoodDomain("Hotdog on bun with cheese sauce","hotdog2","",6.00));
                foodlist.add(new FoodDomain("Hotdog with bread and lettuce","hotodog3","",5.00));
                adapter2= new ItemsAdapter(foodlist);
                recyclerViewItemsList.setAdapter(adapter2);
                break;

            case "Drink":
                foodlist.add(new FoodDomain("Sprite" ,"sprite","",1.90));
                foodlist.add(new FoodDomain(" Cola" , "cola","",2.50));
                foodlist.add(new FoodDomain("Fanta","fanta","",2.00));
                foodlist.add(new FoodDomain("All In One","allinone","",4.00));
                adapter2= new ItemsAdapter(foodlist);
                recyclerViewItemsList.setAdapter(adapter2);
                break;

            case "Donut":
                foodlist.add(new FoodDomain("Strawberry Donut" ,"donut","",3.00));
                foodlist.add(new FoodDomain(" Dessert Donut" , "donut1","",4.00));
                foodlist.add(new FoodDomain("Chocolate Donut","donut2","",4.00));
                foodlist.add(new FoodDomain("White and black Donut","donut3","",3.00));
                adapter2= new ItemsAdapter(foodlist);
                recyclerViewItemsList.setAdapter(adapter2);
                break;
        }

            }

        }





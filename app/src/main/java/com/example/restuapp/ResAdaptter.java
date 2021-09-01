package com.example.restuapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//1. Create the class without extensions
//7. Extend RecyclerView.Adapter-ResAdapter.StudentViewHolder
public class ResAdaptter extends RecyclerView.Adapter<ResAdaptter.ResViewHolder>{
    //2. create the list the adapter will use to bind data
    List<Resturant>allDishes=new ArrayList<Resturant>();

    public ResAdaptter(List<Resturant> allDishes) {
        this.allDishes = allDishes;
    }



    //3. create theViewHolder Class (Wraps the data and the view)
    public static class ResViewHolder extends RecyclerView.ViewHolder{
        //4. the model object
        public Resturant resturant;
        //5. view object
        View itemView;

        public ResViewHolder(@NonNull View itemView) {
            super(itemView);
            //6. setting the itemView value
            this.itemView=itemView;
            //add event listener on singel item(on each fragment) to move to details
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),Detial.class);
                    //use putExter to put key and value
                    intent.putExtra("name",resturant.resName);
                    intent.putExtra("price",resturant.resPrice);
                    intent.putExtra("Ingredients",resturant.resIngredients);
                    //to get context and start activity
                    v.getContext().startActivity(intent);
                }
            });
        }

    }
    @NonNull
//    @org.jetbrains.annotations.NotNull
    @Override
    public ResViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //8. create the view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_res_single,parent,false);
        ResViewHolder resViewHolder =new ResViewHolder(view);
        return resViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ResViewHolder holder, int position) {
        holder.resturant=allDishes.get(position);
        //get text view in fragments by ids
        TextView resName=holder.itemView.findViewById(R.id.textViewNameFragmentid);
        TextView resPrice=holder.itemView.findViewById(R.id.textViewPriceFragmentid);
        resName.setText(holder.resturant.resName);
        resPrice.setText(holder.resturant.resPrice);
    }

    @Override
    public int getItemCount() {
        return allDishes.size();
    }


}

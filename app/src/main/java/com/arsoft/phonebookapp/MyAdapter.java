package com.arsoft.phonebookapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.arsoft.phonebookapp.databinding.ItemCardBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserViewHolder> {
    private Context context;
    private ArrayList<User> userArrayList;




    public MyAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Initializes the ViewHolder and Inflates the Item layout
        ItemCardBinding binding = DataBindingUtil
                .inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.item_card,
                        parent,
                        false
                );



        return new UserViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User currentUser = userArrayList.get(position);
        holder.itemCardBinding.setUser(currentUser);
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }


    public class UserViewHolder extends RecyclerView.ViewHolder{
        private ItemCardBinding itemCardBinding;

        public UserViewHolder(ItemCardBinding itemCardBinding) {
            super(itemCardBinding.getRoot());
            this.itemCardBinding = itemCardBinding;

            // Handling Click Events on RecyclerView Items:
            itemCardBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Getting the clicked item position
                    int position = getAdapterPosition();
                }
            });



        }
    }

}

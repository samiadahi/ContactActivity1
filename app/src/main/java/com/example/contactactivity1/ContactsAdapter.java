package com.example.contactactivity1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    private final List<Contact> mContacts;


    public ContactsAdapter(List<Contact>contacts){
        mContacts=contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int ViewType) {
        Context context= parent.getContext();
        LayoutInflater inflater= LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_contact,parent, false);
        return new ViewHolder(contactView);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Contact contact= mContacts.get(position);

        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getmFirstName());

        TextView lastNameTextView= holder.lastNameTextView;
        lastNameTextView.setText(contact.getmLastName());

        ImageView imageView = holder.imageView;
        Glide.with(holder.itemView)
                .load(contact.getImageUrl())
                .into(imageView);
    }

    @Override
    public int getItemCount() {

        return mContacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView firstNameTextView;
        public TextView lastNameTextView;
        public ImageView imageView;

        public ViewHolder (View itemView){
            super(itemView);
            firstNameTextView = (TextView) itemView.findViewById(R.id.contact_firstname);
            lastNameTextView = (TextView) itemView.findViewById(R.id.contact_lastname);
            imageView = (ImageView) itemView.findViewById(R.id.image_url);
        }
    }




}

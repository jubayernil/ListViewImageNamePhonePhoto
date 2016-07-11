package com.example.mobileappdevelop.listviewimagenamephoneemail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 11-7-16.
 */
public class PersonAdapter extends ArrayAdapter<Person>{
    Context context;
    ArrayList<Person> persons;

    public PersonAdapter(Context context, ArrayList<Person> persons) {
        super(context, R.layout.list_row, persons);

        this.context = context;
        this.persons = persons;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_row, null, true);

        TextView textViewName = (TextView) convertView.findViewById(R.id.TextViewName);
        TextView textViewPhone = (TextView) convertView.findViewById(R.id.TextViewPhone);
        TextView textViewEmail = (TextView) convertView.findViewById(R.id.TextViewEmail);

        ImageView imageViewPhoto = (ImageView) convertView.findViewById(R.id.ImageViewPhoto);

        textViewName.setText(persons.get(position).getName());
        textViewPhone.setText(persons.get(position).getPhone());
        textViewEmail.setText(persons.get(position).getEmail());

        imageViewPhoto.setImageResource(persons.get(position).getImageId());

        return convertView;
    }
}

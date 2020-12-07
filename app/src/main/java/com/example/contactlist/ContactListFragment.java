package com.example.contactlist;

import android.content.Context;
import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

public class ContactListFragment extends ListFragment {

    interface Listener{
        void itemClicked(long id);
    };

    private Listener listener;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        //initialize the list and its adapter
        String[] names = new String[Contact.contacts.length];
        for (int nameIndex = 0; nameIndex < names.length; nameIndex++){
            names[nameIndex] = Contact.contacts[nameIndex].getName();
        }

        ArrayAdapter<String> contactsAdapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(contactsAdapter);

        // Inflate the layout for this fragment
        return super.onCreateView(inflater,container,savedInstanceState);
    }

        @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    @Override
    public void onListItemClick(ListView listView, View v, int position, long id) {
        if(listener != null){
            listener.itemClicked(id);
        }
    }
}
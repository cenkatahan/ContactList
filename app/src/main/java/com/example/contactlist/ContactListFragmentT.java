package com.example.contactlist;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ContactListFragmentT extends ListFragment {

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
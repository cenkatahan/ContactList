package com.example.contactlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */

public class ContactDetailFragment extends Fragment {

    private long contactID;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact_detail,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        //need to reach view group. then, reach elements
        View view = getView();
        if(view != null){
            TextView nameView = view.findViewById(R.id.name_view);
            TextView homePhoneView = view.findViewById(R.id.homePhone_view);
            TextView cellPhoneView = view.findViewById(R.id.cellPhone_view);
            TextView workPhoneView = view.findViewById(R.id.workPhone_view);
            TextView emailView = view.findViewById(R.id.email_view);

            Contact contact = Contact.contacts[(int) contactID];

            nameView.setText(""+contact.getName());
            homePhoneView.setText(""+contact.getHomePhone());
            cellPhoneView.setText(""+contact.getCellPhone());
            workPhoneView.setText(""+contact.getWorkPhone());
            emailView.setText(""+contact.getEmail());
        }
    }

    public void setContact(long contactID) {
        this.contactID = contactID;
    }
}
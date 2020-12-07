package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ContactDetailActivity extends AppCompatActivity {

    public static final String EXTRA_CONTACT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        ContactDetailFragment contactDetails = (ContactDetailFragment) getSupportFragmentManager().findFragmentById(R.id.contact_detail_fragment);
        int contactID = (int) getIntent().getExtras().get(EXTRA_CONTACT_ID);
        contactDetails.setContact(contactID);
    }
}
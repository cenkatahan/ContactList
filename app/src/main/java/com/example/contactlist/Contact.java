package com.example.contactlist;

import java.io.Serializable;

public class Contact {
    private String name;
    private String homePhone;
    private String cellPhone;
    private String workPhone;
    private String email;
    private int imageResourceID;

    public Contact(String name, String homePhone, String cellPhone, String workPhone, String email,int imageResourceID) {
        this.name = name;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.workPhone = workPhone;
        this.email = email;
        this.imageResourceID = imageResourceID;
    }

    public static final Contact[] contacts = {
            new Contact("Atahan","100","200","300","atahan@hotmail.com",R.id.avatar_image_view),
            new Contact("Aslısu","101","201","301","aslısu@hotmail.com",R.id.avatar_image_view),
            new Contact("Özlem","102","202","302","özlem@hotmail.com",R.id.avatar_image_view),
            new Contact("Ozan","103","203","303","ozan@hotmail.com",R.id.avatar_image_view)
    };

    public String getName() {
        return name;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getEmail() {
        return email;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}

package com.example.contactactivity1;

public class Contact {
    private String nom;
    private String prenom;
    private String imageUrl;

    public Contact(String nom, String prenom, String imageUrl) {
        this.nom=nom;
        this.prenom=prenom;
        this.imageUrl=imageUrl;
    }

    public String getmFirstName() {
        return nom;
    }
    public String getmLastName() {
        return prenom;
    }
    public String getImageUrl(){return imageUrl;}
}


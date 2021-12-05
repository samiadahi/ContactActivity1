package com.example.contactactivity1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



public class UserActivity extends AppCompatActivity {
    List<Contact> contacts =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);


        //initialisation des contacts
        contacts.add(new Contact("Jean", "Pierre", "https://voi.img.pmdstatic.net/fit/http.3A.2F.2Fprd2-bone-image.2Es3-website-eu-west-1.2Eamazonaws.2Ecom.2Fprismamedia_people.2F2018.2F10.2F29.2F9b8be122-64ba-40a2-826d-de20d8c4c7c4.2Ejpeg/2048x1536/quality/80/pierre-jean-chalencon.jpeg"));
        contacts.add(new Contact("Jeanne", "D'arc", "https://histoire-image.org/sites/default/jeanne-arc-sacre-charlesvii.jpg"));
        contacts.add(new Contact("Pierre", "Menez",  "https://resize-parismatch.lanmedia.fr/img/var/news/storage/images/paris-match/culture/medias/documentaire-sur-le-sexisme-pierre-menes-exprime-ses-regrets-et-fait-son-mea-culpa-1731269/28535945-1-fre-FR/Documentaire-sur-le-sexisme-Pierre-Menes-exprime-ses-regrets-et-fait-son-mea-culpa.jpg"));
        contacts.add(new Contact("Richard", "Coeur de lion", "https://i2.wp.com/www.histoire-normandie.fr/wp-content/uploads/2016/08/richard_coeur_lion_blondel.jpg"));
        contacts.add(new Contact("Zindenie", "Zidnae", "https://le10static.com/img/cache/article/576x324/0000/0018/187965.jpeg"));
        contacts.add(new Contact("Yannick", "Noah", "https://resize-elle.ladmedia.fr/rcrop/1098,768/img/var/plain_site/storage/images/people/la-vie-des-people/news/yannick-noah-cecilia-heather-isabelle-les-femmes-de-sa-vie-3730988/88662437-1-fre-FR/Yannick-Noah-Cecilia-Heather-Isabelle-les-femmes-de-sa-vie.jpg"));
        //Création d'un adaptateur avec initialisation de constructeur avec notre contacts
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        // on notifie au recycleview notre adapter
        rvContacts.setAdapter(adapter);
        // On déclare quelle type de LayoutManager on désire
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }
}

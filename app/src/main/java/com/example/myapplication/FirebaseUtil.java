package com.example.myapplication;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {
    //Todos los miembros de esta clase seran estaticos, eso significa que podremos llamarlos sin crear instancias de ningun objeto de esta clase
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    public static FirebaseUtil firebaseUtil;
    public static ArrayList<TravelDeal> mDeals;

    //Constructor vacio, esto evita que esta clase sea instanciada desde fuera de esta clase
    private FirebaseUtil(){};

    public static void openFbReference(String ref) {
        if (firebaseUtil == null) {
            firebaseUtil = new FirebaseUtil();
            mFirebaseDatabase =  FirebaseDatabase.getInstance();
            mDeals = new ArrayList<TravelDeal>();
        }
        mDatabaseReference = mFirebaseDatabase.getReference().child(ref);
    }

}

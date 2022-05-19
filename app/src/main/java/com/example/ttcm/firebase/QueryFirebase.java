package com.example.ttcm.firebase;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.example.ttcm.activity.LoginActivity;
import com.example.ttcm.activity.MainActivity;
import com.example.ttcm.model.Cart;
import com.example.ttcm.model.Product;
import com.example.ttcm.model.Receipt;
import com.example.ttcm.model.im_User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class QueryFirebase {
    private static FirebaseFirestore db = FirebaseFirestore.getInstance();
    public static void addData(Receipt object)
    {
        db.collection("Receipt")
                .add(object)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
    public static List<Object>getListData(String name)
    {
        List<Object>lstobject=new ArrayList<>();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        CollectionReference reference=db.collection(name);

        //Query query=reference.whereEqualTo("username",FirebaseAuth.getInstance().getCurrentUser().getUid());
        reference.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if(task.isSuccessful())
                {
                    for (QueryDocumentSnapshot document:task.getResult())
                    {
                        im_User user=document.toObject(im_User.class);
                        lstobject.add(user);
                    }
                }
            }
        });
        return lstobject;
    }

}

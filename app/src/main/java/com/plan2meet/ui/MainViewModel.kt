package com.plan2meet.ui

import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.storage.FirebaseStorage

class MainViewModel : ViewModel() {

    //firebase
    private var firestore : FirebaseFirestore = FirebaseFirestore.getInstance()
    private var storageReference = FirebaseStorage.getInstance().reference
    init {
        firestore.firestoreSettings = FirebaseFirestoreSettings.Builder().build()
    }
}
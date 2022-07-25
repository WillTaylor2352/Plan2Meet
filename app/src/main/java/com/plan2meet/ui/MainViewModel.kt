package com.plan2meet.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.plan2meet.dto.ContactDTO

class MainViewModel {

    var contacts : MutableLiveData<List<ContactDTO>> = MutableLiveData<List<ContactDTO>>()

    private lateinit var firestore : FirebaseFirestore

    init {
        firestore = FirebaseFirestore.getInstance()
        firestore.firestoreSettings = FirebaseFirestoreSettings.Builder(). build()
    }

    fun save(contacts: ContactDTO) {
        val document = if (contacts.firstName == null || contacts.firstName.isEmpty()) {
            firestore.collection("contacts").document()
        } else {
            firestore.collection("contacts").document(contacts.firstName)
        }
        contacts.firstName = document.id
        val handle = document.set(contacts)
        handle.addOnSuccessListener { Log.d("Firebase", "Document Saved") }
        handle.addOnFailureListener { Log.e( "Firebase", "Save Failed $it ")}
    }

}
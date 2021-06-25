package com.wapchief.notebook.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import com.wapchief.notebook.room.NoteEntity;
import com.wapchief.notebook.room.NoteManager;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    private List<NoteEntity> mNotes;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }

    public List<NoteEntity> getNotes() {
        return mNotes;
    }
}
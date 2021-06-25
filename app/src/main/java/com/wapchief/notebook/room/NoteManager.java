package com.wapchief.notebook.room;

import android.content.Context;

import androidx.room.Room;

import java.util.List;

/**
 * @author wapchief
 * @date 6/25/21
 */
public class NoteManager {
    private static BaseRoom mDb;

    public static BaseRoom getInstance(Context context) {
        if (mDb == null) {
            mDb = Room.databaseBuilder(context,
                    BaseRoom.class,
                    "note.db")
                    .allowMainThreadQueries()
                    .build();
        }
        return mDb;
    }

    //添加一条记录
    public static synchronized void addNote(Context context, NoteEntity entity) {
        getInstance(context).noteDao().addNote(entity);
    }

    public static synchronized List<NoteEntity> getNotes(Context context) {
        return getInstance(context).noteDao().getNotes();
    }

    public static synchronized void updateNote(Context context, NoteEntity entity) {
        getInstance(context).noteDao().updateNote(entity);
    }

    public static synchronized void deleteNote(Context context, NoteEntity entity) {
        getInstance(context).noteDao().deleteNote(entity);
    }
}
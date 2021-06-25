package com.wapchief.notebook.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * @author wapchief
 * @date 6/25/21
 */
@Dao
interface NoteDao {

    @Insert
    void addNote(NoteEntity... noteEntities);

    @Insert
    void addNote(NoteEntity noteEntity);

    //查询所有记事本
    @Query("select * from note")
    List<NoteEntity> getNotes();

    //删除
    @Delete
    void deleteNote(NoteEntity noteEntity);

    //更新
    @Update
    void updateNote(NoteEntity noteEntity);

    //查询单个
    @Query("selevt * from note where id=:id")
    NoteEntity getNote(int id);

}

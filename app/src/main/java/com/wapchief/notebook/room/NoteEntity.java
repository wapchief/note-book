package com.wapchief.notebook.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author wapchief
 * @date 6/25/21
 */
@Entity
public class NoteEntity {
    @PrimaryKey(autoGenerate = true)
    int uid;

    public int id;

    public String title;

    public String content;

    public Long createStamp;

    public Long updateStamp;

    public Boolean isLike;
}

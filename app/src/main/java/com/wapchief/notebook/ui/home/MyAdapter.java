package com.wapchief.notebook.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wapchief.notebook.R;
import com.wapchief.notebook.room.NoteEntity;
import com.wapchief.notebook.ui.edit.NoteEditActivity;

import java.util.List;

/**
 * @author wapchief
 * @date 6/25/21
 */
public class MyAdapter extends RecyclerView.Adapter {

    List<NoteEntity> mNoteEntities;
    Context mContext;
    public MyAdapter(Context context,List<NoteEntity> noteEntities) {
        mNoteEntities = noteEntities;
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyHolder) {
            ((MyHolder) holder).text.setText(mNoteEntities.get(position).title);
            holder.itemView.setTag(position);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mContext.startActivity(new Intent(mContext, NoteEditActivity.class));
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mNoteEntities.size();
    }

    private class MyHolder extends RecyclerView.ViewHolder {

        TextView text;

        public MyHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.tvNote);
        }
    }
}

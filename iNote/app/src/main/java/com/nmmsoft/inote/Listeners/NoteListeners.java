package com.nmmsoft.inote.Listeners;

import com.nmmsoft.inote.Entities.Note;

public interface NoteListeners {
    void onNoteClicked(Note note ,int position);
    void onLongNoteClicked(Note note ,int position);
}

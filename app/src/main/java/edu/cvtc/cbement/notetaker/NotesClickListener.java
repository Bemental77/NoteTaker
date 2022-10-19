package edu.cvtc.cbement.notetaker;

import androidx.cardview.widget.CardView;

import edu.cvtc.cbement.notetaker.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}

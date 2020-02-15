package com.tech.keepnote.model;

import java.time.LocalDateTime;

import javax.xml.crypto.Data;

/*
 * The class "Note" will be acting as the data model for the Note data in the ArrayList.
 */
public class Note {
	private int noteId;
	private String noteTitel;
	private String noteContent;
	private String noteStatus ;
	private LocalDateTime createdAt;

	/*
	 * This class should have five fields (noteId, noteTitle, noteContent,
	 * noteStatus and createdAt). This class should also contain the getters and
	 * setters for the fields. The value of createdAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */
	
	public Note() {
		
	}

	public Note(int noteId, String noteTitel,String noteContent,String noteStatus,LocalDateTime createdAt) {
		this.noteId = noteId;
		this.noteTitel = noteTitel;
		this.noteContent = noteContent;
		this.noteStatus = noteStatus;
		this.createdAt = createdAt;
		
	}

	/* All the getters/setters definition should be implemented here */

	public int getNoteId() {
		return noteId;

	}

	public void setNoteId(int intid) {
		this.noteId  = intid;
	}

	public String getNoteTitle() {
		return noteTitel;
	}

	public void setNoteTitle(String string) {
		this.noteTitel = string;
	}

	public String getNoteContent() {
		return noteTitel;
	}

	public void setNoteContent(String string) {
		this.noteContent = string;
	}

	public String getNoteStatus() {
		return noteContent;
	}

	public void setNoteStatus(String string) {
		this.noteStatus = string;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime localdatetime) {
		this.createdAt = localdatetime;
	}

	/* Override the toString() method */

	@Override
	public String toString() {
		return noteId+" "+noteTitel+" "+noteContent+" "+noteStatus+" "+createdAt;
	}
}
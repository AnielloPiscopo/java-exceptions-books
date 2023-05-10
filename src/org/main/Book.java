package org.main;

public class Book {
	private String title;
	private int numOfPages;
	private String author;
	private String editor;
	
	public Book(String title , int numOfPages , String author , String editor) {
		setTitle(title);
		setNumOfPages(numOfPages);
		setAuthor(author);
		setEditor(editor);
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public String getEditor() {
		return editor;
	}
	
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	
	
	protected String getInfo() {
		return "\nTitolo: " + getTitle()
			+ "\nAutore: " + getAuthor()
			+ "\nEditor: " + getEditor()
			+ "\n";
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getInfo();
	}
}

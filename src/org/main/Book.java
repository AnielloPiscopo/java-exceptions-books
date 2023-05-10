package org.main;

public class Book {
	private String title;
	private int numOfPages;
	private String author;
	private String editor;
	
	public Book(String title , int numOfPages , String author , String editor) throws Exception {
		setTitle(title);
		setNumOfPages(numOfPages);
		setAuthor(author);
		setEditor(editor);
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) throws Exception {
		if(title == "") throw new Exception("Non hai inserito un titolo");
		this.title = title;
	}
	
	
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public void setNumOfPages(int numOfPages) throws Exception {
		if(numOfPages <= 0) throw new Exception("Il numero di pagine non può essere negativo o uguale a 0");
		this.numOfPages = numOfPages;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) throws Exception {
		if(author == "") throw new Exception("Non hai inserito un autore");
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

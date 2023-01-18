//3. Write a Java Beans Program for the class BOOK with name, author, and International 
//Standard Book Number (ISBN)

class Book
{
	
	String name;
	String author;
	long ISBN;
	
	public String getname()
	{
		return name;
		
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public String getauthor()
	{
		return author;
	}
	public void SetAuthor(String author) 
	{
		this.author=author;
	}
	public long getISBN()
	{
		return ISBN;
	}
	public void setISBN(long ISBN)
	{
		this.ISBN=ISBN;
	}
	public static void main(String args  [])
	{
		Book b=new Book();
		b.SetName("KEEP IT SIMPLE");
		b.SetAuthor("JOE CALLOWAY");
		b.setISBN(9781492675471L);
		
		System.out.println(b.getname());
		System.out.println(b.getauthor());
		System.out.println(b.getISBN());
		
	}
	
}
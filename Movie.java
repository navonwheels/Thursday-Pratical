
class Movie
{
	
	String titile;
	String studio;
	String rating;
	
	public Movie(String titile,String studio,String rating) 
{
		
		this.rating=rating;
		this.titile=titile;
		this.studio=studio;
		
}
	
	public Movie(String titile,String studio) 
{
		
		this.titile=titile;
		this.studio=studio;	
}
	public String getrating() 
{
		return rating;
}
	public void setrating(String rating) 
{
		this.rating=rating;
}
	
	





	
	public static void main(String args[]) 
{
		
		Movie i = new Movie("Casino Royale", "Eon Productions", "PG­13");
		Movie n = new Movie("Casino Royale","Eon Productions");
		System.out.println(i.rating);
		System.out.println(i.studio);
		System.out.println(i.titile);
		System.out.println();
		System.out.println(n.titile);
		System.out.println(n.studio);
		System.out.println(n.getrating());
}
}
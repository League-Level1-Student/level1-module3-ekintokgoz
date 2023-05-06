package _04_netflix;

public class MyMovie {
	public static void main(String[] args) {
		Movie m1 = new Movie("Avatar", 4);
		Movie m2 = new Movie("Scream", 5);
		Movie m3 = new Movie("The Menu", 2);
		Movie m4 = new Movie("Get Out", 5);
		Movie m5 = new Movie("Knives Out", 5);
		System.out.println(
		m1.getTicketPrice());
		m2.getTicketPrice();
		m3.getTicketPrice();
		m4.getTicketPrice();
		m5.getTicketPrice(); 
	
		
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(m1);
		queue.addMovie(m2);
		queue.addMovie(m3);
		queue.addMovie(m4);
		queue.addMovie(m5);
				
		//queue.printMovies();
		System.out.println(queue.getBestMovie());
		queue.sortMoviesByRating();
		System.out.println(queue.getMovie(1));
	}
}

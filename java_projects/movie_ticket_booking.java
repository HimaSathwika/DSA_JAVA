package java_projects;
abstract class Movie{
    String movieId;
    String title;
    double ticketPrice;
    int numOfTickets;
    public void movieDetails(String id,String name,double price,int count){
        movieId = id;
        title = name;
        ticketPrice = price;
        numOfTickets = count;
    }
    public abstract double calculateBill();
    public void displayDetails(){
        System.out.println("\nMovie Record");
        System.out.println("ID " + movieId);
        System.out.println("Title " + title);
        System.out.println("Ticket Price "+ticketPrice);
        System.out.println("Number of Tickets "+numOfTickets);
        if (numOfTickets > 6){
            System.out.println("Bookin Failed: Cannot book morethan 6 tickets");
        }
        else{
            System.out.println("Total price " + calculateBill());
        }
    }
}
class TeluguMovie extends Movie {
    public TeluguMovie(String id,String name,double price,int count) {
        movieId = id;
        title = name;
        ticketPrice = price;
        numOfTickets = count;
    }
    public double calculateBill() {
        double baseTotal = ticketPrice * numOfTickets;
        return baseTotal + (0.05 * baseTotal);
    }
}
class HindiMovie extends Movie{
    public HindiMovie(String id,String name,double price,int count) {
        movieId = id;
        title = name;
        ticketPrice = price;
        numOfTickets = count;
    }
    public double calculateBill() {
        double baseTotal = ticketPrice * numOfTickets;
        double discount = baseTotal * 0.10;
        double discounted = baseTotal - discount; 
        return discounted + (0.05 * discounted);
    }
}
class EnglishMovie extends Movie{
    public EnglishMovie(String id,String name,double price,int count) {
        movieId = id;
        title = name;
        ticketPrice = price;
        numOfTickets = count;
    }
    public double calculateBill() {
        double baseTotal = (ticketPrice+50) * numOfTickets;
        return baseTotal + (0.05 * baseTotal);
    }
}
public class movie_ticket_booking {
    public static void main(String[] args) {
         Movie[] movies = new Movie[3];

        movies[0] = new TeluguMovie("M101", "RRR", 150.0, 3);
        movies[1] = new HindiMovie("M102", "Pathaan", 200.0, 2);
        movies[2] = new EnglishMovie("M103", "Avatar", 250.0, 7);

        for (Movie m : movies) {
            m.displayDetails();
        }
    }
}


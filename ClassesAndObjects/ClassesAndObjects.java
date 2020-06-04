package tutorial;

class apartment {
	
	int flats, rooms;
	String name;
	
	public void details() {
		System.out.println("The appartment, "+ name + " has "+flats + " flats and "+ rooms +" rooms");
	}
	
	public void madeOf ()
	{
		System.out.println("The apartment is made of Ambuja Cement and JK wall putty");
	}
}

public class ClassesAndObjects {

	public static void main(String[] args) {
		apartment gaur = new apartment();
		apartment panchsheel = new apartment();
		gaur.name = "Gaur Homes"; 	gaur.flats = 50;   gaur.rooms= 100;
		gaur.details();
		gaur.madeOf();
		panchsheel.name = "Panchsheel"; 	panchsheel.flats = 70;   panchsheel.rooms= 170;
		panchsheel.details();
		panchsheel.madeOf();
		}

}

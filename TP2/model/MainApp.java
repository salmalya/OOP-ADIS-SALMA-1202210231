package model;

public class MainApp {
	//protected String drive;
	//protected int ram;
	//protected int processor;
	
	public static void main (String[] args) {
		Perangkat p1 = new Perangkat("drive",20,100,"hp");
		p1.informasi();
		
		Handphone e = new Handphone("drive2",30,200,"lenovo",true,"08135","08231","97901");
		e.informasi();
		e.telfon();
		e.sms();
		
		Laptop e1 = new Laptop("drive3",50,290,"asus",false,"pou","salma@gmail","alya@gmail","syifa@gmail");
		e1.informasi();
		e1.bukaGame();
		e1.kirimEmail();
		e1.kirimEmail2();
	}
}
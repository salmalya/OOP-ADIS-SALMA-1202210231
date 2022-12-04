package model;

public class Perangkat {

	protected String drive;
	protected int ram;
	protected int processor;
	protected String device;
	
	public Perangkat(String drive, int ram,int processor,String device){
		//this() ;
		this.drive = drive;
		this.ram = ram;
		this.processor = processor;
		this.device = device;

	}
	
	public void informasi( ) {
		System.out.println("=======================");
		System.out.println("Perangkat "+this.device+" memiliki drive tipe "+ this.drive + " dan processor " + this.processor);
		System.out.println();
	}
}
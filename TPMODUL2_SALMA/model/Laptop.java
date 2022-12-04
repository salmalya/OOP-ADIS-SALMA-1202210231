package model;

public class Laptop extends Perangkat {
	protected boolean webcam;
	protected String nama_game;
	protected String email;
	protected String email1;
	protected String email2;
	
	public Laptop(String drive, int ram,int processor,String device,boolean webcam, String nama_game,String email,String email1,String email2) {
		super(drive,ram,processor,device);
		this.nama_game = nama_game;
		this.email = email;
		this.email1 = email1;
		this.email2 = email2;
	}
	public void informasi( ) {
		super.informasi();
		System.out.println("Webcam :" + this.webcam);
	}
	public void bukaGame() {
		System.out.println("Laptop berhasil membuka game " + this.nama_game);
	}
	public void kirimEmail(){
		System.out.println("Laptop berhasil mengirim email ke "+ this.email);
	}
	public void kirimEmail2(){
		System.out.println("Laptop berhasil kirim email ke " + this.email1 +" dan "+ this.email2);
	}
}

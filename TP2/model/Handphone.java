package model;

public class Handphone extends Perangkat {
	protected boolean fingerprint;
	protected String no_hp;
	protected String no_hp1;
	protected String no_hp2;
	
	
	
	public Handphone(String drive, int ram,int processor,String device,boolean fingerprint,String no_hp,String no_hp1,String no_hp2) {
		super(drive,ram,processor,device);
		this.fingerprint = fingerprint;
		this.no_hp = no_hp;
		this.no_hp1 = no_hp1;
		this.no_hp2 = no_hp2;
	}

	public void informasi( ) {
		super.informasi();
		System.out.println("Fingerprint :" + this.fingerprint);
	}
	public void telfon() {
		//this.no_hp = no_hp;
		System.out.println("Handphone berhasil nelfon " + this.no_hp);
	}
	public void sms() {
		//this.no_hp = no_hp;
		System.out.println("Handphone berhasil sms " + this.no_hp1 + " dan " + this.no_hp2);
	}
	
	
}	
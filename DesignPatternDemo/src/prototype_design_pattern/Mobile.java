package prototype_design_pattern;

public class Mobile implements Cloneable {
	@Override
	public String toString() {
		return "Mobile [mobname=" + mobname + ", mobprice=" + mobprice + ", isbluetooth=" + isbluetooth + ", imino="
				+ imino + "]";
	}
	String mobname;
	double mobprice;
	String isbluetooth;
	long imino;
	public Mobile(String mobname, double mobprice,String isbluetooth, long imino) {
		super();
		this.mobname = mobname;
		this.mobprice = mobprice;
		this.isbluetooth = isbluetooth;
		this.imino = imino;
	}
	public String getMobname() {
		return mobname;
	}
	public void setMobname(String mobname) {
		this.mobname = mobname;
	}
	public double getMobprice() {
		return mobprice;
	}
	public void setMobprice(double mobprice) {
		this.mobprice = mobprice;
	}
	public String isIsbluetooth() {
		return isbluetooth;
	}
	public void setIsbluetooth(String isbluetooth) {
		this.isbluetooth = isbluetooth;
	}
	public long getImino() {
		return imino;
	}
	public void setImino(long imino) {
		this.imino = imino;
	}
	
	public Mobile Clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Mobile)super.clone();
	}
	
}

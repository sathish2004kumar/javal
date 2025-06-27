package Week7;

import java.time.LocalDateTime;

enum Berth{
	UPPER,
	LOWER,
	MIDDLE,
}
public class Passenger {
	private int pid;
	private String passengername;
	private Berth prefBerth;
	private Berth allocatedBerth;
	private LocalDateTime bkd;
	private int currentlimit;
	public int getCurrentlimit() {
		return currentlimit;
	}
	public void setCurrentlimit(int currentlimit) {
		this.currentlimit = currentlimit;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public Berth getPreferBerth() {
		return prefBerth;
	}
	public void setPreferBerth(Berth prefBerth) {
		this.prefBerth = prefBerth;
	}
	public Berth getAllocatedBerth() {
		return allocatedBerth;
	}
	public void setAllocatedBerth(Berth allocatedBerth) {
		this.allocatedBerth = allocatedBerth;
	}
	public LocalDateTime getBkd() {
		return bkd;
	}
	public void setBkdt(LocalDateTime bkd) {
		this.bkd = bkd;
	}
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", passengername=" + passengername + ", prefBerth=" + prefBerth
				+ ", allocatedBerth=" + allocatedBerth + ", bkd=" + bkd + ", currentlimit=" + currentlimit + "]";
	}

}

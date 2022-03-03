package com.akash.spring.refType;

public class Scrore {
	private Double math;
	private Double chemistry;
	private Double physic;
	public Double getMath() {
		return math;
	}
	public void setMath(Double math) {
		this.math = math;
	}
	public Double getChemistry() {
		return chemistry;
	}
	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}
	public Double getPhysic() {
		return physic;
	}
	@Override
	public String toString() {
		return "Scrore [math=" + math + ", chemistry=" + chemistry + ", physic=" + physic + "]";
	}
	public void setPhysic(Double physic) {
		this.physic = physic;
	}
	
}

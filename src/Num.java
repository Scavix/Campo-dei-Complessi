

public class Num {
	private int reale;
	private int immaginario;
	public Num(int r, int i) {
		reale=r;
		immaginario=i;
	}
	public Num(int r) {
		reale=r;
		immaginario=0;
	}
	public Num() {
		reale=0;
		immaginario=0;
	}
	public int getReale() {
		return reale;
	}
	public int getImmaginario() {
		return immaginario;
	}
	public Num sum(Num that) {
		Num result = new Num();
		result.reale = this.reale+that.reale;
		result.immaginario = this.immaginario+that.immaginario;
		return result;
	}
	public Num sub(Num that) {
		Num result = new Num();
		result.reale = this.reale-that.reale;
		result.immaginario = this.immaginario-that.immaginario;
		return result;
	}
	public Num mol(Num that) {
		Num result = new Num();
		result.reale = ((this.reale*that.reale)-(this.immaginario*that.immaginario));
		result.immaginario = ((this.reale*that.immaginario)+(this.immaginario*that.reale));
		return result;
	}
	public Num div(Num that) {
		Num result = new Num();
		result.reale = ((this.reale*that.reale)+(this.immaginario*that.immaginario))/((that.reale*that.reale)+(that.immaginario*that.immaginario));
		result.immaginario = ((this.reale*that.reale)-(this.reale*that.immaginario))/((that.reale*that.reale)+(that.immaginario*that.immaginario));
		return result;
	}
	@Override
	public String toString() {
		return "(" + reale + "," + immaginario + ")";
	}
	
}

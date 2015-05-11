package paket;

public class Glumac {
	public String visina;
	public int godine;
	public int brojNagrada;
	public String pol;
	public String getVisina() {
		return visina;
	}
	public void setVisina (String visina) {
		this.visina = visina;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	public int getBrojNagrada() {
		return brojNagrada;
	}
	public void setBrojNagrada(int brojNagrada) {
		this.brojNagrada = brojNagrada;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	@Override
	public String toString() {
		return "Glumac [visina=" + visina + ", godine=" + godine
				+ ", brojNagrada=" + brojNagrada + ", pol=" + pol + "]";
	}
	

}

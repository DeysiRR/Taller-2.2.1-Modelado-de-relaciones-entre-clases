public class ElementosAbioticos {

	private int Ph;
	private int Temperatura;
	private String Agua;

	public ElementosAbioticos(int Ph, int Temperatura, String Agua) {
		this.Ph = Ph;
		this.Temperatura = Temperatura;
		this.Agua = Agua;
	}

	public int getPh() {
		return Ph;
	}

	public void setPh(int Ph) {
		this.Ph = Ph;
	}

	public int getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(int Temperatura) {
		this.Temperatura = Temperatura;
	}

	public String getAgua() {
		return Agua;
	}

	public void setAgua(String Agua) {
		this.Agua = Agua;
	}

	public String toString() {
		return Ph + " " + Temperatura + " " + Agua;
	}

	
}
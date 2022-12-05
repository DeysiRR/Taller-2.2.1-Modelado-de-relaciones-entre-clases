public class Ecosistema {

	private String Bioticos;
	private String Abioticos;
	private String AreaGeografica;

	public Ecosistema(String Bioticos, String Abioticos, String AreaGeografica) {
		this.Bioticos = Bioticos;
		this.Abioticos = Abioticos;
		this.AreaGeografica = AreaGeografica;
	}

	public String getBioticos() {
		return Bioticos;
	}

	public void setBioticos(String Bioticos) {
		this.Bioticos = Bioticos;
	}

	public String getAbioticos() {
		return Abioticos;
	}

	public void setAbioticos(String Abioticos) {
		this.Abioticos = Abioticos;
	}

	public String getAreaGeografica() {
		return AreaGeografica;
	}

	public void setAreaGeografica(String AreaGeografica) {
		this.AreaGeografica = AreaGeografica;
	}

	public String toString() {
		return Bioticos + " " + Abioticos + " " + AreaGeografica;
	}

	
}
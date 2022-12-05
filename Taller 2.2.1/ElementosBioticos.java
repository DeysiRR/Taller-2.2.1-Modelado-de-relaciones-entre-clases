public class ElementosBioticos {

	private String Animal;
	private String Planta;
	private String Bacteria;
	private String Hongo;
	private String Alga;

	public ElementosBioticos(String Animal, String Planta, String Bacteria, String Hongo, String Alga) {
		this.Animal = Animal;
		this.Planta = Planta;
		this.Bacteria = Bacteria;
		this.Hongo = Hongo;
		this.Alga = Alga;
	}

	public String getAnimal() {
		return Animal;
	}

	public void setAnimal(String Animal) {
		this.Animal = Animal;
	}

	public String getPlanta() {
		return Planta;
	}

	public void setPlanta(String Planta) {
		this.Planta = Planta;
	}

	public String getBacteria() {
		return Bacteria;
	}

	public void setBacteria(String Bacteria) {
		this.Bacteria = Bacteria;
	}

	public String getHongo() {
		return Hongo;
	}

	public void setHongo(String Hongo) {
		this.Hongo = Hongo;
	}

	public String getAlga() {
		return Alga;
	}

	public void setAlga(String Alga) {
		this.Alga = Alga;
	}

	public String toString() {
		return Animal + " " + Planta + " " + Bacteria + " " + Hongo + " " + Alga;
	}


}
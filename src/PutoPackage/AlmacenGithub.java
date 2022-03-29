package PutoPackage;

public class AlmacenGithub {
	private int camisas;
	private int pantalones;

	// constructor
	public AlmacenGithub(int camisas, int pantalones) {
		this.camisas = camisas;
		this.pantalones = pantalones;
	}

	// metodos
	//setters
	public void sumaCamisas(int camisas) {
		this.camisas += camisas;
	}

	public void restaCamisas(int camisas) {
		this.camisas -= camisas;
	}

	public void sumaPantalones(int pantalones) {
		this.pantalones += pantalones;
	}

	public void restaPantalones(int pantalones) {
		this.pantalones -= pantalones;
	}

	
	//getters
	public int damePantalones() {
		return pantalones;
	}
	
	public int dameCamisas() {
		return camisas;

	}
}

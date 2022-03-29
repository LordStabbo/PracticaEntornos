package PutoPackage;
//otro comment para la practica
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

	public void restaCamisasMal(int camisas) {
		this.camisas -= camisas*10000;
	}
	
	public void sumaPantalones(int pantalones) {
		this.pantalones += pantalones;
	}

	public void restaPantalones(int pantalones) {
		this.pantalones -= pantalones;
	}
	
	public void restaPantalonesMal(int pantalones) {
		this.pantalones -= pantalones/1000;
	}

	
	//getters
	public int damePantalones() {
		return pantalones;
	}
	
	public int dameCamisas() {
		return camisas;

	}
}

package magacin;

import java.util.LinkedList;
import java.util.List;

import magacininterfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{

	private List<Artikal> artikli = new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		
	}

	@Override
	public Artikal vratiArtikalSaZadatomSifrom(int sifra) {
		return null;
	}

}

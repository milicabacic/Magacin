package magacin;

import java.util.LinkedList;
import java.util.List;

import magacininterfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{

	private List<Artikal> artikli = new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {

		if(artikli.contains(artikal)) {
			for (Artikal a : artikli) {
				if(a==artikal)
					a.setKolicina(a.getKolicina()+artikal.getKolicina());
			}
		} else {
			artikli.add(artikal);
		}
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		for (Artikal a : artikli) {
			if(a==artikal)
				a.setKolicina(a.getKolicina()-artikal.getKolicina());
		}
	}

	@Override
	public Artikal vratiArtikalSaZadatomSifrom(int sifra) {
		for (Artikal artikal : artikli) {
			if(artikal.getSifra()==sifra)
				return artikal;
		}
		return null;
	}

}

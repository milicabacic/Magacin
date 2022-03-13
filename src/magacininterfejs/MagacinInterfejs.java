package magacininterfejs;

import magacin.Artikal;

public interface MagacinInterfejs {

	public void dodajArtikal (Artikal artikal);
	public void izbaciArtikal(Artikal artikal);
	public Artikal vratiArtikalSaZadatomSifrom(int sifra);
}

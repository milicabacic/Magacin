package magacin;

import java.util.Date;
import java.util.Objects;

public class KucnaHemija extends Artikal {

	private Date rokVazenja;

	public Date getRokVazenja() {
		return rokVazenja;
	}

	public void setRokVazenja(Date rokVazenja) {
		if(rokVazenja!=null && rokVazenja.after(new Date()))
			this.rokVazenja = rokVazenja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(rokVazenja);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(rokVazenja, other.rokVazenja);
	}

	@Override
	public String toString() {
		return super.toString() + "KucnaHemija [rokVazenja=" + rokVazenja + "]";
	}
	
	
	
}

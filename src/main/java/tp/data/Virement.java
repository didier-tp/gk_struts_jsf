package tp.data;

public class Virement {
	private Double montant; //montant � transf�rer
	private Long numCptDeb; //numero du compte � d�biter
	private Long numCptCred; //numero du compte � cr�diter
	//...
	
	
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Long getNumCptDeb() {
		return numCptDeb;
	}
	public void setNumCptDeb(Long numCptDeb) {
		this.numCptDeb = numCptDeb;
	}
	public Long getNumCptCred() {
		return numCptCred;
	}
	public void setNumCptCred(Long numCptCred) {
		this.numCptCred = numCptCred;
	}
	public Virement(Double montant, Long numCptDeb, Long numCptCred) {
		super();
		this.montant = montant;
		this.numCptDeb = numCptDeb;
		this.numCptCred = numCptCred;
	}
	public Virement() {
		super();
	}
		
	
}

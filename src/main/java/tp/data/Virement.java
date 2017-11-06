package tp.data;

public class Virement {
	private Double montant; //montant à transférer
	private Long numCptDeb; //numero du compte à débiter
	private Long numCptCred; //numero du compte à créditer
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
	
	
}

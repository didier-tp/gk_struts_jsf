package tp.web.actions;

import com.opensymphony.xwork2.ActionSupport;

public class CalculEmpruntAction extends ActionSupport {

	
	

	private static final long serialVersionUID = 1L;
	
	private String stMontant;
	private String stTauxAnnuel;
	private String stNbAnnees;
	private Double mensualite;
	
	private String message=null;
	
	
	public String calculerMensualite(){
		String res="success";
		try {
			double tauxAnnuel = Double.parseDouble(stTauxAnnuel);
			double montant = Double.parseDouble(stMontant);
			int nbAnnees = Integer.parseInt(stNbAnnees);
			double tauxMensuel = (tauxAnnuel / 100) / 12 ;
			int nbMois = nbAnnees * 12 ;
			this.mensualite = montant * tauxMensuel / 
					         ( 1 - Math.pow ( 1 + tauxMensuel , -nbMois) ) ;
		} catch (NumberFormatException e) {
				//e.printStackTrace();
			    System.err.println(e.getMessage());
				message="une erreur a eu lieu. verifier les valeurs saisies";
				res="input";
		}
		
		return res;
	}

	public String getStMontant() {
		return stMontant;
	}

	public void setStMontant(String stMontant) {
		this.stMontant = stMontant;
	}

	public String getStTauxAnnuel() {
		return stTauxAnnuel;
	}

	public void setStTauxAnnuel(String stTauxAnnuel) {
		this.stTauxAnnuel = stTauxAnnuel;
	}

	public Double getMensualite() {
		return mensualite;
	}

	public void setMensualite(Double mensualite) {
		this.mensualite = mensualite;
	}

	public String getStNbAnnees() {
		return stNbAnnees;
	}

	public void setStNbAnnees(String stNbAnnees) {
		this.stNbAnnees = stNbAnnees;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}

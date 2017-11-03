package tp.web.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import tp.data.Compte;
import tp.service.ServiceCompte;

//pplusieurs instances de la classe CompteAction
public class CompteAction extends ActionSupport {
	
	private Long numClient;//valeur différente pour chaque utilisateur
	private String password;
	
	private List<Compte> comptes;
	
	//une instance instance d'un service partagée suffit
	private ServiceCompte serviceCompte = 
			       ServiceCompte.getInstance();

	public String login(){
		if(serviceCompte.verifAuth(numClient, password))
			return "success";
		else
			return "error"; //ou "input" ou ...
	}
	
	public String recupComptesDuClient(){
		String res="success";
		try {
			this.comptes = serviceCompte.comptesDuClient(numClient);
		} catch (Exception e) {
			e.printStackTrace();
			res="error"; // ou "input" ou ...
		}
		return res;
	}
	
	
	//+get/set
	
	public Long getNumClient() {
		return numClient;
	}

	public void setNumClient(Long numClient) {
		this.numClient = numClient;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	
	

}

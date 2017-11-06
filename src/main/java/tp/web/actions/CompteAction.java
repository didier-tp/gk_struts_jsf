package tp.web.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import tp.data.Compte;
import tp.service.ServiceCompte;

//pplusieurs instances de la classe CompteAction
public class CompteAction extends ActionSupport  implements SessionAware{
	
	private Long numClient;//valeur différente pour chaque utilisateur
	private String password;
	private List<Compte> comptes;
	
	//une instance instance d'un service partagée suffit
	private ServiceCompte serviceCompte = 
			       ServiceCompte.getInstance();
	
	private SessionMap<String,Object> sessionMap;
	
	@Override //from SessionAware (for session injection)
	public void setSession(Map<String, Object> map) {
	sessionMap=(SessionMap)map;
	}
	
	public String login(){
		System.out.println("login() appelé sur " + this.toString());
		if(serviceCompte.verifAuth(numClient, password)){
			this.sessionMap.put("numClient", this.numClient);
			//affichage d'une chose en session
			//via <s:property value="#session.numClient"/> dans une page jsp
			return "success";
		}
		else{ this.message="echec authentification. veuillez réessayer";
			return "error"; //ou "input" ou ...
		}
	}
	
	public String recupComptesDuClient(){
		System.out.println("recupComptesDuClient() appelé sur " 
	                       + this.toString());
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

	
	
private String message=null;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

package tp1;

public class personnes {
    private String nom;
    private String prenom;
    private String sexe;
    private int age;
  public  personnes(){
   	 nom="Med"; 
   	 prenom="BenAli";
   	 sexe="masculin";
   	 age=30;
    }
    public personnes(String nom,String prenom,String sexe,int age){
   	 this.nom=nom;
   	 this.prenom=prenom;
   	 this.sexe=sexe;
   	 this.age=age;
    }
    public String toString() {
   	 return "nom= " +nom+ " prenom= " +prenom+ " sexe= " +sexe+ " age= " +age;
    }
    public String getnom() {
   	 return nom;
    }
    public String getprenom() {
   	 return prenom;
    }
    public int getage() {
   	 return age;
    }
    public String getsexe() {
   	 return sexe;
    }
    void affiche() {
   	 System.out.println(this);
    }
    boolean sameLastName(personnes p) {
   	if(this.prenom==p.prenom) {
   	  return true;
   	}
   	else {
   		return false;
   	}
    }
}


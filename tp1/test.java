package tp1;

public class test {
	public static void main(String[] args) {
		personnes p1=new personnes("mariem","bouali","fem",20);
		personnes p2=new personnes();
		p1.affiche();
		p2.affiche();
		if(p1.sameLastName(p2)==false) {
			System.out.println("les deux personnes n'ont pas le meme nom");
		}
		else {
			System.out.println("les deux personnes ont le meme nom");
			}
		if(p1.getage()>p2.getage()) {
			System.out.println(p1.getnom()+"  est plus agee que "+p2.getnom());
		}
		else if(p1.getage()<p2.getage()) {
			System.out.println(p2.getnom()+"  est plus agee que "+p1.getnom());
		}
		else {
			System.out.println(p1.getnom()+"  ont le meme age "+p2.getnom());
		}
		

	}

}

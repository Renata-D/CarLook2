package Entitaeten;


public class Endkunde extends User {
	private int kundenid;
	private String name;
	private String anrede;
	private String vorname;
	

    

    		public int getID() {
        		return kundenid;
    		}

   		 public void setID(int kundenid) {
        		this.kundenid = kundenid;
    		}			

    		public String getAnrede() {
        		return anrede;
    		}

    		public void setAnrede(String anrede) {
        		this.anrede = anrede;
    		}

    		public String name() {
        		return name;
    		}

    		public void setVorname(String vorname) {
        		this.vorname = vorname;
    		}
    		public String getVorname() {
    			return vorname;
    		}

  
}

<<<<<<< Updated upstream:user.txt
user klasse
=======
package Entitaeten;
//user klasse
>>>>>>> Stashed changes:CarLock2/src/main/java/Entitaeten/User.java
public class User {

	private int id;
	private String email;
	private String name;
	private int pw;
	private String vorname;
	private String anrede;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
	this.name=name;
    }

    public void setAnrede(String anrede){
        this.anrede=anrede;
    }
    public String getAnrede(){
	return anrede;
    }

    public void setVorname(String vorname){
	this.vorname=vorname;
    }

    public String getVorname(){
	return vorname;
    }

    




 }
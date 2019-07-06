package wildcodeschool.java06;

public class Wilder {   // classe wilder
		
			private String firstname; // attributs
			private boolean aware;
			
		
				
				public Wilder(){  // constructeur permettant d'initialiser les attributs
					
					
				}
				
					 public Wilder (String firstname , boolean aware) {
					        this.firstname = firstname;
					        this.aware = false;
					 }
					 
			
				 public void setfirstname(String firstname)// set et get de firstname
			      {
			       this.firstname = firstname;
			     } 
			 
			      public String getfirstname()
			      { 
			    	  return this.firstname;
			      }  
			      
			   
			      public void setaware(boolean aware) // set et get de aware
			     {
			        this.aware = false;
			      } 
			 
			      public boolean isaware()
			      {
			    	  return this.aware;
			      }
		
				
					public String whoAmI() {   // méthode instantanée
						
						String etataware = "je suis aware";
						if (!this.isaware());
				        return "Je m'appelle " + this.getfirstname()+  "et" + etataware + "."; // les setters ne renvoient rien
				        }
					
					
					
						
						//return "Je m'appelle " + this.firstname+ " et je suis " + this.aware;
						
					
					
				///System.out.println("Je m'appelle "+this.firstname()  +"et" + etataware);
				// TODO Auto-generated method stub
		

}

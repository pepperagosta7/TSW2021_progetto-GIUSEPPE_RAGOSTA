package preprova;

public class Persona 
{
 private String nome;
 private String cognome;
 private String ruolo;

 public Persona(String s1,String s2, String s3)
		 {
			  nome = s1;
			  cognome = s2;
			  ruolo = s3;
		 }
		 
				 public String getNome()
					 {
					  return nome;
					 }
					 
				 public String getCognome()
					 {
					  return cognome;
					 }
					 
				 public String getRuolo()
					 {
					  return ruolo;
					 }
					 
				 public boolean equals(Persona p)
					 {
					  return nome.contentEquals(p.getNome()) && cognome.contentEquals(p.getCognome()) && ruolo.contentEquals(p.getRuolo());
					 }
}

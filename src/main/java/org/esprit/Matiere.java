package org.esprit;

public class Matiere {
 private int id;
 private String nom;
 private String description;
 
 Matiere(int id, String nom, String description){
	 this.id=id;
	 this.nom=nom;
	 this.description=description;}
 

Matiere math=new Matiere(1,"Mathematiques","etude des npmbres et des formes");
}
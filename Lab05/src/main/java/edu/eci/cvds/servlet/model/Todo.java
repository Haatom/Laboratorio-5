package edu.eci.cvds.servlet.model;
/**
* @authors David Perez Nicolas Camacho
*/
public class Todo{
	
	public int userId;
	public int id;
	public String tittle;
	public boolean completed;
	
	public Todo(){ }
	
	public int getId(){
		return id;
	}
	public int setId(int num){
		id = num;
	}
	public int getUserId(){
		return userId;
	}
	public int setId(int num){
		userId = num;
	}
	
	public String getTittle(){
		return tittle;
	}
	public StringsetId(String stri){
		tittle = stri;
	}
	
	public boolean getComplete(){
		return completed;
	}
	public boolean setId(boolean a){
		completed = a;
	}
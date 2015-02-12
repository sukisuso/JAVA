package floyd;

import java.util.ArrayList;

public class ciudad {
	public String nombre;
	public int id;
	public ArrayList<Integer> distancias = new  ArrayList<Integer>();
	
	public int get(int i){
		return distancias.get(i);
	}
}

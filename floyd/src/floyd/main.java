package floyd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class main {
	public static String path = "D:/Documentos/WorkSpace_s/eclipse/floyd/src/floyd/grafo.json";
	public static int TAM = 6;

	public static void main(String[] args) throws IOException {

		Gson gson = new Gson();
		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		String line;
		String sb = new String();
		while ((line = bufferedReader.readLine()) != null)
			sb += line;

		grafo g = gson.fromJson(sb, grafo.class);
		int[][] caminos = floyd(g);
		
		System.out.println();
		System.out.println();
		
		showCamino(caminos,0,3,g );
		System.out.println();
		showCamino(caminos,2,4,g );
		System.out.println();
		showCamino(caminos,3,0,g );
		System.out.println();
		showCamino(caminos,4,0,g );
		System.out.println();
	}

	public static int[][] floyd(grafo g) {

		int[][] p = new int[TAM][TAM];
		int[][] caminos = new int[TAM][TAM];

		for (int i = 0; i < TAM; i++)
			for (int j = 0; j < TAM; j++) {
				p[i][j] = g.get(i, j);
				caminos[i][j] = j;
			}

	//	showM(p);
		System.out.println("__");
		System.out.println("__");

		for (int k = 0; k < TAM; k++) {
			for (int i = 0; i < TAM; i++)
				for (int j = 0; j < TAM; j++) {
					if (p[i][j] > (p[i][k] + p[k][j])) {
						p[i][j] = p[i][k] + p[k][j];
						caminos[i][j] = k;
					}
				}
		}
		//showM(p);
		System.out.println("__");
		System.out.println("__");
		return caminos;
	}

	public static void showM(int[][] g) {

		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++)
				System.out.print(g[j][i] + "   ");
			System.out.println();
		}
	}

	public static void showCamino(int[][] c, int o , int d, grafo g){		
		
		System.out.println("    ¿Cual es el camino mas corto desde "+g.ciudades[o].nombre+" hasta "+g.ciudades[d].nombre+"?");
		
		int k = o;
		 System.out.print("        "+g.ciudades[o].nombre);
		 while (k != d)
		 {
             k = c[k][d];
             System.out.print( " --> "+ g.ciudades[k].nombre);
		 }
		 System.out.println();
	}
}

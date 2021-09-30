package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tab1 = "[";
		
		for (int j = 0; j<tabell.length; j++) {
			if (j > 0) {
				tab1 += ",";
			}
			tab1 += tabell[j];
		}
		tab1 += "]";
		System.out.print(tab1);
		return tab1;
		
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum +=tabell[i];
		} System.out.println(sum);
		int a = 0;
		int summer = 0;
		while (a > tabell.length) {
			summer += tabell[a];
			a++;
		}
		for (int x:tabell) {
			summer += x;
		}
		System.out.println(summer);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean finnes = false;
		int x = 0;
		
		while (x < tabell.length && (!finnes)) {
			if (tabell[x] == tall) {
				finnes = true;
				}
			x++;
		}
		System.out.println(finnes);
		return finnes;

		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int tab = -1;
		
		for(int i=0; i<tabell.length; i++) {
			if (tall == tabell[i]) {
				tab = i;
			}
			
		}

		return tab;
		
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] arr = new int[tabell.length];
		for (int i=0; i<tabell.length; i++) { // kan skrive arr.length
			arr[i] = tabell[tabell.length - 1 - i];
		}
//		for (int i=tabell.length-1; i >= 0; i--) {
//			System.out.println(tabell[i]);
//		} 
		
		return arr;
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int i = 1;
		boolean sortert = true;
		
		while (sortert && i<tabell.length - 1 ) {
			if (tabell[i] > tabell[i+1]) {
				sortert = false;
			}
			i++;
		} 
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[nyLengde];
		
		for (int i=0; i<tabell1.length; i++) {
			nyTab [i] = tabell1[i];
		}
		for (int j=0; j<tabell2.length; j++) {
			nyTab[tabell1.length+j] = tabell2[j];
		} 
		return nyTab;
	}
}

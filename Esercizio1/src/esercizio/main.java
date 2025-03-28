package esercizio;

public class main {

	public static void main(String[] args) {
		System.out.println("ciao mondo");
		
		// dichiarare e valorizzare una variabile di tipo int e stampare il valore in console 
		
		int primoNumero = 10;
		System.out.println(primoNumero);
		// dichiarare e valorizzare una variabile di tipo float e stampare il valore in console 
		float secondoNumero;
		secondoNumero = 10.7F;
		System.out.println(secondoNumero);
		// dichiarare e valorizzare una variabile di tipo long e stampare il valore in console 
		long terzoNumero = 100000000L;
		System.out.println(terzoNumero);
		// dichiarare e valorizzare una variabile di tipo char e stampare il valore in console
		char stringa = 'c';
		System.out.println(stringa);
		
		//qual è la differenza tra somma e concatenazione nell’utilizzo dell’operatore “+” nei seguenti esempi? 
		int c = 84 - 80 / 2 + 4 * 4 - 1; 
		
		//String s1 = "Il risultato è: " + 84 - 80 / 2 + 4 * 4 - 1; 
		String s2 = "il risultato è: " + (84 - 80 / 2 + 4 * 4 - 1);
		//provate ad eseguire entrambe le istruzioni e osservate i risultati
		
		//creare un programma che: 
		//dati due double, positivi e maggiori di 0, stampi il quoziente dei due numeri 
		
		double a = 10.30;
		double b = 25.39;
		System.out.println(a/b);
		//dati quattro int ne stampi la somma 
		int d = 3;
		int e = 7;
		int f = 10;
		int g = 5;
		System.out.println(d+e+f+g);
		//dati due byte assegni la somma di questi ad una variabile di tipo int 
		byte h = 2;
		byte i = 3;
		int l = h + i;
		System.out.println(l);
		//crei una variabile di tipo long assegnandogli un valore di -5.000.000.000 
		long k = -5000000000L;
		System.out.println(k);
		//dato un long stampare il resto ottenuto dividendolo per 7
		long m = 3000000L;
		long resto = m % 7;
		System.out.println(resto);
		
		//creare un programma che: 
		//inizializzi 2 variabili di tipo int con valori a piacere 
		int n = 2;
		int w = 9;
		
		//crei una variabile che contenga il prodotto delle due variabili dichiarate in precedenza 
		int prodotto = n * w;
		//stampi a video tutte le variabili usate
		System.out.println(n + " " + w + " " + prodotto);
	}
}


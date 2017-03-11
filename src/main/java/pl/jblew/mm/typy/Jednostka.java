package pl.jblew.mm.typy;

import pl.jblew.mm.typy.jednostki.JednostkaSI;

public abstract class Jednostka {
	public abstract Jednostka [] coMożnaPrzeliczyć();
	public abstract JednostkaSI naJednostkęSI();
	public abstract double przelicz(double wartość, Jednostka na);
	
	
}

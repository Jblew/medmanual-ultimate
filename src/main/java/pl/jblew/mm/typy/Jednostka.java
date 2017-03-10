package pl.jblew.mm.typy;

public abstract class Jednostka {
	public abstract Jednostka [] coMożnaPrzeliczyć();
	public abstract JednostkaSI naJednostkęSI();
	public abstract double przelicz(double wartość, Jednostka na);
	
	
}

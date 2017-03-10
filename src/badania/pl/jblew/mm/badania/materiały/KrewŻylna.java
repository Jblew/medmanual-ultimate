package pl.jblew.mm.badania.materiały;

import pl.jblew.mm.adnotacje.Image;

@Image(url="../krwii/probowki.png") /*






























*/
public class KrewŻylna extends Krew {
	
	public static class Pełna extends KrewŻylna {
		private static KrewŻylna.Pełna instance;
		private Pełna(){
		}
		public static KrewŻylna.Pełna I(){
			if(instance == null) {
				instance = new KrewŻylna.Pełna();
			}
			return instance;
		}
	}
	
	public static class Osocze extends KrewŻylna {
		private static KrewŻylna.Osocze instance;
		private Osocze(){
		}
		public static KrewŻylna.Osocze I(){
			if(instance == null) {
				instance = new KrewŻylna.Osocze();
			}
			return instance;
		}
	}
	
	public static class Surowica extends KrewŻylna {
		private static KrewŻylna.Surowica instance;
		private Surowica(){
		}
		public static KrewŻylna.Surowica I(){
			if(instance == null) {
				instance = new KrewŻylna.Surowica();
			}
			return instance;
		}
	}
	
}

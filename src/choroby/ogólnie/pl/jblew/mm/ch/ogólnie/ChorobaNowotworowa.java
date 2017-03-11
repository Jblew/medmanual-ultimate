package pl.jblew.mm.ch.ogólnie;

public interface ChorobaNowotworowa {
	public static class WszystkieNowotwory extends Choroba {
		public static final ChorobaNowotworowa.WszystkieNowotwory WszystkieNowotwory = new ChorobaNowotworowa.WszystkieNowotwory();

		protected WszystkieNowotwory() {
			nowotworowa();
		}
	}
}

package pl.jblew.mm.wirusy.herpeswirusy.kshv;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.herpeswirusy.Herpeswirus;

public class KSHV extends Herpeswirus {
	public static final KSHV KSHV = new KSHV();

	protected KSHV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Przenoszony drogą płciową. Wirus B-limfotropowy. Jest wirusem onkogennym. Najczęściej powoduje"
				+ " mięsaka Kaposiego, ale może takżebyć przyczyną mięsakonaczyniaków, pierwotnego chłoniaka "
				+ "wysiękowego jam surowiczych i choroby Castlemana (hiperplazji śródbłonka naczyń krwionośnych "
				+ "i węzłów chłonnych).";
	}

	@Override
	public ImageReference[] galeria() {
		return new ImageReference[] {
				new ImageReference("kaposi-sarcoma.png", "Wieloogniskowa postać skórna mięsaka Kaposiego"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("kaposi-sarcoma-2.png", "Mięsak Kaposiego w jamie ustnej"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("kaposi-sarcoma-lungs.png", "Inwazyjna forma Mięsaka Kaposiego w płucach"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
		};
	}
}

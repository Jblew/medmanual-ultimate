package pl.jblew.mm.dist;

public class TwoTuple<A, B> {
	private final A a;
	private final B b;

	public TwoTuple(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

}

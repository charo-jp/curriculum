package abstracts;

public abstract class PolimoSuper {
	protected void call() {
		System.out.println(this.getClass());
	}
}

class PolimoSub1 extends PolimoSuper {
	@Override
	protected void call() {
		super.call();
	}
}

class PolimoSub2 extends PolimoSuper {
	@Override
	protected void call() {
		super.call();
	}
}



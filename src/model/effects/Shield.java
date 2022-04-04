package model.effects;

public class Shield extends Effect {
	public Shield(String name, int duration) {
		super(name, duration, EffectType.BUFF);
	}

	public Shield(int duration) {
		super("Shield", duration, EffectType.BUFF);

	}

}
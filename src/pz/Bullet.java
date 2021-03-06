package pz;

import org.newdawn.slick.Animation;

import com.Position;

public abstract class Bullet {
	private int damage = 0;
	private Animation ani = new Animation();
	private int speed = 0;
	private Position pos;

	public Bullet(int damage, int speed, Position pos) {
		setDamage(damage);
		//this.setAnimation(ani);
		setSpeed(speed);
		setPos(pos);
		loadAnimation();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Animation getAnimation() {
		return ani;
	}

	public void setAnimation(Animation img) {
		this.ani = img;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public void setPos(int x, int y) {
		this.pos.x = x;
		this.pos.y = y;
	}

	public abstract void move();
	protected abstract void loadAnimation();

}

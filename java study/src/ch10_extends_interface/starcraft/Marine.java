package ch10_extends_interface.starcraft;

public class Marine extends StarUnit{
	
	public Marine() {
		this("마린", 6 , 50 , 0);
		
	}
	
	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);

	}
	public void attack(StarUnit unit) {
		unit.setHp( unit.getHp() - super.getDamage() );
	}

	
	public void move(int x, int y) {
		System.out.println("x:  " + x + ",y:  " + y + "로 이동");
	}
	
	public void stimpack() {
		System.out.println("우아아아!");
		
		super.setHp(super.getHp() - 10);
		super.setDamage(super.getDamage()*2);
	}
	
	

	@Override
	public String toString() {
		return "Marine [name=" + super.getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", armor=" + getArmor() + "]";
	}



}

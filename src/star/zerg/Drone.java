package star.zerg;

public class Drone {
	public int hp;
	protected int damage;
	private String color;
	String name;
	
	public void work() {
		System.out.println("드론이 일합니다.");
		this.info();
	}
	
	private void info() {
		System.out.println("드론의 체력"+hp);
		System.out.println("드론의 공격력"+damage);
		System.out.println("드론의 색"+color);
		System.out.println("드론의 이름"+name);
	}
}

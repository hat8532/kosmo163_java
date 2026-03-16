package star;

import star.zerg.Drone;
import star.terran.Scv;
import star.protoss.probe;

public class StarMain {

	public static void main(String[] args) {
		//테란 저그 프로토스    일꾼용 클래스   공격용 유닛 패키지		
		Drone d = new Drone();
		d.hp = 40;
		d.damage = 5;
		d.color = "노란색";
		d.name = "드론";
		
		d.work();
		
		
	}
	
}

package daiso;

public class Customer {
	int money;
	int point;
	
	public void result(ElectricItem[] el) {
		for(int i=0; i<el.length; i++) {
			this.buy(el[i]);
		}
		this.printInfo();
	}
	
	public void buy(ElectricItem el) {
		//자기가 가진 돈에서 제품의 가격을 빼고
		//자기가 가진 포인트에서 제품의 포인트를 더한다.
		this.money -= el.price;
		this.point -= el.point;
	}		
		//구매 후 잔액과 포인트를 출력
		public void printInfo() {
		System.out.println("잔액: "+this.money);
		System.out.println("포인트: "+this.point);
		}
	}

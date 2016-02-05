package lecture3;

public class PartyPlanningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class PartyPlanner{
	CakeManager cm;
	DecorationManager dm;
	FoodManager fm;
	InvitationManager im;
	void plan(){
		cm.orderCake();
		DecorationItems di = dm.orderDecoration();
		dm.arrangeDecoration(di);
		fm.orderFood();
		im.sendInvitation();
	}
}

class CakeManager{

	public void orderCake() {
		// TODO Auto-generated method stub
		
	}
	
}

class DecorationManager{

	public DecorationItems orderDecoration() {
		// TODO Auto-generated method stub
		return null;
	}

	public void arrangeDecoration(DecorationItems di) {
		// TODO Auto-generated method stub
		
	}
	
}

class FoodManager{

	public void orderFood() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class InvitationManager{

	public void sendInvitation() {
		// TODO Auto-generated method stub
		
	}
	
}

package RobotAdapter;


public class Robot {

    private Adapter adapter;

    public void EquipWeapon() {
        System.out.println("'¨''Robot seeks revenge'¨''':");
        adapter.activateWeapon();
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

}

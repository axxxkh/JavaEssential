package HomeWork3.TaskThree;

public class Ship extends Vehicle {
    public int passangersAmount;
    public String portSigned;

    public int getPassangersAmount() {
        return passangersAmount;
    }

    public void setPassangersAmount(int passangersAmount) {
        this.passangersAmount = passangersAmount;
    }

    public String getPortSigned() {
        return portSigned;
    }

    public void setPortSigned(String portSigned) {
        this.portSigned = portSigned;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("passengers number is " + passangersAmount);
        System.out.println("ship assigned to the port " + portSigned);
    }
}

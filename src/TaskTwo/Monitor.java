package TaskTwo;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private EthernetAdapter ethernetAdapter;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public EthernetAdapter getEthernetAdapter() {
        return ethernetAdapter;
    }

    public void setEthernetAdapter(EthernetAdapter ethernetAdapter) {
        this.ethernetAdapter = ethernetAdapter;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY && Objects.equals(ethernetAdapter, monitor.ethernetAdapter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY, ethernetAdapter);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMonitor:"
                + "resolutionX=" + resolutionX
                + ", resolutionY=" + resolutionY;
    }
}

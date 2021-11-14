public class InternetDevice
{
    private String name;
    private boolean connected = false;
    static int connectedDevices = 0;
    
    InternetDevice(String name) {
        this.name = name;
    }
    
    public void connect() {
        // Connect only if currently disconnected
        if (!this.connected) {
            this.connected = true;
            InternetDevice.connectedDevices += 1;
        }
    }
    
    public void disconnect() {
        if (this.connected) {
            this.connected = false;
            InternetDevice.connectedDevices -= 1;
        }
    }
    
    public boolean isConnected() {
        return this.connected;
    }
    
    public void displayStatus() {
        System.out.println("Are we connected?: " + connected);
    } 
    
    static void displayConnections() {
        System.out.println(
            InternetDevice.connectedDevices
            + " devices are connected.");
    }
    
    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("Ulefone");
        d1.connect();
        d1.disconnect();
        
        InternetDevice d2 = new InternetDevice("LG");
        d2.connect();
        d1.disconnect();
        d2.connect();
        
        InternetDevice d3 = new InternetDevice("Samsung");
        d3.connect();
        d3.connect();
        
        InternetDevice d4 = new InternetDevice("IPhone");
        d4.disconnect();
        InternetDevice d5 = new InternetDevice("Huawei");
        
        InternetDevice.displayConnections();
    }
}

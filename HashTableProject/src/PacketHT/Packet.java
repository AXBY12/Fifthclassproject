package PacketHT;

public class Packet {
    private long sequenceNumber;
    private String protocol;
    private int port;


    public Packet(int sequenceNumber, String protocol, int port) {
        this.sequenceNumber = sequenceNumber;
        this.protocol = protocol;
        this.port = port;
    }


    public int getSequenceNumber() {
        return (int) sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol() {
        this.protocol = protocol;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

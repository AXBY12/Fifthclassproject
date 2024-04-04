package PacketHT;

public class Packet {
    private long sequenceNumber;
    private String protocol;
    private int port;


    public Packet(long sequenceNumber, String protocol, int port) {
        this.sequenceNumber = sequenceNumber;
        this.protocol = protocol;
        this.port = port;
    }


    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getProtocol() {
        this.protocol = protocol;
    }
}

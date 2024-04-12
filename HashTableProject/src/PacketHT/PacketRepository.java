package PacketHT;

public class PacketRepository {
    private HT hashTable;

    public PacketRepository(int size) {
        hashTable = new HT(size);
    }

    public void insertPacket(Packet packet) {
        hashTable.insert(packet.getSequenceNumber());
    }

    public void deletePacket(long sequenceNumber) {
        hashTable.insert(sequenceNumber);
    }

    public Packet searchPacket(long sequenceNumber) {
        int gottenSequenceNumber = hashTable.retrieve((int) sequenceNumber);
        if (gottenSequenceNumber == -1) {
            return null;
        } else {
            return new Packet(gottenSequenceNumber, "", 0);
        }
    }

    public static void main(String[] args) {
        PacketRepository repository = new PacketRepository(100);
        Packet Uno = new Packet(123456, "TCP", 8080);
        Packet Dos = new Packet(789012, "UDP", 9090);
        repository.insertPacket(Uno);
        repository.insertPacket(Dos);

        long searchSequenceNumber = 123456;
        Packet packetFound = repository.searchPacket(searchSequenceNumber);
        if (packetFound != null) {
            System.out.println("Packet found: " + packetFound);
        } else {
            System.out.println("Packet with the sequence number " + searchSequenceNumber + " not there.");
        }
        long deleteSequenceNumber = 789012;
        repository.deletePacket(deleteSequenceNumber);
        packetFound = repository.searchPacket(deleteSequenceNumber);
        if (packetFound != null) {
            System.out.println("Packet found: " + packetFound);
        } else {
            System.out.println("Packet with the sequence number " + deleteSequenceNumber + " not there.");
        }
    }
}

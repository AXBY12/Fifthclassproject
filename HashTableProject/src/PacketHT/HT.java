package PacketHT;

public class HT {
    private int[] array;

    public HT(int size) {
        array = new int[size];
    }

    private int hash(int sequenceNumber) {
        return sequenceNumber % array.length;
    }

    public void insert(long sequenceNumber){
        int index = hash((int) sequenceNumber);
        array[index] = (int) sequenceNumber;
    }

    public int retrieve(int sequenceNumber) {
        int index = hash(sequenceNumber);
        return array[index];
    }
}

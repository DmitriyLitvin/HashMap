
public class HashMap {
    private Node[] hashTable;
    private int size = 0;
    private float threshold;

    public HashMap() {
        hashTable = new Node[16];
        threshold = hashTable.length * 0.75F;
    }


    public void put(Integer key, Long value) {
        if (size + 1 >= threshold) {
            threshold *= 2;
            arrayDoubling();
        }

        int firstHash = mod(key, hashTable.length);
        int secondHash = 1 + mod(key, hashTable.length - 1);

        for (int i = 0; i < hashTable.length; i++) {
            int index = mod(firstHash + i * secondHash, hashTable.length);

            if (hashTable[index] != null &&
                    key.equals(hashTable[index].key)) {
                hashTable[index].setValue(value);

                return;
            } else if (hashTable[index] == null) {
                hashTable[index] = new Node(key, value);
                size++;

                return;
            }
        }
    }

    private int mod(Integer firstNumber, Integer secondNumber) {
        int result;

        result = firstNumber % secondNumber;
        if (result < 0) {
            result += secondNumber;
        }

        return result;
    }

    private void arrayDoubling() {
        Node[] tempHashTable = hashTable;
        hashTable = new Node[2 * hashTable.length];

        size = 0;
        for (Node node : tempHashTable) {
            if (node != null) {
                put(node.key, node.value);
            }
        }
    }

    public Long get(Integer key) {
        int firstHash = mod(key, hashTable.length);
        int secondHash = 1 + mod(key, hashTable.length - 1);

        for (int i = 0; i < hashTable.length; i++) {
            int index = mod(firstHash + i * secondHash, hashTable.length);

            if (hashTable[index] != null &&
                    key.equals(hashTable[index].key)) {

                return hashTable[index].getValue();
            }
        }

        return null;
    }

    public int size() {
        return size;
    }


    private class Node {
        private Integer key;
        private Long value;

        private Node(Integer key, Long value) {
            this.key = key;
            this.value = value;
        }

        private Integer getKey() {
            return key;
        }

        private Long getValue() {
            return value;
        }

        private void setValue(Long value) {
            this.value = value;
        }
    }
}
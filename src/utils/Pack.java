package utils;

public class Pack {
    
    public static void pack(byte[] buffer, int len) {
        for (int i = 0; i < len; i++)
            buffer[i] += 1;
    }
    
    public static void unpack(byte[] buffer, int len) {
        for (int i = 0; i < len; i++)
            buffer[i] -= 1;
    }
    
    public static void pack(byte[] buffer) {
        pack(buffer, buffer.length);
    }
    
    public static void unpack(byte[] buffer) {
        unpack(buffer, buffer.length);
    }
    
    public static int pack(int n) {
        return n + 1;
    }
    
    public static int unpack(int n) {
        return n - 1;
    }
}

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        bigCount *= 5;
        if ((bigCount + smallCount) >= goal) {
            for (int i = 0; i <= bigCount; i++) {
                if ((i % 5 == 0) && (i + smallCount >= goal) && (i <= goal)) {
                    return true;
                }
            }
        }
        return false;
    }
}
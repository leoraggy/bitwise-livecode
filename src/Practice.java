public class Practice {
    public static void main(String[] args) {
        int x = 21;
        int p = 0b11001;

        int color = 0xc4246D;
        int blueMask = 0x00FF00;

        int blue = color & blueMask;

        int greenMask = 0x00FF00;

        int green = (color & greenMask) >> 8;

        System.out.println(Integer.toHexString(green));

        int q = x & p;

        System.out.println(Integer.toBinaryString(q));

        int y = 0xffff;
        int z = 94;
        
        System.out.println(Integer.toHexString(z));
    }
}
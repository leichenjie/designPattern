package main.java.factory.simpleFactory.demo2;

public class GFFactory {
    public static BaseGF createGF(GFType type) {
        switch (type) {
            case HE_BEI:
                return new HeBeiGF();
            case SI_CHUN:
                return new SiChunGF();
            default:
            case SHAN_DONG:
                return new ShangDongGF();
        }
    }
}

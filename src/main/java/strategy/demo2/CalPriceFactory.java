package main.java.strategy.demo2;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class CalPriceFactory {
//    private CalPriceFactory() {}
//
//    public static CalPrice createCalPrice(Player player) {
//        Double totalAmount = player.getTotalAmount();
//        if (totalAmount > 30000) {
//            return new GoldVip();
//        }else if (totalAmount > 20000) {
//            return new SuperVip();
//        }else if (totalAmount > 10000) {
//            return new Vip();
//        }
//        return new Orginc();
//    }

    private static final String CAL_PRICE_PACKAGE = "designPattern.strategy.demo2";

    private ClassLoader classLoader = getClass().getClassLoader();

    private List<Class<? extends CalPrice>> calPriceList;     //策略列表

    public CalPrice createCalPrice(Player player) {
        for (Class<? extends CalPrice> clazz : calPriceList) {
            PriceRegion priceRegion = handleAnnotation(clazz);
            if (player.getTotalAmount() > priceRegion.min() && player.getTotalAmount() < priceRegion.max()) {
                try {
                    return clazz.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        throw new RuntimeException("策略获得失败");
    }

    public PriceRegion handleAnnotation(Class<? extends CalPrice> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i] instanceof PriceRegion) {
                return (PriceRegion) annotations[i];
            }
        }
        return null;
    }

    private CalPriceFactory() {
        init();
    }

    private void init() {
        calPriceList = new ArrayList<Class<? extends CalPrice>>();
        File[] resources = getResources();
        Class<CalPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < resources.length; i++) {
            try {
                Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." +resources[i].getName().replace(".class",""));
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                    calPriceList.add((Class<? extends CalPrice>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".","/")).toURI());
            return file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static CalPriceFactory getInstance() {
        return CalPriceFactoryInstance.instance;
    }

    private static class CalPriceFactoryInstance {
        private static CalPriceFactory instance = new CalPriceFactory();
    }

}

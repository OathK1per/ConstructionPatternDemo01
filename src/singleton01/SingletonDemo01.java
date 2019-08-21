package singleton01;

public class SingletonDemo01 {

    public static void main(String[] args) {
        InstantLoad instance = InstantLoad.getInstance();
        InstantLoad instance2 = InstantLoad.getInstance();

        System.out.println(instance);
        System.out.println(instance2);

        LazyLoad lazyLoad1 = LazyLoad.getInstance();
        LazyLoad lazyLoad2 = LazyLoad.getInstance();

        System.out.println(lazyLoad1);
        System.out.println(lazyLoad2);

        StaticNestedClass staticNestedClass = StaticNestedClass.getInstance();
        StaticNestedClass staticNestedClass2 = StaticNestedClass.getInstance();

        System.out.println(staticNestedClass);
        System.out.println(staticNestedClass2);

        EnumLoad enumLoad = EnumLoad.INSTANCE;
        EnumLoad enumLoad2 = EnumLoad.INSTANCE;
        System.out.println(enumLoad);
        System.out.println(enumLoad2);
    }
}

package builder01;

/**
 * 建造者模式：这里实现了建造(builder)和装配(director)的分离
 * 将建造器赋给装配器，然后用装配器生成需要的实体
 * 更多时候建造器直接返回实体，可以持续建造，美化代码
 */
public class DressingClient {

    public static void main(String[] args) {
        Builder builder = new DressingBuilder();

        Director director = new DressingDirector(builder);

        Dressing dress = director.dress();

        dress.mirror();
    }
}

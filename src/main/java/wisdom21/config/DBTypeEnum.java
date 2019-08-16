package wisdom21.config;

/**
 * @author Joaz
 * @date 2019/8/16 14:59
 * 数据源枚举
 */
public enum DBTypeEnum {
    db1("db1"), db2("db2"), db3("db3");
    private String value;

    DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

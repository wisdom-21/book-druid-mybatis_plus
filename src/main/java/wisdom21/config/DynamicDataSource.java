package wisdom21.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Joaz
 * @date 2019/8/16 14:59
 * 数据源选取
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return  DbContextHolder.getDbType();
    }
}

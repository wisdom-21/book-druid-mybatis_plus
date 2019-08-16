package wisdom21.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Joaz
 * @date 2019/8/16 15:06
 * aop实现数据源切换
 */
@Component
@Order(value = -100)
@Aspect
public class DataSourceSwitchAspect {
    private static final Logger log = LoggerFactory.getLogger(DataSourceSwitchAspect.class);

    @Pointcut("execution(* wisdom21.model.*.mapper.db1..*.*(..))")
    private void db1Aspect() {
    }

    @Pointcut("execution(* wisdom21.model.*.mapper.db2..*.*(..))")
    private void db2Aspect() {
    }

    @Pointcut("execution(* wisdom21.model.*.mapper.db3..*.*(..))")
    private void db3Aspect() {
    }

    @Before("db1Aspect()")
    public void db1() {
        log.info("切换到db1 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db1);
    }

    @Before("db2Aspect()")
    public void db2() {
        log.info("切换到db2 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db2);
    }

    @Before("db3Aspect()")
    public void db3() {
        log.info("切换到db3 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.db3);
    }
}

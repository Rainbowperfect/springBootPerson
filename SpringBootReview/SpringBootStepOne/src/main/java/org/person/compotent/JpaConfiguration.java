package org.person.compotent;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EntityScan(basePackages = "org.person.pojo")

public class JpaConfiguration {

    @Bean
    PersistenceExceptionTranslationPostProcessor  persistenceExceptionTranslationPostProcessor(){
        return new PersistenceExceptionTranslationPostProcessor();  
    }
}

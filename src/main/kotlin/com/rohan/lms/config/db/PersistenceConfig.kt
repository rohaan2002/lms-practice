package com.rohan.lms.config.db
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import javax.sql.DataSource

@Configuration
@MapperScan(
    basePackages = ["com.rohan.lms.dao"], //Replace with your dao package
    annotationClass = Mapper::class
)
open class PersistanceConfig {
    @Bean
    open fun sqlSessionFactoryBean(dataSource: DataSource): SqlSessionFactory {
        val sqlSessionFactoryBean = SqlSessionFactoryBean()
        sqlSessionFactoryBean.setDataSource(dataSource)
        sqlSessionFactoryBean.setConfigLocation(ClassPathResource("mybatis-config.xml")) // Replace with your mybatis-config.xml file
        return sqlSessionFactoryBean.getObject() as SqlSessionFactory
    }
}
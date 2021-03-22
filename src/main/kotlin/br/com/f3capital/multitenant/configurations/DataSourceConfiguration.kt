package br.com.f3capital.multitenant.configurations

import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct
import javax.sql.DataSource

@Configuration
class DataSourceConfiguration(private val dataSourceProperties: DataSourceProperties) {
    @PostConstruct
    fun migrate() {
        dataSourceProperties.getDataSources().values.forEach {
            Flyway.configure().dataSource(it as DataSource).load().migrate()
        }
    }

    @Bean
    fun dataSource(): DataSource {
        val tenantContextRouter = TenantContextRouter()
        tenantContextRouter.setTargetDataSources(dataSourceProperties.getDataSources())

        return tenantContextRouter
    }
}
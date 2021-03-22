package br.com.f3capital.multitenant.configurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DataSourceConfiguration(private val dataSourceProperties: DataSourceProperties) {
    @Bean
    fun dataSource(): DataSource {
        val tenantContextRouter = TenantContextRouter()
        tenantContextRouter.setTargetDataSources(dataSourceProperties.getDataSources())

        return tenantContextRouter
    }
}
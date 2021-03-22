package br.com.f3capital.multitenant.configurations

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix = "tenant-context")
@Component
class DataSourceProperties {

    private val dataSources = LinkedHashMap<Any, Any>()

    fun getDataSources(): LinkedHashMap<Any, Any> {
        return dataSources
    }

    fun setDataSources(dataSources: Map<String, Map<String, String>>) {
        dataSources.forEach { (key, value) ->
            this.dataSources[key] = convert(value)
        }
    }

    private fun convert(dataSource: Map<String, String>): Any {
        return DataSourceBuilder
            .create()
            .url((dataSource["url"]))
            .username(dataSource["username"])
            .password(dataSource["password"])
            .driverClassName(dataSource["driver-class-name"])
            .build()
    }
}
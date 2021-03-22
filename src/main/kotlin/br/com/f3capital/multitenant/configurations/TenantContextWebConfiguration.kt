package br.com.f3capital.multitenant.configurations

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class TenantContextWebConfiguration(private val tenantContextInterceptor: TenantContextInterceptor): WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addWebRequestInterceptor(tenantContextInterceptor)
    }
}
package br.com.f3capital.multitenant.configurations

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource

class TenantContextRouter: AbstractRoutingDataSource() {
    override fun determineCurrentLookupKey(): Any? {
        return TenantContext.getTenantContext()
    }
}
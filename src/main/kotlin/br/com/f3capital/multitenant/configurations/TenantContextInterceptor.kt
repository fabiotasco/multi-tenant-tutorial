package br.com.f3capital.multitenant.configurations

import org.springframework.stereotype.Component
import org.springframework.ui.ModelMap
import org.springframework.web.context.request.WebRequest
import org.springframework.web.context.request.WebRequestInterceptor

@Component
class TenantContextInterceptor: WebRequestInterceptor {
    companion object{
        private const val TENANT_HEADER = "X-Tenant"
    }
    override fun preHandle(request: WebRequest) {
        TenantContext.setTenantContext(request.getHeader(TENANT_HEADER))
    }

    override fun postHandle(request: WebRequest, model: ModelMap?) {
        TenantContext.clearTenantContext()
    }

    override fun afterCompletion(request: WebRequest, ex: Exception?) {}
}
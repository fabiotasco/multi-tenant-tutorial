package br.com.f3capital.multitenant.configurations

class TenantContext {
    companion object {
        private val currentTenantContext = ThreadLocal<String>()

        fun setTenantContext(tenantId: String?) {
            currentTenantContext.set(tenantId)
        }

        fun getTenantContext(): String? {
            return currentTenantContext.get()
        }

        fun clearTenantContext() {
            currentTenantContext.remove()
        }
    }
}
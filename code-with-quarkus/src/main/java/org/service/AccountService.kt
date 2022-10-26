package org.service

import org.entity.Account
import javax.inject.Inject
import javax.inject.Singleton
import javax.persistence.EntityManager

@Singleton
class AccountService {
    @Inject
    var entityManager: EntityManager? = null

    fun getAccounts():kotlin.collections.List<Account?>?{
        return entityManager!!.
        createQuery("SELECT c FROM Account c")
                .resultList as List<Account?>?
    }
}
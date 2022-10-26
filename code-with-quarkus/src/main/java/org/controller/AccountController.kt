package org.controller

import org.entity.Account
import org.service.AccountService
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/api/v1/account")
class AccountController{
    @Inject
    var accountResource: AccountService? = null

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getAccounts(): kotlin.collections.List<Account?>?{
        return accountResource?.getAccounts()
    }
}
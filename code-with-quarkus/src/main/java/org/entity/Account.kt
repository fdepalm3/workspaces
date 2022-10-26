package org.entity
import jdk.jfr.Enabled
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.*

@Table(name = "account")
@Entity
class Account : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null
    var hash_activation: String? = null
    var hash_expiration: String? = null
    var name: String? = null
    var surname: String? = null
    var email: String? = null
    var cuit: String? = null
    var enable: Int? = null
    var email_verified: Int? = null
    var account_creation: String? = null
    var email_confirmation: String? = null

    constructor(id: Int?, hash_activation: String?,
                hash_expiration: String?, name: String?,
                surname: String?, email: String?,
                cuit: String?, email_verified: Int?,
                enable: Int?,
                account_creation: String?, email_confirmation: String?) : super() {

        this.id = id
        this.hash_activation = hash_activation
        this.hash_expiration = hash_expiration
        this.name = name
        this.surname = surname
        this.email = email
        this.cuit = cuit
        this.enable = enable
        this.email_verified = email_verified
        this.account_creation = account_creation
        this.email_confirmation = email_confirmation
    }
    constructor() : super() {}
}
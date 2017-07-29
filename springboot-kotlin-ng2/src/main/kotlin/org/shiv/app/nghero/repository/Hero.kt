package org.shiv.app.nghero.repository

import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Entity
import java.io.Serializable

@Entity
data class Hero(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = -1, val name: String?) : Serializable {
	private constructor() : this(null, null)
}
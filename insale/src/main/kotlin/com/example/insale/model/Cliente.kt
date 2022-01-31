package com.example.insale.model
import javax.persistence.*

@Entity
@Table(name="cliente")

class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?=null
    var nombre: String?=null
    var usuario: String?=null
    var clave: String?=null
    var correo: String?=null
    var telefono: String?=null
}
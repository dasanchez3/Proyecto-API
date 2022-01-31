package com.example.insale.model
import javax.persistence.*

@Entity
@Table(name="inmueble")

class Inmueble {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?=null
    var provincia: String?=null
    var precio: Float?=null
    var ciudad: String?=null
    var descripcion: String?=null
    var sector: String?=null
    @Column (name="empresa_idempresa")
    var empresaIdempresa: Long?=null

}
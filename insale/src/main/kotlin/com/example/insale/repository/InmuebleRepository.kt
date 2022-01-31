package com.example.insale.repository
import com.example.insale.model.Inmueble
import org.springframework.data.jpa.repository.JpaRepository

interface InmuebleRepository:JpaRepository<Inmueble, Long>{
    fun findById(id:Long?):Inmueble?
}
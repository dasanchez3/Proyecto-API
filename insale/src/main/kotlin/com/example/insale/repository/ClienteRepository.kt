package com.example.insale.repository
import com.example.insale.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository:JpaRepository<Cliente, Long>{
    fun findById(id:Long?):Cliente?
}
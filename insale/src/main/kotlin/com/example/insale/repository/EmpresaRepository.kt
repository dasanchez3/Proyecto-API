package com.example.insale.repository
import com.example.insale.model.Empresa
import org.springframework.data.jpa.repository.JpaRepository

interface EmpresaRepository:JpaRepository<Empresa, Long>{
    fun findById(id:Long?):Empresa?
}
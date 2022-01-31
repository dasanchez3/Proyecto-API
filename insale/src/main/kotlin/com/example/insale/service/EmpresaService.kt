package com.example.insale.service

import com.example.insale.model.Empresa
import com.example.insale.repository.EmpresaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmpresaService {
    @Autowired
    lateinit var empresaRepository: EmpresaRepository

    fun list(): List<Empresa>{
        return empresaRepository.findAll()
    }

    fun save(empresa: Empresa):Empresa{
        return empresaRepository.save(empresa)
    }

    fun update(empresa: Empresa):Empresa{
        return empresaRepository.save(empresa)
    }

    fun updateTelefono (empresa: Empresa):Empresa{
        val response =empresaRepository.findById(empresa.id)
                ?: throw Exception()//IMPORTANTE
        response.apply {
            this.telefono=empresa.telefono
        }
        return empresaRepository.save(empresa)
    }

    fun delete(id:Long):Boolean{
        empresaRepository.deleteById(id)
        return true
    }
}
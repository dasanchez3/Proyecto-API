package com.example.insale.service

import com.example.insale.model.Cliente
import com.example.insale.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClienteService {
    @Autowired
    lateinit var clienteRepository: ClienteRepository

    fun list(): List<Cliente>{
        return clienteRepository.findAll()
    }

    fun save(cliente: Cliente):Cliente{
        return clienteRepository.save(cliente)
    }

    fun update(cliente: Cliente):Cliente{
        return clienteRepository.save(cliente)
    }

    fun updateTelefono (cliente: Cliente):Cliente{
        val response =clienteRepository.findById(cliente.id)
                ?: throw Exception()//IMPORTANTE
        response.apply {
            this.telefono=cliente.telefono
        }
        return clienteRepository.save(cliente)
    }

    fun delete(id:Long):Boolean{
        clienteRepository.deleteById(id)
        return true
    }
}
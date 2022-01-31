package com.example.insale.service

import com.example.insale.model.Inmueble
import com.example.insale.repository.InmuebleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InmuebleService {
    @Autowired
    lateinit var inmuebleRepository: InmuebleRepository

    fun list(): List<Inmueble>{
        return inmuebleRepository.findAll()
    }

    fun save(inmueble: Inmueble):Inmueble{
        //Validacion precio mayor a 0
        if(inmueble.precio?.compareTo(0.0)==0){
            throw Exception()
        }else{
            return inmuebleRepository.save(inmueble)
        }
    }

    fun update(inmueble: Inmueble):Inmueble{
        val response =inmuebleRepository.findById(inmueble.id)
        if (response==null){
            throw Exception()
        }else{
            return inmuebleRepository.save(inmueble)
        }
    }

    fun updatePrecio (inmueble: Inmueble):Inmueble{
        val response =inmuebleRepository.findById(inmueble.id)
                ?: throw Exception()//IMPORTANTE
        response.apply {
            this.precio=inmueble.precio
        }
        return inmuebleRepository.save(inmueble)
    }

    fun delete(id:Long):Boolean{
        inmuebleRepository.deleteById(id)
        return true
    }


}
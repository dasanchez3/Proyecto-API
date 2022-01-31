package com.example.insale.service
import com.example.insale.model.Inmueble
import com.example.insale.repository.InmuebleRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

class InmuebleServiceEva {
    @InjectMocks
    lateinit var inmuebleService: InmuebleService

    @Mock
    lateinit var inmuebleRepository: InmuebleRepository

    val returnObject: Inmueble = Inmueble().apply {
        id=1
        precio= 10000f
        descripcion= "casa"
    }
    val newObject: Inmueble = Inmueble().apply {
        id=1
        precio= 10000f
        descripcion= "casa"
    }

    @Test
    fun updateIfExists(){
        Mockito. `when`(inmuebleRepository.findById(newObject.id)).thenReturn(returnObject)
        Mockito. `when`(inmuebleRepository.save(Mockito.any(Inmueble::class.java))).thenReturn(returnObject)
        val response = inmuebleRepository.update(newObject)
        Assertions.assertEquals(response.id, newObject.id)
        Assertions.assertEquals(response.descripcion, newObject.precio)
    }

    @Test
    fun UpdateInmuebleIfPassedList(){
        val lista= listOf<String>("casa", "departamento")
        Mockito. `when`(inmuebleRepository.findById(newObject.id)).thenReturn(returnObject)
        Mockito. `when`(inmuebleRepository.save(Mockito.any(Inmueble::class.java))).thenReturn(returnObject)
        val response = inmuebleRepository.update(newObject)
        Assertions.assertEquals(response.id, newObject.id)
        Assertions.assertEquals(response.descripcion, newObject.precio)
    }

    @Test
    fun UpdateIfNotExists(){
        newObject.apply {
            id= 2
        }
        Mockito. `when`(inmuebleRepository.findById(newObject.id)).thenReturn(returnObject)
        Mockito. `when`(inmuebleRepository.save(Mockito.any(Inmueble::class.java))).thenReturn(returnObject)
        val response = inmuebleRepository.update(newObject)
        Assertions.assertEquals(response.id, newObject.id)
        Assertions.assertEquals(response.descripcion, newObject.precio)
    }

}
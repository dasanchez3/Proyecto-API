package com.example.insale.controllers
import com.example.insale.model.Inmueble
import com.example.insale.service.InmuebleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/inmuebles")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class InmuebleController {
    @Autowired
    lateinit var inmuebleService: InmuebleService

    @GetMapping
    fun list(): List<Inmueble>{
        return inmuebleService.list()
    }

    @PostMapping
    fun save(@RequestBody inmueble: Inmueble):Inmueble{
        return inmuebleService.save(inmueble)
    }

    @PutMapping
    fun update(@RequestBody inmueble: Inmueble):Inmueble{
        return inmuebleService.save(inmueble)
    }

    @PatchMapping
    fun updatePrecio(@RequestBody inmueble: Inmueble):Inmueble{
        return inmuebleService.updatePrecio(inmueble)
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return inmuebleService.delete(id)
    }

}
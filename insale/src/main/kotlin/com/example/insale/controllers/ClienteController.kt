package com.example.insale.controllers
import com.example.insale.model.Cliente
import com.example.insale.service.ClienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clientes")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClienteController {
    @Autowired
    lateinit var clienteService: ClienteService

    @GetMapping
    fun list(): List<Cliente>{
        return clienteService.list()
    }

    @PostMapping
    fun save(@RequestBody cliente: Cliente):Cliente{
        return clienteService.save(cliente)
    }

    @PutMapping
    fun update(@RequestBody cliente: Cliente):Cliente{
        return clienteService.save(cliente)
    }

    @PatchMapping
    fun updateTelefono(@RequestBody cliente: Cliente):Cliente{
        return clienteService.updateTelefono(cliente)
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return clienteService.delete(id)
    }

}
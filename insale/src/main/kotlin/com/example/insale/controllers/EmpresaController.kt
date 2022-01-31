package com.example.insale.controllers
import com.example.insale.model.Empresa
import com.example.insale.service.EmpresaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/empresas")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class EmpresaController {
    @Autowired
    lateinit var empresaService: EmpresaService

    @GetMapping
    fun list(): List<Empresa>{
        return empresaService.list()
    }

    @PostMapping
    fun save(@RequestBody empresa: Empresa):Empresa{
        return empresaService.save(empresa)
    }

    @PutMapping
    fun update(@RequestBody empresa: Empresa):Empresa{
        return empresaService.save(empresa)
    }

    @PatchMapping
    fun updateTelefono(@RequestBody empresa: Empresa):Empresa{
        return empresaService.updateTelefono(empresa)
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return empresaService.delete(id)
    }

}
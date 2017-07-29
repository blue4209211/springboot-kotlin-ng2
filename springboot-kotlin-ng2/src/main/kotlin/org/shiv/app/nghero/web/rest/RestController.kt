package org.shiv.app.nghero.web.rest

import org.shiv.app.nghero.repository.Hero
import org.shiv.app.nghero.repository.HeroRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HeroController(val heroRepo: HeroRepository) {

	enum class ResponseStatus {
		OK, ERROR
	}

	data class Response<T>(val data: T, val status: ResponseStatus = ResponseStatus.OK) {

	}

	@GetMapping("/api/heroes")
	fun getAll(@RequestParam(required = false, value = "name") name: String?): Response<Iterable<Hero>> {
		return Response(name?.let { heroRepo.findByNameIgnoreCaseContaining(name) } ?: heroRepo.findAll())
	}

	@GetMapping("/api/heroes/{id}")
	fun get(@PathVariable id: Long): Response<Hero> {
		return Response(heroRepo.findOne(id))
	}


	@PostMapping("/api/heroes")
	fun addHero(@RequestBody hero: Hero): Response<Hero> {
		return heroRepo.save(hero).let { Response(it) }
	}

	@PutMapping("/api/heroes/{id}")
	fun updateHero(@PathVariable id: Long, @RequestBody hero: Hero): Response<Hero> {
		return heroRepo.save(hero).let { Response(it) }
	}

	@DeleteMapping("/api/heroes/{id}")
	fun deleteHero(@PathVariable id: Long): Response<Long> {
		return heroRepo.delete(id).let { Response(id) }
	}


}
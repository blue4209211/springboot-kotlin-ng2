package org.shiv.app.nghero

import org.shiv.app.nghero.repository.Hero
import org.shiv.app.nghero.repository.HeroRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.boot.web.support.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.ComponentScan
import javax.servlet.ServletContext

private val log = LoggerFactory.getLogger(Application::class.java)

@SpringBootApplication
@ComponentScan(value = "org.shiv.app")
open class Application : SpringBootServletInitializer() {


	@Bean
	open fun init(repository: HeroRepository) = CommandLineRunner {
		log.info("initializing db")

		repository.save(Hero(name = "Superman"))
		repository.save(Hero(name = "Batman"))
		repository.save(Hero(name = "Hulk"))
		repository.save(Hero(name = "Ironman"))
		repository.save(Hero(name = "Thor"))
		repository.save(Hero(name = "Shaktiman"))
		repository.save(Hero(name = "Vyom"))
	}

	override fun onStartup(servletContext : ServletContext){
		println("called app startup")
		super.onStartup(servletContext)
	}


	override protected fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		log.info("initializing app using servlet cotianer")
		return application.sources(Application::class.java);
	}
}

fun main(args: Array<String>) {
	log.info("starting app from main")
	SpringApplication.run(Application::class.java, *args)
}

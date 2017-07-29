package org.shiv.app.nghero.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.query.QueryByExampleExecutor
import org.springframework.data.querydsl.QueryDslPredicateExecutor


public interface HeroRepository : PagingAndSortingRepository<Hero, Long>, JpaSpecificationExecutor<Hero>, QueryByExampleExecutor<Hero>, QueryDslPredicateExecutor<Hero> {

	fun findByNameIgnoreCaseContaining(name: String): Iterable<Hero>
}
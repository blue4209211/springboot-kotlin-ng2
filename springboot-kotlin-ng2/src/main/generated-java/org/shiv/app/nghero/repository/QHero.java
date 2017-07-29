package org.shiv.app.nghero.repository;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QHero is a Querydsl query type for Hero
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHero extends EntityPathBase<Hero> {

    private static final long serialVersionUID = -1751567342L;

    public static final QHero hero = new QHero("hero");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QHero(String variable) {
        super(Hero.class, forVariable(variable));
    }

    public QHero(Path<Hero> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHero(PathMetadata metadata) {
        super(Hero.class, metadata);
    }

}


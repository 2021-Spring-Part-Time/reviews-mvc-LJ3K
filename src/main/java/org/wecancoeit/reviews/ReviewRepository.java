package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review lesPaul = new Review(1L, "Les Paul Standard", "Blues, Rock", "Blues, Rock", "Jimi Paige");
        Review teleCaster = new Review(2L, "Telecaster", "asas", "Blues, Rock, Country", "Keith Richards, Bruce Springsteen");
        Review jaguar = new Review(3L, "Jaguar", "asdd", "Rock, Jazz", "Kurt Vile, Niles CLine");
        Review jazzMaster = new Review(4L, "JazzMaster", "adasda", "jazz", "asdasd");
        Review flying = new Review(5L, "Flying V", "ssdfsd", "blues, rock,metal", "Albert King");
        Review esThree = new Review(6L, "ES-350T", "sfsdfs", "blues", "Chuck Berry");
        Review stratoCaster = new Review(7L, "Stratocaster", "sdfsdf", "Rock", "Jimi Hendrix");

        reviewsList.put(lesPaul.getId(), lesPaul);
        reviewsList.put(teleCaster.getId(), teleCaster);
        reviewsList.put(jaguar.getId(), jaguar);
        reviewsList.put(jazzMaster.getId(), jazzMaster);
        reviewsList.put(flying.getId(), flying);
        reviewsList.put(esThree.getId(), esThree);
        reviewsList.put(stratoCaster.getId(), stratoCaster);
    }


    public ReviewRepository(Review...reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }

    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();


    }
}

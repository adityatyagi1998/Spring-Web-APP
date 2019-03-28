package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Pillar1b;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Pillar1bRepo extends JpaRepository<Pillar1b,String> {
    @Query(value = "SELECT SCORE FROM projectpillar1b WHERE PROJECTFIELDS =?1", nativeQuery = true)
    public int findOneByPillar1b(String pillar);

}

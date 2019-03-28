package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Pillar1d;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Pillar1dRepo extends JpaRepository<Pillar1d,String> {
    @Query(value = "SELECT SCORE FROM projectpillar1d WHERE PROJECTFIELDS =?1", nativeQuery = true)
    public int findOneByPillar1d(String pillar);

}

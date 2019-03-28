package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Pillar1a;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Pillar1aRepo extends JpaRepository<Pillar1a,String> {
    @Query(value = "SELECT SCORE FROM projectpillar1a WHERE PROJECTFIELDS =?1", nativeQuery = true)
    public int findOneByPillar1a(String pillar);

}

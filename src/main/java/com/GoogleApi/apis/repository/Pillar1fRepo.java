package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Pillar1f;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Pillar1fRepo extends JpaRepository<Pillar1f,String> {
    @Query(value = "SELECT SCORE FROM projectpillar1f WHERE PROJECTFIELDS =?1", nativeQuery = true)
    public int findOneByPillar1f(String pillar);

}

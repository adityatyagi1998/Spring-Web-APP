package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Pillar3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Pillar3Repo extends JpaRepository<Pillar3,String> {
    @Query(value = "SELECT SCORE FROM projectpillar3 WHERE PROJECTFIELDS =?1", nativeQuery = true)
    public int findOneByPillar3(String pillar);

}

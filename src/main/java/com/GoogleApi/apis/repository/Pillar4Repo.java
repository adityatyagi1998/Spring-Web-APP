package com.GoogleApi.apis.repository;

import com.GoogleApi.apis.model.Pillar4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Pillar4Repo extends JpaRepository<Pillar4,String> {
    @Query(value = "SELECT SCORE FROM projectpillar4 WHERE PROJECTFIELDS =?1", nativeQuery = true)
    public int findOneByPillar4(String pillar);

}

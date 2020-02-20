package com.assignment.JJYJCensusApp.repository;

import com.assignment.JJYJCensusApp.beans.Geographicarea;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeographicareaRepository extends CrudRepository<Geographicarea, Integer> {

    @Query("select p from Geographicarea p where p.areaname like %:name%")
    public List<Geographicarea> searchByName(@Param("name") String name);
}

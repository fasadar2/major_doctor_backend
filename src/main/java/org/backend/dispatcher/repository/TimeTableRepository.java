package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.Timetable;
import org.backend.dispatcher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TimeTableRepository extends JpaRepository<Timetable, Integer>, JpaSpecificationExecutor<Timetable>, PagingAndSortingRepository<Timetable, Integer> {
}

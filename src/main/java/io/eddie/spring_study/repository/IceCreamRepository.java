package io.eddie.spring_study.repository;

import io.eddie.spring_study.entity.IceCream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IceCreamRepository extends JpaRepository<IceCream, Long> {

}

package com.nvocc.example.seata.consumer.repository;


import com.nvocc.example.seata.consumer.repository.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LogRepository extends JpaRepository<Log, Integer>, JpaSpecificationExecutor<Log> {

}
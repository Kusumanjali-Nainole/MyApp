package com.information.MyApp.Repository;


import com.information.MyApp.Entity.MyInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyInfoRepo extends JpaRepository<MyInfo, Long> {
}

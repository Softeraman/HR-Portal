package com.hrmanagement.backend.repository;

import com.hrmanagement.backend.entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<LeaveRequest, String> {
}
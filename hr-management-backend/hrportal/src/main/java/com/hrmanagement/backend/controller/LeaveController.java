package com.hrmanagement.backend.controller;

import com.hrmanagement.backend.entity.LeaveRequest;
import com.hrmanagement.backend.repository.LeaveRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping({"/leaves", "/api/leaves"})
public class LeaveController {

    private final LeaveRepository leaveRepository;

    public LeaveController(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    @GetMapping
    public List<LeaveRequest> getLeaves() {
        return leaveRepository.findAll();
    }

    @PostMapping
    public LeaveRequest applyLeave(@RequestBody LeaveRequest leave) {
        return leaveRepository.save(leave);
    }

    @PutMapping("/{id}")
    public LeaveRequest updateLeave(@PathVariable String id, @RequestBody LeaveRequest leave) {
        leave.setId(id);
        return leaveRepository.save(leave);
    }

    @DeleteMapping("/{id}")
    public void deleteLeave(@PathVariable String id) {
        leaveRepository.deleteById(id);
    }
}

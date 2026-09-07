package com.hrmanagement.backend.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hrmanagement.backend.entity.LeaveRequest;
import com.hrmanagement.backend.entity.User;
import com.hrmanagement.backend.repository.LeaveRepository;
import com.hrmanagement.backend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final LeaveRepository leaveRepository;
    private final ObjectMapper objectMapper;

    public DataLoader(
            UserRepository userRepository,
            LeaveRepository leaveRepository,
            ObjectMapper objectMapper
    ) {
        this.userRepository = userRepository;
        this.leaveRepository = leaveRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {

        InputStream inputStream = getClass().getResourceAsStream("/db.json");

        if (inputStream == null) {
            throw new RuntimeException("db.json not found in src/main/resources");
        }

        JsonNode root = objectMapper.readTree(inputStream);

        JsonNode users = root.get("users");
        JsonNode leaves = root.get("leaves");

        if (users != null) {
            for (JsonNode node : users) {
                String id = node.path("id").asText(null);

                if (id != null && userRepository.existsById(id)) {
                    continue;
                }

                User user = new User();

                user.setId(id);
                user.setName(node.path("name").asText(null));
                user.setEmail(node.path("email").asText(null));
                user.setPassword(node.path("password").asText(null));
                user.setRole(node.path("role").asText(null));
                user.setDepartment(node.path("department").asText(null));
                user.setDesignation(node.path("designation").asText(null));

                if (node.has("salary") && !node.get("salary").isNull()) {
                    user.setSalary(node.get("salary").asLong());
                }

                userRepository.save(user);
            }
        }

        if (leaves != null) {
            for (JsonNode node : leaves) {
                String id = node.path("id").asText(null);

                if (id != null && leaveRepository.existsById(id)) {
                    continue;
                }

                LeaveRequest leave = new LeaveRequest();

                leave.setId(id);
                leave.setEmployeeEmail(node.path("employeeEmail").asText(null));
                leave.setLeaveType(node.path("leaveType").asText(null));
                leave.setFromDate(LocalDate.parse(node.path("fromDate").asText()));
                leave.setToDate(LocalDate.parse(node.path("toDate").asText()));
                leave.setReason(node.path("reason").asText(null));
                leave.setStatus(node.path("status").asText(null));

                leaveRepository.save(leave);
            }
        }
    }
}

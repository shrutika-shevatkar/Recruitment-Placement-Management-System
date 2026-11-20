
package com.rpms;

import com.rpms.model.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testStudentName() {
        Student student = new Student(
                1, "Rahul", "rahul@gmail.com",
                "Computer Science", 8.5, 0
        );

        assertEquals("Rahul", student.getName());
    }

    @Test
    void testStudentEmail() {
        Student student = new Student(
                1, "Rahul", "rahul@gmail.com",
                "Computer Science", 8.5, 0
        );

        assertEquals("rahul@gmail.com", student.getEmail());
    }
}


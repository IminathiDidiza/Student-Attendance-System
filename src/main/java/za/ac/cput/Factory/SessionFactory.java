package za.ac.cput.Factory;

import za.ac.cput.Domain.Session;

import java.time.LocalDate;
import java.time.LocalTime;

public class SessionFactory {

    // Static factory method
    public static Session createSession(String sessionId, LocalDate date, LocalTime startTime,
                                        LocalTime endTime, String location, String sessionType) {

        // Optional: Add validation or logging here
        System.out.println("Creating new Session: " + sessionId);

        return new Session(sessionId, date, startTime, endTime, location, sessionType);
    }
}


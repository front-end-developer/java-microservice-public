package com.markwebley;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) { }

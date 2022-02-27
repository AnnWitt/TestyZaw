package com.sda.testing.solution.mockito.user;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock(lenient = true)
    private UserRepository userRepository;

    @Mock
    private UserValidator userValidator;

    @InjectMocks
    private UserService userService;


    @Test
    void shouldReturnProperUser() {
        User savedUser = new User(4L, "Tomek", "Woźniak");

        when(userRepository.findById(savedUser.getId())).thenReturn(Optional.of(savedUser));

        User user = userService.getUserById(4L);

	/*	assertNotNull(user);
		assertEquals("Tomek", user.getFirstName());
		assertEquals("Woźniak", user.getLastName());
	*/
        assertEquals(savedUser, user);
    }

    @Test
    void shouldThrowExceptionWhenUserNotExists() {
        Long notExistingID=33L;
        when(userRepository.findById(notExistingID)).thenReturn(Optional.empty());
        assertThrows(Exception.class, ()->userService.getUserById(notExistingID));

    }
}
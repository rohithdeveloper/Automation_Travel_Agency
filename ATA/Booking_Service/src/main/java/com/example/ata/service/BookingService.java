package com.example.ata.service;

import com.example.ata.dto.BookingDto;

public interface BookingService {

	BookingDto saveBooking(BookingDto bookingDto);

	String cancelBooking(int bookingId);

	String viewBookingStatus(int bookingId);

	BookingDto viewBooking(int bookingId);
}

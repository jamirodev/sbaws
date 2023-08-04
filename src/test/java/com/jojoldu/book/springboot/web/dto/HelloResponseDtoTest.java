package com.jojoldu.book.springboot.web.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloResponseDtoTest {

	@Test
	@DisplayName("롬복 기능 테스트")
	void testLombok() {
		String name = "test";
		int amount = 1000;
		
		HelloResponseDto dto = new HelloResponseDto(name, amount);
		
		assertThat(dto.getName()).isEqualTo(name);
		assertThat(dto.getAmount()).isEqualTo(amount);
	}

}

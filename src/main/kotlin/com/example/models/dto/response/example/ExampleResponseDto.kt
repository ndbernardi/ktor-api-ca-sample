package com.example.models.dto.response.example

import com.example.models.dto.response.ResponseDto

/**
 * Example response dto
 */
class ExampleResponseDto(
    message: String,
    statusCode: Int,
    error: Throwable) :ResponseDto {
}
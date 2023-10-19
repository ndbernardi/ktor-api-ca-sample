package com.example.usecases.example_usecase

import com.example.models.dto.request.example.ExampleRequestDto
import com.example.models.dto.response.example.ExampleResponseDto
import com.example.usecases.UseCase

class ExampleDefaultUseCase : UseCase<ExampleResponseDto, ExampleRequestDto> {

    override fun <T> execute(request: ExampleRequestDto) {
        TODO("Not yet implemented")

        return ExampleResponseDto("", 200, null)
    }

}
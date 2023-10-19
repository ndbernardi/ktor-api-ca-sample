package com.example.usecases

import com.example.models.dto.request.RequestDto
import com.example.models.dto.response.ResponseDto

/**
 * Use case interface
 */
interface UseCase <T, E> where T: ResponseDto, E: RequestDto {

    /**
     * Use case main execution method
     */
    fun <T> execute(request: E)
}
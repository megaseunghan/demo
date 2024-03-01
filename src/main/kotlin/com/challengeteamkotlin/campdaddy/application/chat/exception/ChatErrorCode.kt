package com.challengeteamkotlin.campdaddy.application.chat.exception

import com.challengeteamkotlin.campdaddy.common.exception.code.ErrorCode
import org.springframework.http.HttpStatus

enum class ChatErrorCode(
    override val id: Long,
    override val status: HttpStatus,
    override val errorMessage: String
) : ErrorCode {
    CHAT_SEND_FAILED(2000, HttpStatus.BAD_REQUEST, "메시지를 전송하는 데 실패하였습니다"),
    CHAT_NOT_FOUND(2001, HttpStatus.BAD_REQUEST, "채팅방을 찾을 수 없습니다")
}
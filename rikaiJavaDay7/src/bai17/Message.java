package bai17;

sealed interface Message
        permits TextMsg, ImageMsg, VideoMsg {
}

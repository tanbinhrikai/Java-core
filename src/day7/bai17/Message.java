package day7.bai17;

public sealed interface Message permits TextMsg, ImageMsg, VideoMsg {
}

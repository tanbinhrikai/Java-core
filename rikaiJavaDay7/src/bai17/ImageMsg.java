package bai17;

record ImageMsg(byte[] data, String caption)
        implements Message {}
package org.barber.stdfhandler.file;

import java.io.ByteArrayInputStream;

class TypeU1 extends Type<Integer> {

    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 255;
    static final String ILLEGAL_VALUE_MESSAGE = "Illegal argument size %d for type StdfU1. Should be %d <= size <= %d";

    private static final int BYTE_LENGTH = 1;
    private static final int NULL_VALUE = 0;

    TypeU1(String name) {
        super(name);
    }

    @Override
    void setValue(ByteArrayInputStream stream) {
        this.value = (int) byteStreamToNumber(stream, BYTE_LENGTH);
    }

    @Override
    void setValue(Integer value) {
        checkValue(value);
        this.value = value;
    }

    @Override
    byte[] toBytes() {
        int value = this.value == null ? NULL_VALUE : this.value;
        return toBytes(value, U1_BINARY_STRING_FORMAT);
    }

    private void checkValue(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new IllegalArgumentException(String.format(ILLEGAL_VALUE_MESSAGE, value, MIN_VALUE, MAX_VALUE));
        }
    }
}

package org.barber.stdfhandler.test;

import org.barber.stdfhandler.file.Record;
import org.barber.stdfhandler.file.RecordHbr;
import org.barber.stdfhandler.file.RecordPcr;
import org.barber.stdfhandler.file.TypeU4;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TypeU4Test extends TypeTest {

    @Test
    void testNullValueNull() throws IOException {
        int expected = 0;
        fileBuilder = fileBuilder.addRecord(RecordHbr.newInstance());
        assertThat(fileHandler.read(getInputStream()).getHbrs().get(0).getHbinCnt().orElseThrow()).isEqualTo(expected);
    }

    @Test
    void testDefaultNullValueSet() throws IOException {
        long expected = 0;
        fileBuilder = fileBuilder.addRecord(RecordHbr.newInstance().setHbinCnt(expected));
        assertThat(fileHandler.read(getInputStream()).getHbrs().get(0).getHbinCnt().orElseThrow()).isEqualTo(expected);
    }

    @Test
    void testNegativeValueThrows() {
        long expected = TypeU4.MIN_VALUE - 1;
        assertThatThrownBy(() -> fileBuilder.addRecord(RecordHbr.newInstance().setHbinCnt(expected)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(String.format(TypeU4.ILLEGAL_VALUE_MESSAGE, expected));
    }

    @Test
    void testTooLargeValueThrows() {
        long expected = TypeU4.MAX_VALUE + 1;
        assertThatThrownBy(() -> fileBuilder.addRecord(RecordHbr.newInstance().setHbinCnt(expected)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(String.format(TypeU4.ILLEGAL_VALUE_MESSAGE, expected));
    }

    @Test
    void testReturnsNullWhenNullValueNotNull() {
        fileBuilder = fileBuilder.addRecord(RecordPcr.newInstance());
        assertThatThrownBy(() -> fileHandler.read(getInputStream()).getPcrs().get(0).getRtstCnt().orElseThrow());
    }

    @Test
    void testReturnsNullWhenNullValueSet() {
        fileBuilder = fileBuilder.addRecord(RecordPcr.newInstance().setRtstCnt(Record.U4_MAX_NULL_VALUE));
        assertThatThrownBy(() -> fileHandler.read(getInputStream()).getPcrs().get(0).getRtstCnt().orElseThrow());
    }
}

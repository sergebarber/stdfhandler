package org.barber.stdfhandler.file;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class RecordFarTest extends RecordTest {

    @Test
    void testFarCpuTyp() throws IOException {
        testField(new FileBuilder(), fileImage -> fileImage.getFar().getCpuTyp(), FileBuilder.DEFAULT_CPU_TYP);

        int expected = 7;
        testField(new FileBuilder().addRecord(RecordFar.newInstance().setCpuTyp(expected)),
                fileImage -> fileImage.getFar().getCpuTyp(), expected);
    }

    @Test
    void testFarStdfVer() throws IOException {
        testField(new FileBuilder(), fileImage -> fileImage.getFar().getStdfVer(), FileBuilder.DEFAULT_STDF_VER);

        int expected = 3;
        testField(new FileBuilder().addRecord(RecordFar.newInstance().setStdfVer(expected)),
                fileImage -> fileImage.getFar().getStdfVer(), expected);
    }
}

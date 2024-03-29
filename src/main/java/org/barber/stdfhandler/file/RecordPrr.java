package org.barber.stdfhandler.file;

import java.util.Arrays;
import java.util.Optional;

public class RecordPrr extends Record {

    private static final String NAME = "PRR";
    private static final int TYPE = 5;
    private static final int SUBTYPE = 20;

    private final Type<Integer> headNum = new TypeU1("HEAD_NUM");
    private final Type<Integer> siteNum = new TypeU1("SITE_NUM");
    private final TypeB1 partFlg = new TypeB1("PART_FLG");
    private final Type<Integer> numTest = new TypeU2("NUM_TEST");
    private final Type<Integer> hardBin = new TypeU2("HARD_BIN");
    private final Type<Integer> softBin = new TypeU2("SOFT_BIN");
    private final Type<Integer> xCoord = new TypeI2("X_COORD", TypeI2.MIN_VALUE);
    private final Type<Integer> yCoord = new TypeI2("Y_COORD", TypeI2.MIN_VALUE);
    private final Type<Long> testT = new TypeU4("TEST_T", TypeU4.DEFAULT_VALUE);
    private final Type<String> partId = new TypeCn("PART_ID", TypeCn.DEFAULT_VALUE);
    private final Type<String> partTxt = new TypeCn("PART_TXT", TypeCn.DEFAULT_VALUE);
    private final Type<byte[]> partFix = new TypeBn("PART_FIX", TypeBn.getDefaultValue());

    private RecordPrr() {
        super(NAME, TYPE, SUBTYPE);
        addFields(headNum, siteNum, partFlg, numTest, hardBin, softBin, xCoord, yCoord, testT, partId, partTxt, partFix);
    }

    public static RecordPrr newInstance() {
        return new RecordPrr();
    }

    public Optional<Integer> getHeadNum() {
        return Optional.ofNullable(headNum.getValue());
    }

    public Optional<Integer> getSiteNum() {
        return Optional.ofNullable(siteNum.getValue());
    }

    public boolean getPartFlgBit(int position) {
        return partFlg.getBitInPosition(position);
    }

    public Optional<Integer> getNumTest() {
        return Optional.ofNullable(numTest.getValue());
    }

    public Optional<Integer> getHardBin() {
        return Optional.ofNullable(hardBin.getValue());
    }

    public Optional<Integer> getSoftBin() {
        return Optional.ofNullable(softBin.getValue());
    }

    public Optional<Integer> getXCoord() {
        return Optional.ofNullable(xCoord.getValue());
    }

    public Optional<Integer> getYCoord() {
        return Optional.ofNullable(yCoord.getValue());
    }

    public Optional<Long> getTestT() {
        return Optional.ofNullable(testT.getValue());
    }

    public Optional<String> getPartId() {
        return Optional.ofNullable(partId.getValue());
    }

    public Optional<String> getPartTxt() {
        return Optional.ofNullable(partTxt.getValue());
    }

    public Optional<byte[]> getPartFix() {
        return Optional.ofNullable(partFix.getValue());
    }


    public RecordPrr setHeadNum(int value) {
        headNum.setValueFromUser(value);
        return this;
    }

    public RecordPrr setSiteNum(int value) {
        siteNum.setValueFromUser(value);
        return this;
    }

    public RecordPrr setPartFlgBit(boolean value, int position) {
        partFlg.setBitInPosition(value, position);
        return this;
    }

    public RecordPrr setNumTest(int value) {
        numTest.setValueFromUser(value);
        return this;
    }

    public RecordPrr setHardBin(int value) {
        hardBin.setValueFromUser(value);
        return this;
    }

    public RecordPrr setSoftBin(int value) {
        softBin.setValueFromUser(value);
        return this;
    }

    public RecordPrr setXCoord(int value) {
        xCoord.setValueFromUser(value);
        return this;
    }

    public RecordPrr setYCoord(int value) {
        yCoord.setValueFromUser(value);
        return this;
    }

    public RecordPrr setTestT(long value) {
        testT.setValueFromUser(value);
        return this;
    }

    public RecordPrr setPartId(String value) {
        partId.setValueFromUser(value);
        return this;
    }

    public RecordPrr setPartTxt(String value) {
        partTxt.setValueFromUser(value);
        return this;
    }

    public RecordPrr setPartFix(byte[] value) {
        partFix.setValueFromUser(value);
        return this;
    }
}

package org.barber.stdfhandler.file;

import java.time.Instant;
import java.util.Optional;

public class RecordMir extends Record {

    private static final String NAME = "MIR";
    private static final byte TYPE = 1;
    private static final byte SUBTYPE = 10;

    private final Type<Instant> setupT = new TypeTime("SETUP_T", null);
    private final Type<Instant> startT = new TypeTime("START_T", null);
    private final Type<Integer> statNum = new TypeU1("STAT_NUM", null);
    private final Type<Character> modeCod = new TypeC1("MODE_COD", ' ');
    private final Type<Character> rtstCod = new TypeC1("RTST_COD", ' ');
    private final Type<Character> protCod = new TypeC1("PROT_COD", ' ');
    private final Type<Integer> burnTim = new TypeU2("BURN_TIM", U2_MAX_NULL_VALUE);
    private final Type<Character> cmodCod = new TypeC1("CMOD_COD", ' ');
    private final Type<String> lotId = new TypeCn("LOT_ID", null);
    private final Type<String> partTyp = new TypeCn("PART_TYP", null);
    private final Type<String> nodeNam = new TypeCn("NODE_NAM", null);
    private final Type<String> tstrTyp = new TypeCn("TSTR_TYP", null);
    private final Type<String> jobNam = new TypeCn("JOB_NAM", null);
    private final Type<String> jobRev = new TypeCn("JOB_REV", "");
    private final Type<String> sblotId = new TypeCn("SBLOT_ID", "");
    private final Type<String> operNam = new TypeCn("OPER_NAM", "");
    private final Type<String> execTyp = new TypeCn("EXEC_TYP", "");
    private final Type<String> execVer = new TypeCn("EXEC_VER", "");
    private final Type<String> testCod = new TypeCn("TEST_COD", "");
    private final Type<String> tstTemp = new TypeCn("TST_TEMP", "");
    private final Type<String> userTxt = new TypeCn("USER_TXT", "");
    private final Type<String> auxFile = new TypeCn("AUX_FILE", "");
    private final Type<String> pkgTyp = new TypeCn("PKG_TYP", "");
    private final Type<String> famlyId = new TypeCn("FAMLY_ID", "");
    private final Type<String> dateCod = new TypeCn("DATE_COD", "");
    private final Type<String> facilId = new TypeCn("FACIL_ID", "");
    private final Type<String> floorId = new TypeCn("FLOOR_ID", "");
    private final Type<String> procId = new TypeCn("PROC_ID", "");
    private final Type<String> operFrq = new TypeCn("OPER_FRQ", "");
    private final Type<String> specNam = new TypeCn("SPEC_NAM", "");
    private final Type<String> specVer = new TypeCn("SPEC_VER", "");
    private final Type<String> flowId = new TypeCn("FLOW_ID", "");
    private final Type<String> setupId = new TypeCn("SETUP_ID", "");
    private final Type<String> dsgnRev = new TypeCn("DSGN_REV", "");
    private final Type<String> engId = new TypeCn("ENG_ID", "");
    private final Type<String> romCod = new TypeCn("ROM_COD", "");
    private final Type<String> serlNum = new TypeCn("SERL_NUM", "");
    private final Type<String> suprNam = new TypeCn("SUPR_NAM", "");

    private RecordMir() {
        super(NAME, TYPE, SUBTYPE);
        fields.addAll(asList(setupT, startT, statNum, modeCod, rtstCod, protCod, burnTim, cmodCod, lotId, partTyp,
                nodeNam, tstrTyp, jobNam, jobRev, sblotId, operNam, execTyp, execVer, testCod, tstTemp, userTxt,
                auxFile, pkgTyp, famlyId, dateCod, facilId, floorId, procId, operFrq, specNam, specVer, flowId,
                setupId, dsgnRev, engId, romCod, serlNum, suprNam));
    }

    public static RecordMir newInstance() {
        return new RecordMir();
    }

    @Override
    protected void addToImage(FileImage image) {
        image.setMir(this);
    }

    public Optional<Instant> getSetupT() {
        return Optional.ofNullable(setupT.getValue());
    }

    public Optional<Instant> getStartT() {
        return Optional.ofNullable(startT.getValue());
    }

    public Optional<Integer> getStatNum() {
        return Optional.ofNullable(statNum.getValue());
    }

    public Optional<Character> getModeCod() {
        return Optional.ofNullable(modeCod.getValue());
    }

    public Optional<Character> getRtstCod() {
        return Optional.ofNullable(rtstCod.getValue());
    }

    public Optional<Character> getProtCod() {
        return Optional.ofNullable(protCod.getValue());
    }

    public Optional<Integer> getBurnTim() {
        return Optional.ofNullable(burnTim.getValue());
    }

    public Optional<Character> getCmodCod() {
        return Optional.ofNullable(cmodCod.getValue());
    }

    public Optional<String> getLotId() {
        return Optional.ofNullable(lotId.getValue());
    }

    public Optional<String> getPartTyp() {
        return Optional.ofNullable(partTyp.getValue());
    }

    public Optional<String> getNodeNam() {
        return Optional.ofNullable(nodeNam.getValue());
    }

    public Optional<String> getTstrTyp() {
        return Optional.ofNullable(tstrTyp.getValue());
    }

    public Optional<String> getJobNam() {
        return Optional.ofNullable(jobNam.getValue());
    }

    public Optional<String> getJobRev() {
        return Optional.ofNullable(jobRev.getValue());
    }

    public Optional<String> getSblotId() {
        return Optional.ofNullable(sblotId.getValue());
    }

    public Optional<String> getOperNam() {
        return Optional.ofNullable(operNam.getValue());
    }

    public Optional<String> getExecTyp() {
        return Optional.ofNullable(execTyp.getValue());
    }

    public Optional<String> getExecVer() {
        return Optional.ofNullable(execVer.getValue());
    }

    public Optional<String> getTestCod() {
        return Optional.ofNullable(testCod.getValue());
    }

    public Optional<String> getTstTemp() {
        return Optional.ofNullable(tstTemp.getValue());
    }

    public Optional<String> getUserTxt() {
        return Optional.ofNullable(userTxt.getValue());
    }

    public Optional<String> getAuxFile() {
        return Optional.ofNullable(auxFile.getValue());
    }

    public Optional<String> getPkgTyp() {
        return Optional.ofNullable(pkgTyp.getValue());
    }

    public Optional<String> getFamlyId() {
        return Optional.ofNullable(famlyId.getValue());
    }

    public Optional<String> getDateCod() {
        return Optional.ofNullable(dateCod.getValue());
    }

    public Optional<String> getFacilId() {
        return Optional.ofNullable(facilId.getValue());
    }

    public Optional<String> getFloorId() {
        return Optional.ofNullable(floorId.getValue());
    }

    public Optional<String> getProcId() {
        return Optional.ofNullable(procId.getValue());
    }

    public Optional<String> getOperFrq() {
        return Optional.ofNullable(operFrq.getValue());
    }

    public Optional<String> getSpecNam() {
        return Optional.ofNullable(specNam.getValue());
    }

    public Optional<String> getSpecVer() {
        return Optional.ofNullable(specVer.getValue());
    }

    public Optional<String> getFlowId() {
        return Optional.ofNullable(flowId.getValue());
    }

    public Optional<String> getSetupId() {
        return Optional.ofNullable(setupId.getValue());
    }

    public Optional<String> getDsgnRev() {
        return Optional.ofNullable(dsgnRev.getValue());
    }

    public Optional<String> getEngId() {
        return Optional.ofNullable(engId.getValue());
    }

    public Optional<String> getRomCod() {
        return Optional.ofNullable(romCod.getValue());
    }

    public Optional<String> getSerlNum() {
        return Optional.ofNullable(serlNum.getValue());
    }

    public Optional<String> getSuprNam() {
        return Optional.ofNullable(suprNam.getValue());
    }

    public RecordMir setSetupT(Instant value) {
        setupT.setValueFromUser(value);
        return this;
    }

    public RecordMir setStartT(Instant value) {
        startT.setValueFromUser(value);
        return this;
    }

    public RecordMir setStatNum(Integer value) {
        statNum.setValueFromUser(value);
        return this;
    }

    public RecordMir setModeCod(char value) {
        modeCod.setValueFromUser(value);
        return this;
    }

    public RecordMir setRtstCod(char value) {
        rtstCod.setValueFromUser(value);
        return this;
    }

    public RecordMir setProtCod(char value) {
        protCod.setValueFromUser(value);
        return this;
    }

    public RecordMir setBurnTim(Integer value) {
        burnTim.setValueFromUser(value);
        return this;
    }

    public RecordMir setCmodCod(char value) {
        cmodCod.setValueFromUser(value);
        return this;
    }

    public RecordMir setLotId(String value) {
        lotId.setValueFromUser(value);
        return this;
    }

    public RecordMir setPartTyp(String value) {
        partTyp.setValueFromUser(value);
        return this;
    }

    public RecordMir setNodeNam(String value) {
        nodeNam.setValueFromUser(value);
        return this;
    }

    public RecordMir setTstrTyp(String value) {
        tstrTyp.setValueFromUser(value);
        return this;
    }

    public RecordMir setJobNam(String value) {
        jobNam.setValueFromUser(value);
        return this;
    }

    public RecordMir setJobRev(String value) {
        jobRev.setValueFromUser(value);
        return this;
    }

    public RecordMir setSblotId(String value) {
        sblotId.setValueFromUser(value);
        return this;
    }

    public RecordMir setOperNam(String value) {
        operNam.setValueFromUser(value);
        return this;
    }

    public RecordMir setExecTyp(String value) {
        execTyp.setValueFromUser(value);
        return this;
    }

    public RecordMir setExecVer(String value) {
        execVer.setValueFromUser(value);
        return this;
    }

    public RecordMir setTestCod(String value) {
        testCod.setValueFromUser(value);
        return this;
    }

    public RecordMir setTstTemp(String value) {
        tstTemp.setValueFromUser(value);
        return this;
    }

    public RecordMir setUserTxt(String value) {
        userTxt.setValueFromUser(value);
        return this;
    }

    public RecordMir setAuxFile(String value) {
        auxFile.setValueFromUser(value);
        return this;
    }

    public RecordMir setPkgTyp(String value) {
        pkgTyp.setValueFromUser(value);
        return this;
    }

    public RecordMir setFamlyId(String value) {
        famlyId.setValueFromUser(value);
        return this;
    }

    public RecordMir setDateCod(String value) {
        dateCod.setValueFromUser(value);
        return this;
    }

    public RecordMir setFacilId(String value) {
        facilId.setValueFromUser(value);
        return this;
    }

    public RecordMir setFloorId(String value) {
        floorId.setValueFromUser(value);
        return this;
    }

    public RecordMir setProcId(String value) {
        procId.setValueFromUser(value);
        return this;
    }

    public RecordMir setOperFrq(String value) {
        operFrq.setValueFromUser(value);
        return this;
    }

    public RecordMir setSpecNam(String value) {
        specNam.setValueFromUser(value);
        return this;
    }

    public RecordMir setSpecVer(String value) {
        specVer.setValueFromUser(value);
        return this;
    }

    public RecordMir setFlowId(String value) {
        flowId.setValueFromUser(value);
        return this;
    }

    public RecordMir setSetupId(String value) {
        setupId.setValueFromUser(value);
        return this;
    }

    public RecordMir setDsgnRev(String value) {
        dsgnRev.setValueFromUser(value);
        return this;
    }

    public RecordMir setEngId(String value) {
        engId.setValueFromUser(value);
        return this;
    }

    public RecordMir setRomCod(String value) {
        romCod.setValueFromUser(value);
        return this;
    }

    public RecordMir setSerlNum(String value) {
        serlNum.setValueFromUser(value);
        return this;
    }

    public RecordMir setSuprNam(String value) {
        suprNam.setValueFromUser(value);
        return this;
    }
}

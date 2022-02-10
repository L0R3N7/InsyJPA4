package at.htl.workload.parts;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"CPU\"")
public class CPU extends Part{
    Long coreCount;
    Long threadCount;
    Double baseClock;
    Double boostClock;
    String cpuSocket;
    Boolean includedCooler;

    public CPU() {
    }

    public Long getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(Long coreCount) {
        this.coreCount = coreCount;
    }

    public Long getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(Long threadCount) {
        this.threadCount = threadCount;
    }

    public Double getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(Double baseClock) {
        this.baseClock = baseClock;
    }

    public Double getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(Double boostClock) {
        this.boostClock = boostClock;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public Boolean getIncludedCooler() {
        return includedCooler;
    }

    public void setIncludedCooler(Boolean includedCooler) {
        this.includedCooler = includedCooler;
    }
}

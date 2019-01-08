package com.greenfox.frontend.models;

import java.util.List;

public class LogQuery {

    private List<Log> logs;
    private Integer logCounter;

    public LogQuery() {
    }

    public List<Log> getLogs() {
        return logs;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }

    public Integer getLogCounter() {
        return logCounter;
    }

    public void setLogCounter(Integer logCounter) {
        this.logCounter = logCounter;
    }
}

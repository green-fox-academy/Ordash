package com.greenfox.frontend.services;

import com.greenfox.frontend.models.Log;
import com.greenfox.frontend.models.LogQuery;
import com.greenfox.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void save(Log log){
        logRepository.save(log);
    }

    public LogQuery getLog(){
        LogQuery logQuery = new LogQuery();
        logQuery.setLogs(logRepository.findAll());
        logQuery.setLogCounter(logRepository.findAll().size());
        return logQuery;
    }
}

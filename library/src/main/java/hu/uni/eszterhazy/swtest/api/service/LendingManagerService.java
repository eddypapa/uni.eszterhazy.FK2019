package hu.uni.eszterhazy.swtest.api.service;

import hu.uni.eszterhazy.swtest.api.model.Lending;

import java.util.Collection;

public interface LendingManagerService {

    Collection<Lending> listLendings();
    Collection<Lending> listActiveLendings();
    Collection<Lending> listLengingsOfReader();
}

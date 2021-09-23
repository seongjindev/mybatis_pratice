package testgroup.sj.service;

import org.springframework.stereotype.Service;
import testgroup.sj.mapper.IdNameMapper;
import testgroup.sj.mapper.IdNameModel;

import java.util.List;

@Service
public class IdNameService {

    private final IdNameMapper mapper;

    public IdNameService(IdNameMapper mapper) {
        this.mapper = mapper;
    }

    public List<IdNameModel> getIdName() {
        return mapper.getIdName();
    }
}

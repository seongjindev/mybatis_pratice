package testgroup.sj.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IdNameMapper {
    List<IdNameModel> getIdName();
}

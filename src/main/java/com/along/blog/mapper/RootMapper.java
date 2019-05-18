package com.along.blog.mapper;

import com.along.blog.entity.Root;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RootMapper {

    public void add(Root root) ;

    public void deleteById(Integer id) ;

    public void update(Root root) ;

    public Root getById(Integer id) ;

    public List<Root> getAll() ;

}

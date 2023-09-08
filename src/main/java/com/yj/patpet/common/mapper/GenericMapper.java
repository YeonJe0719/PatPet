package com.yj.patpet.common.mapper;

import org.springframework.data.domain.Page;

import java.util.List;

public interface GenericMapper<D, E> {

    D toDto(E e);

    E toEntity(D d);

    List<D> toDtoList(List<E> entityList);

    List<E> toEntityList(List<D> dtoList);
//    ListResponse<D> toDtoPage(Page<E> e);
}

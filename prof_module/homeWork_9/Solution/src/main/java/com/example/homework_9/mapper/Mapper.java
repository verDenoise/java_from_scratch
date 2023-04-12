package com.example.homework_9.mapper;

import com.example.homework_9.dto.GenericDto;
import com.example.homework_9.model.GenericModel;

import java.util.Collection;
import java.util.List;

public interface Mapper<E extends GenericModel, D extends GenericDto> {

    E toEntity(D dto);

    List<E> toEntities(List<D> dtos);
    D toDto(E entity);
    List<D> toDtos(List<E> entities);


}

package com.yj.patpet.common.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(alphabetic = true)
public class ListResponse<T> {
    private int totalPages;
    private long totalElements;
    @JsonProperty("pageNumber")
    private int number;
    private int size;
    private boolean first;
    private boolean last;
    @JsonProperty("contents")
    private List<T> content = new ArrayList<>();

    public int getNumber(){ return this.number + 1; }
}

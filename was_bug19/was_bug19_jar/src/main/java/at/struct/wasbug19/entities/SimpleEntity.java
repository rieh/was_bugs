/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package at.struct.wasbug19.entities;

import at.struct.wasbug19.MyEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SIMPLE_ENTITY")
public class SimpleEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "INTEGER", nullable = false)
    private Integer aInteger;

    @Column(name = "DOUBLE", nullable = false)
    private Double aDouble;

    @Column(name = "ENUM", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private MyEnum myEnum;


    protected SimpleEntity() {
    }


    public SimpleEntity(String name, Integer aInteger, Double aDouble, MyEnum myEnum) {
        this.name = name;
        this.aInteger = aInteger;
        this.aDouble = aDouble;
        this.myEnum = myEnum;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getaInteger() {
        return aInteger;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }
}

package com.wuyangliu.miniservice.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "restaurant", uniqueConstraints = @UniqueConstraint(columnNames = {"name", "city", "tel"}))
public class Restaurant implements Serializable {
  
  private static final long serialVersionUID = 1815539135960030095L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column
  private String name;
  
  @Column
  private String city;
  
  @Column
  private String tel;
  
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }
  
  public String getTel() {
    return tel;
  }
  
  public void setTel(String tel) {
    this.tel = tel;
  }
  
  
  @Override
  public String toString() {
    return "Restaurant{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   ", city='" + city + '\'' +
                   ", tel='" + tel + '\'' +
                   '}';
  }
}

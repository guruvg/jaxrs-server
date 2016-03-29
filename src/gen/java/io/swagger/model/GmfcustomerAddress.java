package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-28T11:26:27.512Z")
public class GmfcustomerAddress   {
  
  private Integer zip = null;
  private String address2 = null;
  private String city = null;
  private String address1 = null;
  private String state = null;

  
  /**
   **/
  public GmfcustomerAddress zip(Integer zip) {
    this.zip = zip;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("zip")
  public Integer getZip() {
    return zip;
  }
  public void setZip(Integer zip) {
    this.zip = zip;
  }

  
  /**
   **/
  public GmfcustomerAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }
  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  
  /**
   **/
  public GmfcustomerAddress city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  public GmfcustomerAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }
  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  
  /**
   **/
  public GmfcustomerAddress state(String state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmfcustomerAddress gmfcustomerAddress = (GmfcustomerAddress) o;
    return Objects.equals(zip, gmfcustomerAddress.zip) &&
        Objects.equals(address2, gmfcustomerAddress.address2) &&
        Objects.equals(city, gmfcustomerAddress.city) &&
        Objects.equals(address1, gmfcustomerAddress.address1) &&
        Objects.equals(state, gmfcustomerAddress.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zip, address2, city, address1, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmfcustomerAddress {\n");
    
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


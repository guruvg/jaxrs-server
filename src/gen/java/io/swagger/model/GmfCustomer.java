package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GmfcustomerAddress;
import io.swagger.model.GmfcustomerLoans;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-28T11:26:27.512Z")
public class GmfCustomer   {
  
  private String customerId = null;
  private String firstName = null;
  private String lastName = null;
  private Date dob = null;
  private GmfcustomerAddress address = null;
  private List<GmfcustomerLoans> loans = new ArrayList<GmfcustomerLoans>();

  
  /**
   * The Customer Id
   **/
  public GmfCustomer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Customer Id")
  @JsonProperty("customer-id")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  /**
   **/
  public GmfCustomer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("first-name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  public GmfCustomer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("last-name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * The customer date of birth
   **/
  public GmfCustomer dob(Date dob) {
    this.dob = dob;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The customer date of birth")
  @JsonProperty("dob")
  public Date getDob() {
    return dob;
  }
  public void setDob(Date dob) {
    this.dob = dob;
  }

  
  /**
   **/
  public GmfCustomer address(GmfcustomerAddress address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public GmfcustomerAddress getAddress() {
    return address;
  }
  public void setAddress(GmfcustomerAddress address) {
    this.address = address;
  }

  
  /**
   * The loans associated with this account
   **/
  public GmfCustomer loans(List<GmfcustomerLoans> loans) {
    this.loans = loans;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The loans associated with this account")
  @JsonProperty("loans")
  public List<GmfcustomerLoans> getLoans() {
    return loans;
  }
  public void setLoans(List<GmfcustomerLoans> loans) {
    this.loans = loans;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmfCustomer gmfCustomer = (GmfCustomer) o;
    return Objects.equals(customerId, gmfCustomer.customerId) &&
        Objects.equals(firstName, gmfCustomer.firstName) &&
        Objects.equals(lastName, gmfCustomer.lastName) &&
        Objects.equals(dob, gmfCustomer.dob) &&
        Objects.equals(address, gmfCustomer.address) &&
        Objects.equals(loans, gmfCustomer.loans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, firstName, lastName, dob, address, loans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmfCustomer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    loans: ").append(toIndentedString(loans)).append("\n");
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


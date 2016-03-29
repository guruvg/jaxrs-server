package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-28T11:26:27.512Z")
public class GmfcustomerLoans   {
  
  private String carMake = null;
  private String loanAcNum = null;
  private Float loanAmtDue = null;
  private String carImage = null;
  private Date loanDueDate = null;
  private String carModel = null;

  
  /**
   **/
  public GmfcustomerLoans carMake(String carMake) {
    this.carMake = carMake;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("car-make")
  public String getCarMake() {
    return carMake;
  }
  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }

  
  /**
   * Loan a/c number
   **/
  public GmfcustomerLoans loanAcNum(String loanAcNum) {
    this.loanAcNum = loanAcNum;
    return this;
  }

  
  @ApiModelProperty(value = "Loan a/c number")
  @JsonProperty("loan-ac-num")
  public String getLoanAcNum() {
    return loanAcNum;
  }
  public void setLoanAcNum(String loanAcNum) {
    this.loanAcNum = loanAcNum;
  }

  
  /**
   * Amount due as of today
   **/
  public GmfcustomerLoans loanAmtDue(Float loanAmtDue) {
    this.loanAmtDue = loanAmtDue;
    return this;
  }

  
  @ApiModelProperty(value = "Amount due as of today")
  @JsonProperty("loan-amt-due")
  public Float getLoanAmtDue() {
    return loanAmtDue;
  }
  public void setLoanAmtDue(Float loanAmtDue) {
    this.loanAmtDue = loanAmtDue;
  }

  
  /**
   * Link to the car image file
   **/
  public GmfcustomerLoans carImage(String carImage) {
    this.carImage = carImage;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the car image file")
  @JsonProperty("car-image")
  public String getCarImage() {
    return carImage;
  }
  public void setCarImage(String carImage) {
    this.carImage = carImage;
  }

  
  /**
   * Next due date for payment
   **/
  public GmfcustomerLoans loanDueDate(Date loanDueDate) {
    this.loanDueDate = loanDueDate;
    return this;
  }

  
  @ApiModelProperty(value = "Next due date for payment")
  @JsonProperty("loan-due-date")
  public Date getLoanDueDate() {
    return loanDueDate;
  }
  public void setLoanDueDate(Date loanDueDate) {
    this.loanDueDate = loanDueDate;
  }

  
  /**
   **/
  public GmfcustomerLoans carModel(String carModel) {
    this.carModel = carModel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("car-model")
  public String getCarModel() {
    return carModel;
  }
  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GmfcustomerLoans gmfcustomerLoans = (GmfcustomerLoans) o;
    return Objects.equals(carMake, gmfcustomerLoans.carMake) &&
        Objects.equals(loanAcNum, gmfcustomerLoans.loanAcNum) &&
        Objects.equals(loanAmtDue, gmfcustomerLoans.loanAmtDue) &&
        Objects.equals(carImage, gmfcustomerLoans.carImage) &&
        Objects.equals(loanDueDate, gmfcustomerLoans.loanDueDate) &&
        Objects.equals(carModel, gmfcustomerLoans.carModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carMake, loanAcNum, loanAmtDue, carImage, loanDueDate, carModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GmfcustomerLoans {\n");
    
    sb.append("    carMake: ").append(toIndentedString(carMake)).append("\n");
    sb.append("    loanAcNum: ").append(toIndentedString(loanAcNum)).append("\n");
    sb.append("    loanAmtDue: ").append(toIndentedString(loanAmtDue)).append("\n");
    sb.append("    carImage: ").append(toIndentedString(carImage)).append("\n");
    sb.append("    loanDueDate: ").append(toIndentedString(loanDueDate)).append("\n");
    sb.append("    carModel: ").append(toIndentedString(carModel)).append("\n");
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


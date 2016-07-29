package lk.trackme.server.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Device  {
  
  @SerializedName("speedLimit")
  private Double speedLimit = null;
  public enum IconTypeEnum {
     DEFAULT,  PHONE,  BICYCLE,  SEDAN,  UNIVERSAL,  MINIVAN,  TRUCK,  BUS,  LONG_TRUCK,  CAR_TRUCK,  PLANE,  SHIP,  TRAIN, 
  };
  @SerializedName("iconType")
  private IconTypeEnum iconType = null;
  @SerializedName("users")
  private List<User> users = null;
  @SerializedName("owner")
  private User owner = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("unique_id")
  private String uniqueId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("plate_number")
  private String plateNumber = null;
  @SerializedName("vehicle_info")
  private String vehicleInfo = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSpeedLimit() {
    return speedLimit;
  }
  public void setSpeedLimit(Double speedLimit) {
    this.speedLimit = speedLimit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public IconTypeEnum getIconType() {
    return iconType;
  }
  public void setIconType(IconTypeEnum iconType) {
    this.iconType = iconType;
  }

  /**
   * Users, who have access to this device
   **/
  @ApiModelProperty(value = "Users, who have access to this device")
  public List<User> getUsers() {
    return users;
  }
  public void setUsers(List<User> users) {
    this.users = users;
  }

  /**
   * User, who owns device
   **/
  @ApiModelProperty(value = "User, who owns device")
  public User getOwner() {
    return owner;
  }
  public void setOwner(User owner) {
    this.owner = owner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Device's unique identifier (for example IMEI)
   **/
  @ApiModelProperty(value = "Device's unique identifier (for example IMEI)")
  public String getUniqueId() {
    return uniqueId;
  }
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Number of installed SIM card
   **/
  @ApiModelProperty(value = "Number of installed SIM card")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Number of plate
   **/
  @ApiModelProperty(value = "Number of plate")
  public String getPlateNumber() {
    return plateNumber;
  }
  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVehicleInfo() {
    return vehicleInfo;
  }
  public void setVehicleInfo(String vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return (speedLimit == null ? device.speedLimit == null : speedLimit.equals(device.speedLimit)) &&
        (iconType == null ? device.iconType == null : iconType.equals(device.iconType)) &&
        (users == null ? device.users == null : users.equals(device.users)) &&
        (owner == null ? device.owner == null : owner.equals(device.owner)) &&
        (id == null ? device.id == null : id.equals(device.id)) &&
        (uniqueId == null ? device.uniqueId == null : uniqueId.equals(device.uniqueId)) &&
        (name == null ? device.name == null : name.equals(device.name)) &&
        (description == null ? device.description == null : description.equals(device.description)) &&
        (phoneNumber == null ? device.phoneNumber == null : phoneNumber.equals(device.phoneNumber)) &&
        (plateNumber == null ? device.plateNumber == null : plateNumber.equals(device.plateNumber)) &&
        (vehicleInfo == null ? device.vehicleInfo == null : vehicleInfo.equals(device.vehicleInfo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (speedLimit == null ? 0: speedLimit.hashCode());
    result = 31 * result + (iconType == null ? 0: iconType.hashCode());
    result = 31 * result + (users == null ? 0: users.hashCode());
    result = 31 * result + (owner == null ? 0: owner.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (uniqueId == null ? 0: uniqueId.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (description == null ? 0: description.hashCode());
    result = 31 * result + (phoneNumber == null ? 0: phoneNumber.hashCode());
    result = 31 * result + (plateNumber == null ? 0: plateNumber.hashCode());
    result = 31 * result + (vehicleInfo == null ? 0: vehicleInfo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("  speedLimit: ").append(speedLimit).append("\n");
    sb.append("  iconType: ").append(iconType).append("\n");
    sb.append("  users: ").append(users).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  uniqueId: ").append(uniqueId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  plateNumber: ").append(plateNumber).append("\n");
    sb.append("  vehicleInfo: ").append(vehicleInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package lk.trackme.server.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Position  {
  
  @SerializedName("device")
  private Device device = null;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("latitude")
  private Double latitude = null;
  @SerializedName("longitude")
  private Double longitude = null;
  @SerializedName("altitude")
  private Double altitude = null;
  @SerializedName("speed")
  private Double speed = null;
  @SerializedName("course")
  private Double course = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("id")
  private Long id = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Device getDevice() {
    return device;
  }
  public void setDevice(Device device) {
    this.device = device;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAltitude() {
    return altitude;
  }
  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSpeed() {
    return speed;
  }
  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCourse() {
    return course;
  }
  public void setCourse(Double course) {
    this.course = course;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return (device == null ? position.device == null : device.equals(position.device)) &&
        (time == null ? position.time == null : time.equals(position.time)) &&
        (latitude == null ? position.latitude == null : latitude.equals(position.latitude)) &&
        (longitude == null ? position.longitude == null : longitude.equals(position.longitude)) &&
        (altitude == null ? position.altitude == null : altitude.equals(position.altitude)) &&
        (speed == null ? position.speed == null : speed.equals(position.speed)) &&
        (course == null ? position.course == null : course.equals(position.course)) &&
        (address == null ? position.address == null : address.equals(position.address)) &&
        (id == null ? position.id == null : id.equals(position.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (device == null ? 0: device.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (latitude == null ? 0: latitude.hashCode());
    result = 31 * result + (longitude == null ? 0: longitude.hashCode());
    result = 31 * result + (altitude == null ? 0: altitude.hashCode());
    result = 31 * result + (speed == null ? 0: speed.hashCode());
    result = 31 * result + (course == null ? 0: course.hashCode());
    result = 31 * result + (address == null ? 0: address.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("  device: ").append(device).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  altitude: ").append(altitude).append("\n");
    sb.append("  speed: ").append(speed).append("\n");
    sb.append("  course: ").append(course).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

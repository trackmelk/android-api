package lk.trackme.server.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserSettings  {
  
  @SerializedName("maximizeOverviewMap")
  private Boolean maximizeOverviewMap = null;
  @SerializedName("id")
  private Long id = null;
  public enum SpeedUnitEnum {
     knots,  kilometersPerHour,  milesPerHour, 
  };
  @SerializedName("speed_unit")
  private SpeedUnitEnum speedUnit = null;
  @SerializedName("timezone_id")
  private String timezoneId = null;
  @SerializedName("zoom_level")
  private Integer zoomLevel = null;
  @SerializedName("center_longitude")
  private Double centerLongitude = null;
  @SerializedName("center_latitude")
  private Double centerLatitude = null;
  public enum MapTypeEnum {
     OSM,  GOOGLE_HYBRID,  GOOGLE_NORMAL,  GOOGLE_SATELLITE,  GOOGLE_TERRAIN,  BING_ROAD,  BING_HYBRID,  BING_AERIAL,  MAPQUEST_ROAD,  MAPQUEST_AERIAL,  STAMEN_TONER, 
  };
  @SerializedName("map_type")
  private MapTypeEnum mapType = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMaximizeOverviewMap() {
    return maximizeOverviewMap;
  }
  public void setMaximizeOverviewMap(Boolean maximizeOverviewMap) {
    this.maximizeOverviewMap = maximizeOverviewMap;
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
   * Default units of speed shown on map
   **/
  @ApiModelProperty(value = "Default units of speed shown on map")
  public SpeedUnitEnum getSpeedUnit() {
    return speedUnit;
  }
  public void setSpeedUnit(SpeedUnitEnum speedUnit) {
    this.speedUnit = speedUnit;
  }

  /**
   * User's timezone ID
   **/
  @ApiModelProperty(value = "User's timezone ID")
  public String getTimezoneId() {
    return timezoneId;
  }
  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }

  /**
   * Default level of zoom on map
   **/
  @ApiModelProperty(value = "Default level of zoom on map")
  public Integer getZoomLevel() {
    return zoomLevel;
  }
  public void setZoomLevel(Integer zoomLevel) {
    this.zoomLevel = zoomLevel;
  }

  /**
   * Longitude of map center opened by default
   **/
  @ApiModelProperty(value = "Longitude of map center opened by default")
  public Double getCenterLongitude() {
    return centerLongitude;
  }
  public void setCenterLongitude(Double centerLongitude) {
    this.centerLongitude = centerLongitude;
  }

  /**
   * Longitude of map center opened by default
   **/
  @ApiModelProperty(value = "Longitude of map center opened by default")
  public Double getCenterLatitude() {
    return centerLatitude;
  }
  public void setCenterLatitude(Double centerLatitude) {
    this.centerLatitude = centerLatitude;
  }

  /**
   * Type of map opened by default
   **/
  @ApiModelProperty(value = "Type of map opened by default")
  public MapTypeEnum getMapType() {
    return mapType;
  }
  public void setMapType(MapTypeEnum mapType) {
    this.mapType = mapType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettings userSettings = (UserSettings) o;
    return (maximizeOverviewMap == null ? userSettings.maximizeOverviewMap == null : maximizeOverviewMap.equals(userSettings.maximizeOverviewMap)) &&
        (id == null ? userSettings.id == null : id.equals(userSettings.id)) &&
        (speedUnit == null ? userSettings.speedUnit == null : speedUnit.equals(userSettings.speedUnit)) &&
        (timezoneId == null ? userSettings.timezoneId == null : timezoneId.equals(userSettings.timezoneId)) &&
        (zoomLevel == null ? userSettings.zoomLevel == null : zoomLevel.equals(userSettings.zoomLevel)) &&
        (centerLongitude == null ? userSettings.centerLongitude == null : centerLongitude.equals(userSettings.centerLongitude)) &&
        (centerLatitude == null ? userSettings.centerLatitude == null : centerLatitude.equals(userSettings.centerLatitude)) &&
        (mapType == null ? userSettings.mapType == null : mapType.equals(userSettings.mapType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (maximizeOverviewMap == null ? 0: maximizeOverviewMap.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (speedUnit == null ? 0: speedUnit.hashCode());
    result = 31 * result + (timezoneId == null ? 0: timezoneId.hashCode());
    result = 31 * result + (zoomLevel == null ? 0: zoomLevel.hashCode());
    result = 31 * result + (centerLongitude == null ? 0: centerLongitude.hashCode());
    result = 31 * result + (centerLatitude == null ? 0: centerLatitude.hashCode());
    result = 31 * result + (mapType == null ? 0: mapType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettings {\n");
    
    sb.append("  maximizeOverviewMap: ").append(maximizeOverviewMap).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  speedUnit: ").append(speedUnit).append("\n");
    sb.append("  timezoneId: ").append(timezoneId).append("\n");
    sb.append("  zoomLevel: ").append(zoomLevel).append("\n");
    sb.append("  centerLongitude: ").append(centerLongitude).append("\n");
    sb.append("  centerLatitude: ").append(centerLatitude).append("\n");
    sb.append("  mapType: ").append(mapType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

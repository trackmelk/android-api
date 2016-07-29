package lk.trackme.server.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class User  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("api_key")
  private String apiKey = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone_number")
  private String phoneNumber = null;
  @SerializedName("profile_picture")
  private String profilePicture = null;
  @SerializedName("settings")
  private UserSettings settings = null;

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
   * Name used to log in
   **/
  @ApiModelProperty(required = true, value = "Name used to log in")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Password
   **/
  @ApiModelProperty(required = true, value = "Password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * First name
   **/
  @ApiModelProperty(required = true, value = "First name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Last name
   **/
  @ApiModelProperty(required = true, value = "Last name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Email address
   **/
  @ApiModelProperty(required = true, value = "Email address")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Phone number, mobile number is preferred
   **/
  @ApiModelProperty(value = "Phone number, mobile number is preferred")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Profile picture URL
   **/
  @ApiModelProperty(value = "Profile picture URL")
  public String getProfilePicture() {
    return profilePicture;
  }
  public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
  }

  /**
   * User's preferences
   **/
  @ApiModelProperty(value = "User's preferences")
  public UserSettings getSettings() {
    return settings;
  }
  public void setSettings(UserSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return (id == null ? user.id == null : id.equals(user.id)) &&
        (username == null ? user.username == null : username.equals(user.username)) &&
        (password == null ? user.password == null : password.equals(user.password)) &&
        (apiKey == null ? user.apiKey == null : apiKey.equals(user.apiKey)) &&
        (firstName == null ? user.firstName == null : firstName.equals(user.firstName)) &&
        (lastName == null ? user.lastName == null : lastName.equals(user.lastName)) &&
        (email == null ? user.email == null : email.equals(user.email)) &&
        (phoneNumber == null ? user.phoneNumber == null : phoneNumber.equals(user.phoneNumber)) &&
        (profilePicture == null ? user.profilePicture == null : profilePicture.equals(user.profilePicture)) &&
        (settings == null ? user.settings == null : settings.equals(user.settings));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (username == null ? 0: username.hashCode());
    result = 31 * result + (password == null ? 0: password.hashCode());
    result = 31 * result + (apiKey == null ? 0: apiKey.hashCode());
    result = 31 * result + (firstName == null ? 0: firstName.hashCode());
    result = 31 * result + (lastName == null ? 0: lastName.hashCode());
    result = 31 * result + (email == null ? 0: email.hashCode());
    result = 31 * result + (phoneNumber == null ? 0: phoneNumber.hashCode());
    result = 31 * result + (profilePicture == null ? 0: profilePicture.hashCode());
    result = 31 * result + (settings == null ? 0: settings.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  apiKey: ").append(apiKey).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("  profilePicture: ").append(profilePicture).append("\n");
    sb.append("  settings: ").append(settings).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

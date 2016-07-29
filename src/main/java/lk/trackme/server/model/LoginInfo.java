package lk.trackme.server.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LoginInfo  {
  
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInfo loginInfo = (LoginInfo) o;
    return (username == null ? loginInfo.username == null : username.equals(loginInfo.username)) &&
        (password == null ? loginInfo.password == null : password.equals(loginInfo.password));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (username == null ? 0: username.hashCode());
    result = 31 * result + (password == null ? 0: password.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInfo {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package tbclient.GetUpdateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeSkinUpdateInfo extends Message {
  public static final String DEFAULT_PACKAGE_URL = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final Integer DEFAULT_PROPS_VERSION;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String package_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer props_version;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_PROPS_VERSION = integer;
  }
  
  public ThemeSkinUpdateInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.props_id;
      if (integer == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer;
      } 
      integer = paramBuilder.props_version;
      if (integer == null) {
        this.props_version = DEFAULT_PROPS_VERSION;
      } else {
        this.props_version = integer;
      } 
      str = paramBuilder.package_url;
      if (str == null) {
        this.package_url = "";
      } else {
        this.package_url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.props_version = ((Builder)str).props_version;
      this.package_url = ((Builder)str).package_url;
    } 
  }
  
  public ThemeSkinUpdateInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeSkinUpdateInfo> {
    public String package_url;
    
    public Integer props_id;
    
    public Integer props_version;
    
    public Builder() {}
    
    public Builder(ThemeSkinUpdateInfo param1ThemeSkinUpdateInfo) {
      super(param1ThemeSkinUpdateInfo);
      if (param1ThemeSkinUpdateInfo == null)
        return; 
      this.props_id = param1ThemeSkinUpdateInfo.props_id;
      this.props_version = param1ThemeSkinUpdateInfo.props_version;
      this.package_url = param1ThemeSkinUpdateInfo.package_url;
    }
    
    public ThemeSkinUpdateInfo build(boolean param1Boolean) {
      return new ThemeSkinUpdateInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

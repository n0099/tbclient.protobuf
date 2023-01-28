package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeSkinPropMain extends Message {
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final Integer DEFAULT_DAILY_PRIVILEGE_STATUS;
  
  public static final Long DEFAULT_END_TIME;
  
  public static final String DEFAULT_EXAMPLE_URL = "";
  
  public static final Integer DEFAULT_FREE_USER_LEVEL;
  
  public static final Integer DEFAULT_IS_FINISHED;
  
  public static final String DEFAULT_PACKAGE_KEY = "";
  
  public static final String DEFAULT_PACKAGE_SIZE = "";
  
  public static final String DEFAULT_PACKAGE_URL = "";
  
  public static final String DEFAULT_PERMISSION = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_PROPS_STATE_IMG = "";
  
  public static final Integer DEFAULT_PROPS_VERSION;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer daily_privilege_status;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String example_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer free_user_level;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer is_finished;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String package_key;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String package_size;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String package_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String permission;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String props_state_img;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer props_version;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_PROPS_VERSION = integer;
    DEFAULT_FREE_USER_LEVEL = integer;
    DEFAULT_IS_FINISHED = integer;
    DEFAULT_DAILY_PRIVILEGE_STATUS = integer;
    DEFAULT_END_TIME = Long.valueOf(0L);
  }
  
  public ThemeSkinPropMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer4 = paramBuilder.props_id;
      if (integer4 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer4;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.example_url;
      if (str3 == null) {
        this.example_url = "";
      } else {
        this.example_url = str3;
      } 
      str3 = paramBuilder.permission;
      if (str3 == null) {
        this.permission = "";
      } else {
        this.permission = str3;
      } 
      str3 = paramBuilder.props_state_img;
      if (str3 == null) {
        this.props_state_img = "";
      } else {
        this.props_state_img = str3;
      } 
      str3 = paramBuilder.package_url;
      if (str3 == null) {
        this.package_url = "";
      } else {
        this.package_url = str3;
      } 
      str3 = paramBuilder.package_size;
      if (str3 == null) {
        this.package_size = "";
      } else {
        this.package_size = str3;
      } 
      Integer integer3 = paramBuilder.props_version;
      if (integer3 == null) {
        this.props_version = DEFAULT_PROPS_VERSION;
      } else {
        this.props_version = integer3;
      } 
      integer3 = paramBuilder.free_user_level;
      if (integer3 == null) {
        this.free_user_level = DEFAULT_FREE_USER_LEVEL;
      } else {
        this.free_user_level = integer3;
      } 
      String str2 = paramBuilder.activity_url;
      if (str2 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str2;
      } 
      Integer integer2 = paramBuilder.is_finished;
      if (integer2 == null) {
        this.is_finished = DEFAULT_IS_FINISHED;
      } else {
        this.is_finished = integer2;
      } 
      String str1 = paramBuilder.package_key;
      if (str1 == null) {
        this.package_key = "";
      } else {
        this.package_key = str1;
      } 
      Integer integer1 = paramBuilder.daily_privilege_status;
      if (integer1 == null) {
        this.daily_privilege_status = DEFAULT_DAILY_PRIVILEGE_STATUS;
      } else {
        this.daily_privilege_status = integer1;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
    } else {
      this.props_id = ((Builder)long_).props_id;
      this.title = ((Builder)long_).title;
      this.example_url = ((Builder)long_).example_url;
      this.permission = ((Builder)long_).permission;
      this.props_state_img = ((Builder)long_).props_state_img;
      this.package_url = ((Builder)long_).package_url;
      this.package_size = ((Builder)long_).package_size;
      this.props_version = ((Builder)long_).props_version;
      this.free_user_level = ((Builder)long_).free_user_level;
      this.activity_url = ((Builder)long_).activity_url;
      this.is_finished = ((Builder)long_).is_finished;
      this.package_key = ((Builder)long_).package_key;
      this.daily_privilege_status = ((Builder)long_).daily_privilege_status;
      this.end_time = ((Builder)long_).end_time;
    } 
  }
  
  public ThemeSkinPropMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeSkinPropMain> {
    public String activity_url;
    
    public Integer daily_privilege_status;
    
    public Long end_time;
    
    public String example_url;
    
    public Integer free_user_level;
    
    public Integer is_finished;
    
    public String package_key;
    
    public String package_size;
    
    public String package_url;
    
    public String permission;
    
    public Integer props_id;
    
    public String props_state_img;
    
    public Integer props_version;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ThemeSkinPropMain param1ThemeSkinPropMain) {
      super(param1ThemeSkinPropMain);
      if (param1ThemeSkinPropMain == null)
        return; 
      this.props_id = param1ThemeSkinPropMain.props_id;
      this.title = param1ThemeSkinPropMain.title;
      this.example_url = param1ThemeSkinPropMain.example_url;
      this.permission = param1ThemeSkinPropMain.permission;
      this.props_state_img = param1ThemeSkinPropMain.props_state_img;
      this.package_url = param1ThemeSkinPropMain.package_url;
      this.package_size = param1ThemeSkinPropMain.package_size;
      this.props_version = param1ThemeSkinPropMain.props_version;
      this.free_user_level = param1ThemeSkinPropMain.free_user_level;
      this.activity_url = param1ThemeSkinPropMain.activity_url;
      this.is_finished = param1ThemeSkinPropMain.is_finished;
      this.package_key = param1ThemeSkinPropMain.package_key;
      this.daily_privilege_status = param1ThemeSkinPropMain.daily_privilege_status;
      this.end_time = param1ThemeSkinPropMain.end_time;
    }
    
    public ThemeSkinPropMain build(boolean param1Boolean) {
      return new ThemeSkinPropMain(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

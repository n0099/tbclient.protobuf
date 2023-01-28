package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeBgProp extends Message {
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final String DEFAULT_DYNAMIC_URL = "";
  
  public static final String DEFAULT_DYNAMIC_URL_SMALL = "";
  
  public static final String DEFAULT_EXAMPLE_URL = "";
  
  public static final Integer DEFAULT_FREE_USER_LEVEL;
  
  public static final Integer DEFAULT_IN_USE;
  
  public static final Integer DEFAULT_IS_FINISHED;
  
  public static final String DEFAULT_PERMISSION = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_PROPS_STATE_IMG = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String dynamic_url;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String dynamic_url_small;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String example_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer free_user_level;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer in_use;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer is_finished;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String permission;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String props_state_img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_IN_USE = integer;
    DEFAULT_FREE_USER_LEVEL = integer;
    DEFAULT_IS_FINISHED = integer;
  }
  
  public ThemeBgProp(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.props_id;
      if (integer3 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer3;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.description;
      if (str3 == null) {
        this.description = "";
      } else {
        this.description = str3;
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
      Integer integer2 = paramBuilder.in_use;
      if (integer2 == null) {
        this.in_use = DEFAULT_IN_USE;
      } else {
        this.in_use = integer2;
      } 
      integer2 = paramBuilder.free_user_level;
      if (integer2 == null) {
        this.free_user_level = DEFAULT_FREE_USER_LEVEL;
      } else {
        this.free_user_level = integer2;
      } 
      String str2 = paramBuilder.activity_url;
      if (str2 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str2;
      } 
      Integer integer1 = paramBuilder.is_finished;
      if (integer1 == null) {
        this.is_finished = DEFAULT_IS_FINISHED;
      } else {
        this.is_finished = integer1;
      } 
      String str1 = paramBuilder.dynamic_url;
      if (str1 == null) {
        this.dynamic_url = "";
      } else {
        this.dynamic_url = str1;
      } 
      str = paramBuilder.dynamic_url_small;
      if (str == null) {
        this.dynamic_url_small = "";
      } else {
        this.dynamic_url_small = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.title = ((Builder)str).title;
      this.description = ((Builder)str).description;
      this.example_url = ((Builder)str).example_url;
      this.permission = ((Builder)str).permission;
      this.props_state_img = ((Builder)str).props_state_img;
      this.in_use = ((Builder)str).in_use;
      this.free_user_level = ((Builder)str).free_user_level;
      this.activity_url = ((Builder)str).activity_url;
      this.is_finished = ((Builder)str).is_finished;
      this.dynamic_url = ((Builder)str).dynamic_url;
      this.dynamic_url_small = ((Builder)str).dynamic_url_small;
    } 
  }
  
  public ThemeBgProp(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeBgProp> {
    public String activity_url;
    
    public String description;
    
    public String dynamic_url;
    
    public String dynamic_url_small;
    
    public String example_url;
    
    public Integer free_user_level;
    
    public Integer in_use;
    
    public Integer is_finished;
    
    public String permission;
    
    public Integer props_id;
    
    public String props_state_img;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ThemeBgProp param1ThemeBgProp) {
      super(param1ThemeBgProp);
      if (param1ThemeBgProp == null)
        return; 
      this.props_id = param1ThemeBgProp.props_id;
      this.title = param1ThemeBgProp.title;
      this.description = param1ThemeBgProp.description;
      this.example_url = param1ThemeBgProp.example_url;
      this.permission = param1ThemeBgProp.permission;
      this.props_state_img = param1ThemeBgProp.props_state_img;
      this.in_use = param1ThemeBgProp.in_use;
      this.free_user_level = param1ThemeBgProp.free_user_level;
      this.activity_url = param1ThemeBgProp.activity_url;
      this.is_finished = param1ThemeBgProp.is_finished;
      this.dynamic_url = param1ThemeBgProp.dynamic_url;
      this.dynamic_url_small = param1ThemeBgProp.dynamic_url_small;
    }
    
    public ThemeBgProp build(boolean param1Boolean) {
      return new ThemeBgProp(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeCardPropMain extends Message {
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final String DEFAULT_DYNAMIC_URL = "";
  
  public static final String DEFAULT_EXAMPLE_URL = "";
  
  public static final Integer DEFAULT_FREE_USER_LEVEL;
  
  public static final Integer DEFAULT_IN_USE;
  
  public static final Integer DEFAULT_IS_FINISHED;
  
  public static final String DEFAULT_PERMISSION = "";
  
  public static final Long DEFAULT_PROPS_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_PROPS_STATE_IMG = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String dynamic_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String example_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer free_user_level;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer in_use;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer is_finished;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String permission;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long props_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String props_state_img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IN_USE = integer;
    DEFAULT_FREE_USER_LEVEL = integer;
    DEFAULT_IS_FINISHED = integer;
  }
  
  public ThemeCardPropMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.props_id;
      if (long_ == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = long_;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.description;
      if (str2 == null) {
        this.description = "";
      } else {
        this.description = str2;
      } 
      str2 = paramBuilder.example_url;
      if (str2 == null) {
        this.example_url = "";
      } else {
        this.example_url = str2;
      } 
      str2 = paramBuilder.permission;
      if (str2 == null) {
        this.permission = "";
      } else {
        this.permission = str2;
      } 
      str2 = paramBuilder.props_state_img;
      if (str2 == null) {
        this.props_state_img = "";
      } else {
        this.props_state_img = str2;
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
      String str1 = paramBuilder.activity_url;
      if (str1 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str1;
      } 
      Integer integer1 = paramBuilder.is_finished;
      if (integer1 == null) {
        this.is_finished = DEFAULT_IS_FINISHED;
      } else {
        this.is_finished = integer1;
      } 
      str = paramBuilder.dynamic_url;
      if (str == null) {
        this.dynamic_url = "";
      } else {
        this.dynamic_url = str;
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
    } 
  }
  
  public ThemeCardPropMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeCardPropMain> {
    public String activity_url;
    
    public String description;
    
    public String dynamic_url;
    
    public String example_url;
    
    public Integer free_user_level;
    
    public Integer in_use;
    
    public Integer is_finished;
    
    public String permission;
    
    public Long props_id;
    
    public String props_state_img;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ThemeCardPropMain param1ThemeCardPropMain) {
      super(param1ThemeCardPropMain);
      if (param1ThemeCardPropMain == null)
        return; 
      this.props_id = param1ThemeCardPropMain.props_id;
      this.title = param1ThemeCardPropMain.title;
      this.description = param1ThemeCardPropMain.description;
      this.example_url = param1ThemeCardPropMain.example_url;
      this.permission = param1ThemeCardPropMain.permission;
      this.props_state_img = param1ThemeCardPropMain.props_state_img;
      this.in_use = param1ThemeCardPropMain.in_use;
      this.free_user_level = param1ThemeCardPropMain.free_user_level;
      this.activity_url = param1ThemeCardPropMain.activity_url;
      this.is_finished = param1ThemeCardPropMain.is_finished;
      this.dynamic_url = param1ThemeCardPropMain.dynamic_url;
    }
    
    public ThemeCardPropMain build(boolean param1Boolean) {
      return new ThemeCardPropMain(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

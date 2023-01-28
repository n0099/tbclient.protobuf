package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CustomGrid extends Message {
  public static final Integer DEFAULT_ACTION_TYPE;
  
  public static final String DEFAULT_ACTION_URI = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_MARK_TEXT = "";
  
  public static final Long DEFAULT_RED_POINT_VERSION;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer action_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String action_uri;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String mark_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long red_point_version;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACTION_TYPE = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_RED_POINT_VERSION = Long.valueOf(0L);
  }
  
  public CustomGrid(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.action_uri;
      if (str3 == null) {
        this.action_uri = "";
      } else {
        this.action_uri = str3;
      } 
      Integer integer2 = paramBuilder.action_type;
      if (integer2 == null) {
        this.action_type = DEFAULT_ACTION_TYPE;
      } else {
        this.action_type = integer2;
      } 
      String str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      Long long_ = paramBuilder.red_point_version;
      if (long_ == null) {
        this.red_point_version = DEFAULT_RED_POINT_VERSION;
      } else {
        this.red_point_version = long_;
      } 
      String str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.mark_text;
      if (str == null) {
        this.mark_text = "";
      } else {
        this.mark_text = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.action_uri = ((Builder)str).action_uri;
      this.action_type = ((Builder)str).action_type;
      this.icon = ((Builder)str).icon;
      this.type = ((Builder)str).type;
      this.red_point_version = ((Builder)str).red_point_version;
      this.desc = ((Builder)str).desc;
      this.mark_text = ((Builder)str).mark_text;
    } 
  }
  
  public CustomGrid(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CustomGrid> {
    public Integer action_type;
    
    public String action_uri;
    
    public String desc;
    
    public String icon;
    
    public String mark_text;
    
    public Long red_point_version;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(CustomGrid param1CustomGrid) {
      super(param1CustomGrid);
      if (param1CustomGrid == null)
        return; 
      this.title = param1CustomGrid.title;
      this.action_uri = param1CustomGrid.action_uri;
      this.action_type = param1CustomGrid.action_type;
      this.icon = param1CustomGrid.icon;
      this.type = param1CustomGrid.type;
      this.red_point_version = param1CustomGrid.red_point_version;
      this.desc = param1CustomGrid.desc;
      this.mark_text = param1CustomGrid.mark_text;
    }
    
    public CustomGrid build(boolean param1Boolean) {
      return new CustomGrid(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

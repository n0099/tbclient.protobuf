package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeList extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final Long DEFAULT_LAST_UPDATE_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long last_update_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String type;
  
  public ThemeList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      Long long_ = paramBuilder.last_update_time;
      if (long_ == null) {
        this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
      } else {
        this.last_update_time = long_;
      } 
      str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
      this.last_update_time = ((Builder)str).last_update_time;
      this.type = ((Builder)str).type;
    } 
  }
  
  public ThemeList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeList> {
    public String icon;
    
    public Long last_update_time;
    
    public String name;
    
    public String type;
    
    public Builder() {}
    
    public Builder(ThemeList param1ThemeList) {
      super(param1ThemeList);
      if (param1ThemeList == null)
        return; 
      this.name = param1ThemeList.name;
      this.icon = param1ThemeList.icon;
      this.last_update_time = param1ThemeList.last_update_time;
      this.type = param1ThemeList.type;
    }
    
    public ThemeList build(boolean param1Boolean) {
      return new ThemeList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

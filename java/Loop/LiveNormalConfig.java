package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LiveNormalConfig extends Message {
  public static final String DEFAULT_ICON_SCHEME = "";
  
  public static final String DEFAULT_ICON_URL_DAY = "";
  
  public static final String DEFAULT_ICON_URL_NIGHT = "";
  
  public static final Integer DEFAULT_SHOW_PAGE = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url_day;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url_night;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer show_page;
  
  public LiveNormalConfig(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.icon_url_day;
      if (str == null) {
        this.icon_url_day = "";
      } else {
        this.icon_url_day = str;
      } 
      str = paramBuilder.icon_url_night;
      if (str == null) {
        this.icon_url_night = "";
      } else {
        this.icon_url_night = str;
      } 
      str = paramBuilder.icon_scheme;
      if (str == null) {
        this.icon_scheme = "";
      } else {
        this.icon_scheme = str;
      } 
      integer = paramBuilder.show_page;
      if (integer == null) {
        this.show_page = DEFAULT_SHOW_PAGE;
      } else {
        this.show_page = integer;
      } 
    } else {
      this.icon_url_day = ((Builder)integer).icon_url_day;
      this.icon_url_night = ((Builder)integer).icon_url_night;
      this.icon_scheme = ((Builder)integer).icon_scheme;
      this.show_page = ((Builder)integer).show_page;
    } 
  }
  
  public LiveNormalConfig(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LiveNormalConfig> {
    public String icon_scheme;
    
    public String icon_url_day;
    
    public String icon_url_night;
    
    public Integer show_page;
    
    public Builder() {}
    
    public Builder(LiveNormalConfig param1LiveNormalConfig) {
      super(param1LiveNormalConfig);
      if (param1LiveNormalConfig == null)
        return; 
      this.icon_url_day = param1LiveNormalConfig.icon_url_day;
      this.icon_url_night = param1LiveNormalConfig.icon_url_night;
      this.icon_scheme = param1LiveNormalConfig.icon_scheme;
      this.show_page = param1LiveNormalConfig.show_page;
    }
    
    public LiveNormalConfig build(boolean param1Boolean) {
      return new LiveNormalConfig(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

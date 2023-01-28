package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeColorInfo extends Message {
  @ProtoField(tag = 3)
  public final ThemeElement dark;
  
  @ProtoField(tag = 1)
  public final ThemeElement day;
  
  @ProtoField(tag = 2)
  public final ThemeElement night;
  
  public ThemeColorInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.day = paramBuilder.day;
      this.night = paramBuilder.night;
      this.dark = paramBuilder.dark;
    } else {
      this.day = paramBuilder.day;
      this.night = paramBuilder.night;
      this.dark = paramBuilder.dark;
    } 
  }
  
  public ThemeColorInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeColorInfo> {
    public ThemeElement dark;
    
    public ThemeElement day;
    
    public ThemeElement night;
    
    public Builder() {}
    
    public Builder(ThemeColorInfo param1ThemeColorInfo) {
      super(param1ThemeColorInfo);
      if (param1ThemeColorInfo == null)
        return; 
      this.day = param1ThemeColorInfo.day;
      this.night = param1ThemeColorInfo.night;
      this.dark = param1ThemeColorInfo.dark;
    }
    
    public ThemeColorInfo build(boolean param1Boolean) {
      return new ThemeColorInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

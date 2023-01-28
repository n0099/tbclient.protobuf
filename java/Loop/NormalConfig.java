package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NormalConfig extends Message {
  public static final String DEFAULT_ICON_SCHEME = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  public NormalConfig(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str = paramBuilder.icon_scheme;
      if (str == null) {
        this.icon_scheme = "";
      } else {
        this.icon_scheme = str;
      } 
    } else {
      this.icon_url = ((Builder)str).icon_url;
      this.icon_scheme = ((Builder)str).icon_scheme;
    } 
  }
  
  public NormalConfig(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NormalConfig> {
    public String icon_scheme;
    
    public String icon_url;
    
    public Builder() {}
    
    public Builder(NormalConfig param1NormalConfig) {
      super(param1NormalConfig);
      if (param1NormalConfig == null)
        return; 
      this.icon_url = param1NormalConfig.icon_url;
      this.icon_scheme = param1NormalConfig.icon_scheme;
    }
    
    public NormalConfig build(boolean param1Boolean) {
      return new NormalConfig(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

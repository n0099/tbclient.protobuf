package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EsportInfo extends Message {
  public static final String DEFAULT_INTRO = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String intro;
  
  public EsportInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
    } else {
      this.intro = ((Builder)str).intro;
    } 
  }
  
  public EsportInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EsportInfo> {
    public String intro;
    
    public Builder() {}
    
    public Builder(EsportInfo param1EsportInfo) {
      super(param1EsportInfo);
      if (param1EsportInfo == null)
        return; 
      this.intro = param1EsportInfo.intro;
    }
    
    public EsportInfo build(boolean param1Boolean) {
      return new EsportInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EsportStatic extends Message {
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public EsportStatic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img;
      if (str1 == null) {
        this.img = "";
      } else {
        this.img = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.img = ((Builder)str).img;
      this.url = ((Builder)str).url;
    } 
  }
  
  public EsportStatic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EsportStatic> {
    public String img;
    
    public String url;
    
    public Builder() {}
    
    public Builder(EsportStatic param1EsportStatic) {
      super(param1EsportStatic);
      if (param1EsportStatic == null)
        return; 
      this.img = param1EsportStatic.img;
      this.url = param1EsportStatic.url;
    }
    
    public EsportStatic build(boolean param1Boolean) {
      return new EsportStatic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

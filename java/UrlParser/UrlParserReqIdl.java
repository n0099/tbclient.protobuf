package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UrlParserReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public UrlParserReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UrlParserReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UrlParserReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(UrlParserReqIdl param1UrlParserReqIdl) {
      super(param1UrlParserReqIdl);
      if (param1UrlParserReqIdl == null)
        return; 
      this.data = param1UrlParserReqIdl.data;
    }
    
    public UrlParserReqIdl build(boolean param1Boolean) {
      return new UrlParserReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

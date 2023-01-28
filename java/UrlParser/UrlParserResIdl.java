package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class UrlParserResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public UrlParserResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public UrlParserResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UrlParserResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(UrlParserResIdl param1UrlParserResIdl) {
      super(param1UrlParserResIdl);
      if (param1UrlParserResIdl == null)
        return; 
      this.error = param1UrlParserResIdl.error;
      this.data = param1UrlParserResIdl.data;
    }
    
    public UrlParserResIdl build(boolean param1Boolean) {
      return new UrlParserResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

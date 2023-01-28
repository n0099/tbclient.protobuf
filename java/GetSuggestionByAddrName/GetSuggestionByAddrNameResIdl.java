package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetSuggestionByAddrNameResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetSuggestionByAddrNameResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetSuggestionByAddrNameResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetSuggestionByAddrNameResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetSuggestionByAddrNameResIdl param1GetSuggestionByAddrNameResIdl) {
      super(param1GetSuggestionByAddrNameResIdl);
      if (param1GetSuggestionByAddrNameResIdl == null)
        return; 
      this.error = param1GetSuggestionByAddrNameResIdl.error;
      this.data = param1GetSuggestionByAddrNameResIdl.data;
    }
    
    public GetSuggestionByAddrNameResIdl build(boolean param1Boolean) {
      return new GetSuggestionByAddrNameResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

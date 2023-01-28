package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetSuggestionByAddrNameReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetSuggestionByAddrNameReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetSuggestionByAddrNameReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetSuggestionByAddrNameReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetSuggestionByAddrNameReqIdl param1GetSuggestionByAddrNameReqIdl) {
      super(param1GetSuggestionByAddrNameReqIdl);
      if (param1GetSuggestionByAddrNameReqIdl == null)
        return; 
      this.data = param1GetSuggestionByAddrNameReqIdl.data;
    }
    
    public GetSuggestionByAddrNameReqIdl build(boolean param1Boolean) {
      return new GetSuggestionByAddrNameReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

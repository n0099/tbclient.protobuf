package tbclient.GetInfluenceRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetInfluenceRankResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetInfluenceRankResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetInfluenceRankResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetInfluenceRankResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetInfluenceRankResIdl param1GetInfluenceRankResIdl) {
      super(param1GetInfluenceRankResIdl);
      if (param1GetInfluenceRankResIdl == null)
        return; 
      this.error = param1GetInfluenceRankResIdl.error;
      this.data = param1GetInfluenceRankResIdl.data;
    }
    
    public GetInfluenceRankResIdl build(boolean param1Boolean) {
      return new GetInfluenceRankResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

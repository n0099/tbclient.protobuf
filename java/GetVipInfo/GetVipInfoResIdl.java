package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetVipInfoResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetVipInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetVipInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetVipInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetVipInfoResIdl param1GetVipInfoResIdl) {
      super(param1GetVipInfoResIdl);
      if (param1GetVipInfoResIdl == null)
        return; 
      this.data = param1GetVipInfoResIdl.data;
      this.error = param1GetVipInfoResIdl.error;
    }
    
    public GetVipInfoResIdl build(boolean param1Boolean) {
      return new GetVipInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

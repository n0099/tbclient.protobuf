package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetBigdayReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetBigdayReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetBigdayReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBigdayReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetBigdayReqIdl param1GetBigdayReqIdl) {
      super(param1GetBigdayReqIdl);
      if (param1GetBigdayReqIdl == null)
        return; 
      this.data = param1GetBigdayReqIdl.data;
    }
    
    public GetBigdayReqIdl build(boolean param1Boolean) {
      return new GetBigdayReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

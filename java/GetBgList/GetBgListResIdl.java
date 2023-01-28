package tbclient.GetBgList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetBgListResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetBgListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetBgListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBgListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetBgListResIdl param1GetBgListResIdl) {
      super(param1GetBgListResIdl);
      if (param1GetBgListResIdl == null)
        return; 
      this.data = param1GetBgListResIdl.data;
      this.error = param1GetBgListResIdl.error;
    }
    
    public GetBgListResIdl build(boolean param1Boolean) {
      return new GetBgListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

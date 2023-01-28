package tbclient.GetShoubaiThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetShoubaiThreadListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetShoubaiThreadListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetShoubaiThreadListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetShoubaiThreadListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetShoubaiThreadListResIdl param1GetShoubaiThreadListResIdl) {
      super(param1GetShoubaiThreadListResIdl);
      if (param1GetShoubaiThreadListResIdl == null)
        return; 
      this.error = param1GetShoubaiThreadListResIdl.error;
      this.data = param1GetShoubaiThreadListResIdl.data;
    }
    
    public GetShoubaiThreadListResIdl build(boolean param1Boolean) {
      return new GetShoubaiThreadListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

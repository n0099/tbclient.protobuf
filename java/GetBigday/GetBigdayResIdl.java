package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetBigdayResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetBigdayResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetBigdayResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBigdayResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetBigdayResIdl param1GetBigdayResIdl) {
      super(param1GetBigdayResIdl);
      if (param1GetBigdayResIdl == null)
        return; 
      this.error = param1GetBigdayResIdl.error;
      this.data = param1GetBigdayResIdl.data;
    }
    
    public GetBigdayResIdl build(boolean param1Boolean) {
      return new GetBigdayResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

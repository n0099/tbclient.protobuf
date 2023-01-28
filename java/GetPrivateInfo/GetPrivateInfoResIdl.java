package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetPrivateInfoResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetPrivateInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetPrivateInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPrivateInfoResIdl> {
    public ResData data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetPrivateInfoResIdl param1GetPrivateInfoResIdl) {
      super(param1GetPrivateInfoResIdl);
      if (param1GetPrivateInfoResIdl == null)
        return; 
      this.data = param1GetPrivateInfoResIdl.data;
      this.error = param1GetPrivateInfoResIdl.error;
    }
    
    public GetPrivateInfoResIdl build(boolean param1Boolean) {
      return new GetPrivateInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

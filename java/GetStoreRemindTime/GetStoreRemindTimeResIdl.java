package tbclient.GetStoreRemindTime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetStoreRemindTimeResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetStoreRemindTimeResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetStoreRemindTimeResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetStoreRemindTimeResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetStoreRemindTimeResIdl param1GetStoreRemindTimeResIdl) {
      super(param1GetStoreRemindTimeResIdl);
      if (param1GetStoreRemindTimeResIdl == null)
        return; 
      this.data = param1GetStoreRemindTimeResIdl.data;
      this.error = param1GetStoreRemindTimeResIdl.error;
    }
    
    public GetStoreRemindTimeResIdl build(boolean param1Boolean) {
      return new GetStoreRemindTimeResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

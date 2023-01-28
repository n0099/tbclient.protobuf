package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetTokenResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetTokenResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetTokenResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTokenResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetTokenResIdl param1GetTokenResIdl) {
      super(param1GetTokenResIdl);
      if (param1GetTokenResIdl == null)
        return; 
      this.error = param1GetTokenResIdl.error;
      this.data = param1GetTokenResIdl.data;
    }
    
    public GetTokenResIdl build(boolean param1Boolean) {
      return new GetTokenResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}

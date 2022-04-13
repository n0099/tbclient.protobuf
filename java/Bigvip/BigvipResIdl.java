package Bigvip;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Bigvip.DataRes;
import tbclient.Error;

public final class BigvipResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public BigvipResIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
}

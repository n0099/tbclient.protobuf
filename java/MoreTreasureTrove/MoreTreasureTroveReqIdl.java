package MoreTreasureTrove;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.MoreTreasureTrove.DataReq;

public final class MoreTreasureTroveReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public MoreTreasureTroveReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
}

package FinishMemberTask;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FinishMemberTask.DataReq;

public final class FinishMemberTaskReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public FinishMemberTaskReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
}

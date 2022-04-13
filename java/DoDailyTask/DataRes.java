package DoDailyTask;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.DoDailyTask.RetDataList;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final RetDataList ret_data;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.ret_data = paramBuilder.ret_data;
    } else {
      this.ret_data = paramBuilder.ret_data;
    } 
  }
}

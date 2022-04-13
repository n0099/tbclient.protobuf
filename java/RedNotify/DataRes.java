package RedNotify;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RedNotify.RedNotify;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final RedNotify notify_data;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.notify_data = paramBuilder.notify_data;
    } else {
      this.notify_data = paramBuilder.notify_data;
    } 
  }
}

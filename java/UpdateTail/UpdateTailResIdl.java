package UpdateTail;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
import tbclient.UpdateTail.ResData;

public final class UpdateTailResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public UpdateTailResIdl(Builder paramBuilder, boolean paramBoolean) {
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

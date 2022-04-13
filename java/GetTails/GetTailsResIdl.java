package GetTails;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
import tbclient.GetTails.ResData;

public final class GetTailsResIdl extends Message {
  @ProtoField(tag = 1)
  public final ResData data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetTailsResIdl(Builder paramBuilder, boolean paramBoolean) {
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

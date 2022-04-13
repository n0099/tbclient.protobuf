package LogTogether;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class LogTogetherResIdl extends Message {
  @ProtoField(tag = 1)
  public final Error error;
  
  public LogTogetherResIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
    } else {
      this.error = paramBuilder.error;
    } 
  }
}

package LoadMon;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignInfo extends Message {
  public static final String DEFAULT_DATE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String date;
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.date;
      if (str == null) {
        this.date = "";
      } else {
        this.date = str;
      } 
    } else {
      this.date = ((Builder)str).date;
    } 
  }
}

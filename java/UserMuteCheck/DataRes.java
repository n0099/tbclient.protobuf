package UserMuteCheck;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final String DEFAULT_IS_MUTE = "";
  
  public static final String DEFAULT_MUTE_CONFIRM = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String is_mute;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String mute_confirm;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.is_mute;
      if (str1 == null) {
        this.is_mute = "";
      } else {
        this.is_mute = str1;
      } 
      str = paramBuilder.mute_confirm;
      if (str == null) {
        this.mute_confirm = "";
      } else {
        this.mute_confirm = str;
      } 
    } else {
      this.is_mute = ((Builder)str).is_mute;
      this.mute_confirm = ((Builder)str).mute_confirm;
    } 
  }
}

package GetTails;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ColorInfo extends Message {
  public static final String DEFAULT_FONTCOLOR = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String fontColor;
  
  public ColorInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.fontColor;
      if (str == null) {
        this.fontColor = "";
      } else {
        this.fontColor = str;
      } 
    } else {
      this.fontColor = ((Builder)str).fontColor;
    } 
  }
}

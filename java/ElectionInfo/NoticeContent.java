package ElectionInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NoticeContent extends Message {
  public static final String DEFAULT_PUBLIC_NOTICE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String public_notice;
  
  public NoticeContent(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.public_notice;
      if (str == null) {
        this.public_notice = "";
      } else {
        this.public_notice = str;
      } 
    } else {
      this.public_notice = ((Builder)str).public_notice;
    } 
  }
}

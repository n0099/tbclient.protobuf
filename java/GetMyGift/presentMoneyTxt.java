package GetMyGift;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class presentMoneyTxt extends Message {
  public static final String DEFAULT_TXT = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String txt;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public presentMoneyTxt(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.txt;
      if (str1 == null) {
        this.txt = "";
      } else {
        this.txt = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.txt = ((Builder)str).txt;
      this.url = ((Builder)str).url;
    } 
  }
}

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BazhuSign;

public final class BazhuSign extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_LEVEL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String level;
  
  public BazhuSign(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.level;
      if (str == null) {
        this.level = "";
      } else {
        this.level = str;
      } 
    } else {
      this.desc = ((Builder)str).desc;
      this.level = ((Builder)str).level;
    } 
  }
}

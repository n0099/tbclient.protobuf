import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameAttr;
import tbclient.SignatureInfo;

public final class GameAttr extends Message {
  public static final String DEFAULT_IS_OPEN = "";
  
  public static final String DEFAULT_USER_ID = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String is_open;
  
  @ProtoField(tag = 2)
  public final SignatureInfo signature_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_id;
  
  public GameAttr(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.user_id;
      if (str1 == null) {
        this.user_id = "";
      } else {
        this.user_id = str1;
      } 
      this.signature_info = paramBuilder.signature_info;
      str = paramBuilder.is_open;
      if (str == null) {
        this.is_open = "";
      } else {
        this.is_open = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.signature_info = ((Builder)str).signature_info;
      this.is_open = ((Builder)str).is_open;
    } 
  }
}

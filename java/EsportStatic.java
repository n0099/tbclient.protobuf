import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.EsportStatic;

public final class EsportStatic extends Message {
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public EsportStatic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img;
      if (str1 == null) {
        this.img = "";
      } else {
        this.img = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.img = ((Builder)str).img;
      this.url = ((Builder)str).url;
    } 
  }
}

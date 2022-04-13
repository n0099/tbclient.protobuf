import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.DetailInfo;

public final class DetailInfo extends Message {
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public DetailInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.url = ((Builder)str).url;
    } 
  }
}

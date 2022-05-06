import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.EsportInfo;

public final class EsportInfo extends Message {
  public static final String DEFAULT_INTRO = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String intro;
  
  public EsportInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
    } else {
      this.intro = ((Builder)str).intro;
    } 
  }
}

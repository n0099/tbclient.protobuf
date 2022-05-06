import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LotteryTheme;

public final class LotteryTheme extends Message {
  public static final String DEFAULT_BGCOLOR = "";
  
  public static final String DEFAULT_BGIMAGE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bgcolor;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bgimage;
  
  public LotteryTheme(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.bgcolor;
      if (str1 == null) {
        this.bgcolor = "";
      } else {
        this.bgcolor = str1;
      } 
      str = paramBuilder.bgimage;
      if (str == null) {
        this.bgimage = "";
      } else {
        this.bgimage = str;
      } 
    } else {
      this.bgcolor = ((Builder)str).bgcolor;
      this.bgimage = ((Builder)str).bgimage;
    } 
  }
}

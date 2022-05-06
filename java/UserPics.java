import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.UserPics;

public final class UserPics extends Message {
  public static final String DEFAULT_BIG = "";
  
  public static final String DEFAULT_SMALL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String big;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String small;
  
  public UserPics(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.big;
      if (str1 == null) {
        this.big = "";
      } else {
        this.big = str1;
      } 
      str = paramBuilder.small;
      if (str == null) {
        this.small = "";
      } else {
        this.small = str;
      } 
    } else {
      this.big = ((Builder)str).big;
      this.small = ((Builder)str).small;
    } 
  }
}

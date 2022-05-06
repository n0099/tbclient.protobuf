import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Avatar;

public final class Avatar extends Message {
  public static final String DEFAULT_PIC = "";
  
  public static final String DEFAULT_POS = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pos;
  
  public Avatar(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pic;
      if (str1 == null) {
        this.pic = "";
      } else {
        this.pic = str1;
      } 
      str = paramBuilder.pos;
      if (str == null) {
        this.pos = "";
      } else {
        this.pos = str;
      } 
    } else {
      this.pic = ((Builder)str).pic;
      this.pos = ((Builder)str).pos;
    } 
  }
}

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadPicList;

public final class ThreadPicList extends Message {
  public static final String DEFAULT_PIC = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  public ThreadPicList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
    } else {
      this.pic = ((Builder)str).pic;
    } 
  }
}

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Global;

public final class Global extends Message {
  public static final String DEFAULT_TBMALL_NEWPROPS = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tbmall_newprops;
  
  public Global(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.tbmall_newprops;
      if (str == null) {
        this.tbmall_newprops = "";
      } else {
        this.tbmall_newprops = str;
      } 
    } else {
      this.tbmall_newprops = ((Builder)str).tbmall_newprops;
    } 
  }
}

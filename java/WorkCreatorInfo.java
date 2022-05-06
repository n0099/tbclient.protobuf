import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.WorkCreatorInfo;

public final class WorkCreatorInfo extends Message {
  public static final String DEFAULT_AUTH_DESC = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String auth_desc;
  
  public WorkCreatorInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.auth_desc;
      if (str == null) {
        this.auth_desc = "";
      } else {
        this.auth_desc = str;
      } 
    } else {
      this.auth_desc = ((Builder)str).auth_desc;
    } 
  }
}

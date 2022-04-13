import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AlaLiveNotify;

public final class AlaLiveNotify extends Message {
  public static final String DEFAULT_NOTI_CONTENT = "";
  
  public static final String DEFAULT_NOTI_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String noti_content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String noti_url;
  
  public AlaLiveNotify(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.noti_content;
      if (str1 == null) {
        this.noti_content = "";
      } else {
        this.noti_content = str1;
      } 
      str = paramBuilder.noti_url;
      if (str == null) {
        this.noti_url = "";
      } else {
        this.noti_url = str;
      } 
    } else {
      this.noti_content = ((Builder)str).noti_content;
      this.noti_url = ((Builder)str).noti_url;
    } 
  }
}

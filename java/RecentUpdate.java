import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.RecentUpdate;

public final class RecentUpdate extends Message {
  public static final String DEFAULT_LOG = "";
  
  public static final String DEFAULT_UPDATE_TIME = "";
  
  public static final String DEFAULT_VERSION = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String log;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String update_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String version;
  
  public RecentUpdate(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.version;
      if (str1 == null) {
        this.version = "";
      } else {
        this.version = str1;
      } 
      str1 = paramBuilder.log;
      if (str1 == null) {
        this.log = "";
      } else {
        this.log = str1;
      } 
      str = paramBuilder.update_time;
      if (str == null) {
        this.update_time = "";
      } else {
        this.update_time = str;
      } 
    } else {
      this.version = ((Builder)str).version;
      this.log = ((Builder)str).log;
      this.update_time = ((Builder)str).update_time;
    } 
  }
}

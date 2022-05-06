import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SkinInfo;

public final class SkinInfo extends Message {
  public static final String DEFAULT_MONITOR_ID = "";
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final String DEFAULT_SKIN = "";
  
  public static final String DEFAULT_SKIN_SIZE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String monitor_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String skin;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String skin_size;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public SkinInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.skin;
      if (str1 == null) {
        this.skin = "";
      } else {
        this.skin = str1;
      } 
      str1 = paramBuilder.skin_size;
      if (str1 == null) {
        this.skin_size = "";
      } else {
        this.skin_size = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.obj_id;
      if (str1 == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str1;
      } 
      str = paramBuilder.monitor_id;
      if (str == null) {
        this.monitor_id = "";
      } else {
        this.monitor_id = str;
      } 
    } else {
      this.skin = ((Builder)str).skin;
      this.skin_size = ((Builder)str).skin_size;
      this.url = ((Builder)str).url;
      this.obj_id = ((Builder)str).obj_id;
      this.monitor_id = ((Builder)str).monitor_id;
    } 
  }
}

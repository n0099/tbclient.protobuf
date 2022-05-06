import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NativeApp;

public final class NativeApp extends Message {
  public static final String DEFAULT_DOWNLOAD_AND = "";
  
  public static final String DEFAULT_DOWNLOAD_IOS = "";
  
  public static final String DEFAULT_JUMP_AND = "";
  
  public static final String DEFAULT_JUMP_IOS = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String download_and;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String download_ios;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String jump_and;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_ios;
  
  public NativeApp(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.jump_and;
      if (str1 == null) {
        this.jump_and = "";
      } else {
        this.jump_and = str1;
      } 
      str1 = paramBuilder.jump_ios;
      if (str1 == null) {
        this.jump_ios = "";
      } else {
        this.jump_ios = str1;
      } 
      str1 = paramBuilder.download_and;
      if (str1 == null) {
        this.download_and = "";
      } else {
        this.download_and = str1;
      } 
      str = paramBuilder.download_ios;
      if (str == null) {
        this.download_ios = "";
      } else {
        this.download_ios = str;
      } 
    } else {
      this.jump_and = ((Builder)str).jump_and;
      this.jump_ios = ((Builder)str).jump_ios;
      this.download_and = ((Builder)str).download_and;
      this.download_ios = ((Builder)str).download_ios;
    } 
  }
}

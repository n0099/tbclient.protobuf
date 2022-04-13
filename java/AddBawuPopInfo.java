import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AddBawuPopInfo;

public final class AddBawuPopInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public AddBawuPopInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.content;
      if (str1 == null) {
        this.content = "";
      } else {
        this.content = str1;
      } 
      str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
      this.img_url = ((Builder)str).img_url;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
}

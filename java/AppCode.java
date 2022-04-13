import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppCode;

public final class AppCode extends Message {
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_GAME_ICON = "";
  
  public static final String DEFAULT_POST_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String post_url;
  
  public AppCode(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.game_icon;
      if (str1 == null) {
        this.game_icon = "";
      } else {
        this.game_icon = str1;
      } 
      str1 = paramBuilder.post_url;
      if (str1 == null) {
        this.post_url = "";
      } else {
        this.post_url = str1;
      } 
      str = paramBuilder.button_text;
      if (str == null) {
        this.button_text = "";
      } else {
        this.button_text = str;
      } 
    } else {
      this.game_icon = ((Builder)str).game_icon;
      this.post_url = ((Builder)str).post_url;
      this.button_text = ((Builder)str).button_text;
    } 
  }
}

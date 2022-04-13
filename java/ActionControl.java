import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ActionControl;

public final class ActionControl extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_TEXT_COLOR = "";
  
  public static final String DEFAULT_TEXT_COLOR_PRESSED = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String text_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text_color_pressed;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public ActionControl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.text_color;
      if (str1 == null) {
        this.text_color = "";
      } else {
        this.text_color = str1;
      } 
      str = paramBuilder.text_color_pressed;
      if (str == null) {
        this.text_color_pressed = "";
      } else {
        this.text_color_pressed = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.name = ((Builder)str).name;
      this.text_color = ((Builder)str).text_color;
      this.text_color_pressed = ((Builder)str).text_color_pressed;
    } 
  }
}

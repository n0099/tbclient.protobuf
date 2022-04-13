import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeRecommand;

public final class ThemeRecommand extends Message {
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_BUTTON_URL = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_TIP_TEXT = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tip_text;
  
  public ThemeRecommand(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.tip_text;
      if (str1 == null) {
        this.tip_text = "";
      } else {
        this.tip_text = str1;
      } 
      str1 = paramBuilder.button_url;
      if (str1 == null) {
        this.button_url = "";
      } else {
        this.button_url = str1;
      } 
      str = paramBuilder.button_text;
      if (str == null) {
        this.button_text = "";
      } else {
        this.button_text = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.tip_text = ((Builder)str).tip_text;
      this.button_url = ((Builder)str).button_url;
      this.button_text = ((Builder)str).button_text;
    } 
  }
}

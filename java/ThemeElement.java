import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeElement;

public final class ThemeElement extends Message {
  public static final String DEFAULT_COMMON_COLOR = "";
  
  public static final String DEFAULT_DARK_COLOR = "";
  
  public static final String DEFAULT_FONT_COLOR = "";
  
  public static final String DEFAULT_LIGHT_COLOR = "";
  
  public static final String DEFAULT_PATTERN_IMAGE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String common_color;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String dark_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String font_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String light_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pattern_image;
  
  public ThemeElement(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.common_color;
      if (str1 == null) {
        this.common_color = "";
      } else {
        this.common_color = str1;
      } 
      str1 = paramBuilder.dark_color;
      if (str1 == null) {
        this.dark_color = "";
      } else {
        this.dark_color = str1;
      } 
      str1 = paramBuilder.light_color;
      if (str1 == null) {
        this.light_color = "";
      } else {
        this.light_color = str1;
      } 
      str1 = paramBuilder.pattern_image;
      if (str1 == null) {
        this.pattern_image = "";
      } else {
        this.pattern_image = str1;
      } 
      str = paramBuilder.font_color;
      if (str == null) {
        this.font_color = "";
      } else {
        this.font_color = str;
      } 
    } else {
      this.common_color = ((Builder)str).common_color;
      this.dark_color = ((Builder)str).dark_color;
      this.light_color = ((Builder)str).light_color;
      this.pattern_image = ((Builder)str).pattern_image;
      this.font_color = ((Builder)str).font_color;
    } 
  }
}

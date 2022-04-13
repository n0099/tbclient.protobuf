import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ConsumeInfo;

public final class ConsumeInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public ConsumeInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
    } 
  }
}

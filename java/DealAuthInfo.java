import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.DealAuthInfo;

public final class DealAuthInfo extends Message {
  public static final String DEFAULT_ITEM_CONTENT = "";
  
  public static final String DEFAULT_ITEM_NAME = "";
  
  public static final String DEFAULT_ITEM_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String item_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String item_url;
  
  public DealAuthInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.item_name;
      if (str1 == null) {
        this.item_name = "";
      } else {
        this.item_name = str1;
      } 
      str1 = paramBuilder.item_content;
      if (str1 == null) {
        this.item_content = "";
      } else {
        this.item_content = str1;
      } 
      str = paramBuilder.item_url;
      if (str == null) {
        this.item_url = "";
      } else {
        this.item_url = str;
      } 
    } else {
      this.item_name = ((Builder)str).item_name;
      this.item_content = ((Builder)str).item_content;
      this.item_url = ((Builder)str).item_url;
    } 
  }
}

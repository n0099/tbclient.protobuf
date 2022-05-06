import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PicTextItem;

public final class PicTextItem extends Message {
  public static final String DEFAULT_ITEM_PIC = "";
  
  public static final String DEFAULT_ITEM_TEXT = "";
  
  public static final String DEFAULT_ITEM_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String item_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String item_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_url;
  
  public PicTextItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.item_pic;
      if (str1 == null) {
        this.item_pic = "";
      } else {
        this.item_pic = str1;
      } 
      str1 = paramBuilder.item_url;
      if (str1 == null) {
        this.item_url = "";
      } else {
        this.item_url = str1;
      } 
      str = paramBuilder.item_text;
      if (str == null) {
        this.item_text = "";
      } else {
        this.item_text = str;
      } 
    } else {
      this.item_pic = ((Builder)str).item_pic;
      this.item_url = ((Builder)str).item_url;
      this.item_text = ((Builder)str).item_text;
    } 
  }
}

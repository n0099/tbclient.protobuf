import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ItemThemeColor;
import tbclient.ItemThemeColorElement;

public final class ItemThemeColor extends Message {
  @ProtoField(tag = 1)
  public final ItemThemeColorElement day;
  
  public ItemThemeColor(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.day = paramBuilder.day;
    } else {
      this.day = paramBuilder.day;
    } 
  }
}

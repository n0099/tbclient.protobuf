package PbPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PbPage.FloatingIconItem;

public final class FloatingIcon extends Message {
  @ProtoField(tag = 1)
  public final FloatingIconItem pbpage;
  
  public FloatingIcon(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.pbpage = paramBuilder.pbpage;
    } else {
      this.pbpage = paramBuilder.pbpage;
    } 
  }
}

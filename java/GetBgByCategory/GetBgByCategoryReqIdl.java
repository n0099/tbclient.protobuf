package GetBgByCategory;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetBgByCategory.DataReq;

public final class GetBgByCategoryReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetBgByCategoryReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
}

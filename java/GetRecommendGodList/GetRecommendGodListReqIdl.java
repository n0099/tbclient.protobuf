package GetRecommendGodList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetRecommendGodList.DataReq;

public final class GetRecommendGodListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetRecommendGodListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
}

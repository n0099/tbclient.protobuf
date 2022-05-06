package GetSuggestionByAddrName;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetSuggestionByAddrName.DataReq;

public final class GetSuggestionByAddrNameReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetSuggestionByAddrNameReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
}

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AlaLiveInfo;
import tbclient.AlaUserlike;
import tbclient.User;

public final class AlaUserlike extends Message {
  @ProtoField(tag = 2)
  public final AlaLiveInfo ala_live_info;
  
  @ProtoField(tag = 1)
  public final User user;
  
  public AlaUserlike(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.ala_live_info = paramBuilder.ala_live_info;
    } else {
      this.user = paramBuilder.user;
      this.ala_live_info = paramBuilder.ala_live_info;
    } 
  }
}

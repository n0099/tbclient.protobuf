import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AlaLiveInfo;
import tbclient.SugLiveInfo;

public final class SugLiveInfo extends Message {
  public static final String DEFAULT_WORD = "";
  
  @ProtoField(tag = 2)
  public final AlaLiveInfo ala_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String word;
  
  public SugLiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.word;
      if (str == null) {
        this.word = "";
      } else {
        this.word = str;
      } 
      this.ala_info = paramBuilder.ala_info;
    } else {
      this.word = paramBuilder.word;
      this.ala_info = paramBuilder.ala_info;
    } 
  }
}

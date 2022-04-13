import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ItemGameInfo;
import tbclient.RecentUpdate;
import tbclient.ThreadInfo;

public final class ItemGameInfo extends Message {
  public static final List<ThreadInfo> DEFAULT_HOT_VIDEOS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> hot_videos;
  
  @ProtoField(tag = 2)
  public final RecentUpdate recent_update;
  
  public ItemGameInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.hot_videos;
      if (list == null) {
        this.hot_videos = DEFAULT_HOT_VIDEOS;
      } else {
        this.hot_videos = Message.immutableCopyOf(list);
      } 
      this.recent_update = paramBuilder.recent_update;
    } else {
      this.hot_videos = Message.immutableCopyOf(paramBuilder.hot_videos);
      this.recent_update = paramBuilder.recent_update;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1488700930, "Ltbclient/ItemGameInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1488700930, "Ltbclient/ItemGameInfo;");
          return;
        } 
      } 
    } 
  }
}

package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ItemGameInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<ThreadInfo> DEFAULT_HOT_VIDEOS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> hot_videos;
  
  @ProtoField(tag = 2)
  public final RecentUpdate recent_update;
  
  public ItemGameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ThreadInfo> list = paramBuilder.hot_videos;
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
  
  public ItemGameInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<ItemGameInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ThreadInfo> hot_videos;
    
    public RecentUpdate recent_update;
    
    public Builder() {}
    
    public Builder(ItemGameInfo param1ItemGameInfo) {
      super(param1ItemGameInfo);
      if (param1ItemGameInfo == null)
        return; 
      this.hot_videos = Message.copyOf(param1ItemGameInfo.hot_videos);
      this.recent_update = param1ItemGameInfo.recent_update;
    }
    
    public ItemGameInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ItemGameInfo)interceptResult.objValue; 
      } 
      return new ItemGameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

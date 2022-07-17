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

public final class BannerUserStory extends Message {
  public static Interceptable $ic;
  
  public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_LIST;
  
  public static final Integer DEFAULT_SWITCH;
  
  public static final List<UserStory> DEFAULT_USER_STORY = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer _switch;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<AlaLiveInfo> ala_live_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<UserStory> user_story;
  
  static {
    DEFAULT_SWITCH = Integer.valueOf(0);
    DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
  }
  
  public BannerUserStory(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<AlaLiveInfo> list;
    if (paramBoolean == true) {
      List<UserStory> list1 = paramBuilder.user_story;
      if (list1 == null) {
        this.user_story = DEFAULT_USER_STORY;
      } else {
        this.user_story = Message.immutableCopyOf(list1);
      } 
      Integer integer = paramBuilder._switch;
      if (integer == null) {
        this._switch = DEFAULT_SWITCH;
      } else {
        this._switch = integer;
      } 
      list = paramBuilder.ala_live_list;
      if (list == null) {
        this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
      } else {
        this.ala_live_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.user_story = Message.immutableCopyOf(((Builder)list).user_story);
      this._switch = ((Builder)list)._switch;
      this.ala_live_list = Message.immutableCopyOf(((Builder)list).ala_live_list);
    } 
  }
  
  public BannerUserStory(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(346821319, "Ltbclient/BannerUserStory;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(346821319, "Ltbclient/BannerUserStory;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BannerUserStory> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer _switch;
    
    public List<AlaLiveInfo> ala_live_list;
    
    public List<UserStory> user_story;
    
    public Builder() {}
    
    public Builder(BannerUserStory param1BannerUserStory) {
      super(param1BannerUserStory);
      if (param1BannerUserStory == null)
        return; 
      this.user_story = Message.copyOf(param1BannerUserStory.user_story);
      this._switch = param1BannerUserStory._switch;
      this.ala_live_list = Message.copyOf(param1BannerUserStory.ala_live_list);
    }
    
    public BannerUserStory build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BannerUserStory)interceptResult.objValue; 
      } 
      return new BannerUserStory(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

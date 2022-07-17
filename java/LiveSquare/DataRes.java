package tbclient.LiveSquare;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Banner;
import tbclient.Entry;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<Banner> DEFAULT_BANNER = Collections.emptyList();
  
  public static final List<Entry> DEFAULT_ENTRY;
  
  public static final List<FunctionListInfo> DEFAULT_FUNCTION_LIST_INFO;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_INTERVAL;
  
  public static final Integer DEFAULT_IS_SMALL_FOLLOW;
  
  public static final List<ThreadInfo> DEFAULT_LIVE = Collections.emptyList();
  
  public static final List<HotLiveWithCategory> DEFAULT_LIVE_WITH_CATEGORY;
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Banner> banner;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Entry> entry;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<FunctionListInfo> function_list_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 7)
  public final HeadLiveInfo head_live_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer interval;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer is_small_follow;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> live;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<HotLiveWithCategory> live_with_category;
  
  static {
    DEFAULT_ENTRY = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
    DEFAULT_INTERVAL = integer;
    DEFAULT_LIVE_WITH_CATEGORY = Collections.emptyList();
    DEFAULT_FUNCTION_LIST_INFO = Collections.emptyList();
    DEFAULT_IS_SMALL_FOLLOW = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<Banner> list4 = paramBuilder.banner;
      if (list4 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list4);
      } 
      List<ThreadInfo> list3 = paramBuilder.live;
      if (list3 == null) {
        this.live = DEFAULT_LIVE;
      } else {
        this.live = Message.immutableCopyOf(list3);
      } 
      List<Entry> list2 = paramBuilder.entry;
      if (list2 == null) {
        this.entry = DEFAULT_ENTRY;
      } else {
        this.entry = Message.immutableCopyOf(list2);
      } 
      Integer integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      integer1 = paramBuilder.interval;
      if (integer1 == null) {
        this.interval = DEFAULT_INTERVAL;
      } else {
        this.interval = integer1;
      } 
      List<HotLiveWithCategory> list1 = paramBuilder.live_with_category;
      if (list1 == null) {
        this.live_with_category = DEFAULT_LIVE_WITH_CATEGORY;
      } else {
        this.live_with_category = Message.immutableCopyOf(list1);
      } 
      this.head_live_info = paramBuilder.head_live_info;
      List<FunctionListInfo> list = paramBuilder.function_list_info;
      if (list == null) {
        this.function_list_info = DEFAULT_FUNCTION_LIST_INFO;
      } else {
        this.function_list_info = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.is_small_follow;
      if (integer == null) {
        this.is_small_follow = DEFAULT_IS_SMALL_FOLLOW;
      } else {
        this.is_small_follow = integer;
      } 
    } else {
      this.banner = Message.immutableCopyOf(((Builder)integer).banner);
      this.live = Message.immutableCopyOf(((Builder)integer).live);
      this.entry = Message.immutableCopyOf(((Builder)integer).entry);
      this.has_more = ((Builder)integer).has_more;
      this.interval = ((Builder)integer).interval;
      this.live_with_category = Message.immutableCopyOf(((Builder)integer).live_with_category);
      this.head_live_info = ((Builder)integer).head_live_info;
      this.function_list_info = Message.immutableCopyOf(((Builder)integer).function_list_info);
      this.is_small_follow = ((Builder)integer).is_small_follow;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1827709825, "Ltbclient/LiveSquare/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1827709825, "Ltbclient/LiveSquare/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<Banner> banner;
    
    public List<Entry> entry;
    
    public List<FunctionListInfo> function_list_info;
    
    public Integer has_more;
    
    public HeadLiveInfo head_live_info;
    
    public Integer interval;
    
    public Integer is_small_follow;
    
    public List<ThreadInfo> live;
    
    public List<HotLiveWithCategory> live_with_category;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.banner = Message.copyOf(param1DataRes.banner);
      this.live = Message.copyOf(param1DataRes.live);
      this.entry = Message.copyOf(param1DataRes.entry);
      this.has_more = param1DataRes.has_more;
      this.interval = param1DataRes.interval;
      this.live_with_category = Message.copyOf(param1DataRes.live_with_category);
      this.head_live_info = param1DataRes.head_live_info;
      this.function_list_info = Message.copyOf(param1DataRes.function_list_info);
      this.is_small_follow = param1DataRes.is_small_follow;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

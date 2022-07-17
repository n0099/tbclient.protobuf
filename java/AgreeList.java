package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AgreeList extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_DEL;
  
  public static final Integer DEFAULT_SNAPSHOOT_PIC_ID;
  
  public static final Integer DEFAULT_TIME;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_VIRTUAL_IMAGE_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 8)
  public final User agreeer;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_del;
  
  @ProtoField(tag = 9)
  public final Post post_info;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer snapshoot_pic_id;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String virtual_image_url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1453213819, "Ltbclient/AgreeList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1453213819, "Ltbclient/AgreeList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TIME = integer;
    DEFAULT_IS_DEL = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_ID = Long.valueOf(0L);
    DEFAULT_SNAPSHOOT_PIC_ID = integer;
  }
  
  public AgreeList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      Integer integer1 = paramBuilder.time;
      if (integer1 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer1;
      } 
      integer1 = paramBuilder.is_del;
      if (integer1 == null) {
        this.is_del = DEFAULT_IS_DEL;
      } else {
        this.is_del = integer1;
      } 
      integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      this.agreeer = paramBuilder.agreeer;
      this.post_info = paramBuilder.post_info;
      String str = paramBuilder.virtual_image_url;
      if (str == null) {
        this.virtual_image_url = "";
      } else {
        this.virtual_image_url = str;
      } 
      integer = paramBuilder.snapshoot_pic_id;
      if (integer == null) {
        this.snapshoot_pic_id = DEFAULT_SNAPSHOOT_PIC_ID;
      } else {
        this.snapshoot_pic_id = integer;
      } 
    } else {
      this.thread_info = ((Builder)integer).thread_info;
      this.time = ((Builder)integer).time;
      this.is_del = ((Builder)integer).is_del;
      this.type = ((Builder)integer).type;
      this.id = ((Builder)integer).id;
      this.agreeer = ((Builder)integer).agreeer;
      this.post_info = ((Builder)integer).post_info;
      this.virtual_image_url = ((Builder)integer).virtual_image_url;
      this.snapshoot_pic_id = ((Builder)integer).snapshoot_pic_id;
    } 
  }
  
  public AgreeList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AgreeList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public User agreeer;
    
    public Long id;
    
    public Integer is_del;
    
    public Post post_info;
    
    public Integer snapshoot_pic_id;
    
    public ThreadInfo thread_info;
    
    public Integer time;
    
    public Integer type;
    
    public String virtual_image_url;
    
    public Builder() {}
    
    public Builder(AgreeList param1AgreeList) {
      super(param1AgreeList);
      if (param1AgreeList == null)
        return; 
      this.thread_info = param1AgreeList.thread_info;
      this.time = param1AgreeList.time;
      this.is_del = param1AgreeList.is_del;
      this.type = param1AgreeList.type;
      this.id = param1AgreeList.id;
      this.agreeer = param1AgreeList.agreeer;
      this.post_info = param1AgreeList.post_info;
      this.virtual_image_url = param1AgreeList.virtual_image_url;
      this.snapshoot_pic_id = param1AgreeList.snapshoot_pic_id;
    }
    
    public AgreeList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AgreeList)interceptResult.objValue; 
      } 
      return new AgreeList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

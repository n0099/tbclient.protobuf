package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Banner extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DESC = "";
  
  public static final Long DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final Long DEFAULT_START_TIME;
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long end_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long start_time;
  
  @ProtoField(tag = 4)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
  }
  
  public Banner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
      this.thread_info = paramBuilder.thread_info;
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      Long long_1 = paramBuilder.start_time;
      if (long_1 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_1;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
    } else {
      this.name = ((Builder)long_).name;
      this.desc = ((Builder)long_).desc;
      this.pic = ((Builder)long_).pic;
      this.thread_info = ((Builder)long_).thread_info;
      this.url = ((Builder)long_).url;
      this.id = ((Builder)long_).id;
      this.start_time = ((Builder)long_).start_time;
      this.end_time = ((Builder)long_).end_time;
    } 
  }
  
  public Banner(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-189574555, "Ltbclient/Banner;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-189574555, "Ltbclient/Banner;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Banner> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String desc;
    
    public Long end_time;
    
    public Integer id;
    
    public String name;
    
    public String pic;
    
    public Long start_time;
    
    public ThreadInfo thread_info;
    
    public String url;
    
    public Builder() {}
    
    public Builder(Banner param1Banner) {
      super(param1Banner);
      if (param1Banner == null)
        return; 
      this.name = param1Banner.name;
      this.desc = param1Banner.desc;
      this.pic = param1Banner.pic;
      this.thread_info = param1Banner.thread_info;
      this.url = param1Banner.url;
      this.id = param1Banner.id;
      this.start_time = param1Banner.start_time;
      this.end_time = param1Banner.end_time;
    }
    
    public Banner build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Banner)interceptResult.objValue; 
      } 
      return new Banner(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

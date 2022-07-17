package tbclient.Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FloatInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_ACTIVITY_ID;
  
  public static final List<String> DEFAULT_DYNAMIC_URL;
  
  public static final Long DEFAULT_END_TIME;
  
  public static final String DEFAULT_FLOAT_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_SHOW_TYPE;
  
  public static final Long DEFAULT_START_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long activity_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> dynamic_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String float_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer show_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long start_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1911567386, "Ltbclient/Personalized/FloatInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1911567386, "Ltbclient/Personalized/FloatInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
    DEFAULT_DYNAMIC_URL = Collections.emptyList();
    DEFAULT_ACTIVITY_ID = long_;
    DEFAULT_SHOW_TYPE = Integer.valueOf(0);
  }
  
  public FloatInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.float_url;
      if (str2 == null) {
        this.float_url = "";
      } else {
        this.float_url = str2;
      } 
      Long long_2 = paramBuilder.start_time;
      if (long_2 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_2;
      } 
      long_2 = paramBuilder.end_time;
      if (long_2 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_2;
      } 
      List<String> list = paramBuilder.dynamic_url;
      if (list == null) {
        this.dynamic_url = DEFAULT_DYNAMIC_URL;
      } else {
        this.dynamic_url = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.activity_id;
      if (long_1 == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = long_1;
      } 
      String str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      integer = paramBuilder.show_type;
      if (integer == null) {
        this.show_type = DEFAULT_SHOW_TYPE;
      } else {
        this.show_type = integer;
      } 
    } else {
      this.float_url = ((Builder)integer).float_url;
      this.start_time = ((Builder)integer).start_time;
      this.end_time = ((Builder)integer).end_time;
      this.dynamic_url = Message.immutableCopyOf(((Builder)integer).dynamic_url);
      this.activity_id = ((Builder)integer).activity_id;
      this.jump_url = ((Builder)integer).jump_url;
      this.show_type = ((Builder)integer).show_type;
    } 
  }
  
  public FloatInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FloatInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long activity_id;
    
    public List<String> dynamic_url;
    
    public Long end_time;
    
    public String float_url;
    
    public String jump_url;
    
    public Integer show_type;
    
    public Long start_time;
    
    public Builder() {}
    
    public Builder(FloatInfo param1FloatInfo) {
      super(param1FloatInfo);
      if (param1FloatInfo == null)
        return; 
      this.float_url = param1FloatInfo.float_url;
      this.start_time = param1FloatInfo.start_time;
      this.end_time = param1FloatInfo.end_time;
      this.dynamic_url = Message.copyOf(param1FloatInfo.dynamic_url);
      this.activity_id = param1FloatInfo.activity_id;
      this.jump_url = param1FloatInfo.jump_url;
      this.show_type = param1FloatInfo.show_type;
    }
    
    public FloatInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FloatInfo)interceptResult.objValue; 
      } 
      return new FloatInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

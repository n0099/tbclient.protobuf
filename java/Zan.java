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

public final class Zan extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CONSENT_TYPE;
  
  public static final Integer DEFAULT_IS_LIKED;
  
  public static final Integer DEFAULT_LAST_TIME;
  
  public static final List<Long> DEFAULT_LIKER_ID;
  
  public static final List<User> DEFAULT_LIKER_LIST;
  
  public static final Integer DEFAULT_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer consent_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_liked;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer last_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.INT64)
  public final List<Long> liker_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<User> liker_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(103645918, "Ltbclient/Zan;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(103645918, "Ltbclient/Zan;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_NUM = integer;
    DEFAULT_LIKER_LIST = Collections.emptyList();
    DEFAULT_IS_LIKED = integer;
    DEFAULT_LAST_TIME = integer;
    DEFAULT_LIKER_ID = Collections.emptyList();
    DEFAULT_CONSENT_TYPE = integer;
  }
  
  public Zan(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.num;
      if (integer2 == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer2;
      } 
      List<User> list1 = paramBuilder.liker_list;
      if (list1 == null) {
        this.liker_list = DEFAULT_LIKER_LIST;
      } else {
        this.liker_list = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.is_liked;
      if (integer1 == null) {
        this.is_liked = DEFAULT_IS_LIKED;
      } else {
        this.is_liked = integer1;
      } 
      integer1 = paramBuilder.last_time;
      if (integer1 == null) {
        this.last_time = DEFAULT_LAST_TIME;
      } else {
        this.last_time = integer1;
      } 
      List<Long> list = paramBuilder.liker_id;
      if (list == null) {
        this.liker_id = DEFAULT_LIKER_ID;
      } else {
        this.liker_id = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.consent_type;
      if (integer == null) {
        this.consent_type = DEFAULT_CONSENT_TYPE;
      } else {
        this.consent_type = integer;
      } 
    } else {
      this.num = ((Builder)integer).num;
      this.liker_list = Message.immutableCopyOf(((Builder)integer).liker_list);
      this.is_liked = ((Builder)integer).is_liked;
      this.last_time = ((Builder)integer).last_time;
      this.liker_id = Message.immutableCopyOf(((Builder)integer).liker_id);
      this.consent_type = ((Builder)integer).consent_type;
    } 
  }
  
  public Zan(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Zan> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer consent_type;
    
    public Integer is_liked;
    
    public Integer last_time;
    
    public List<Long> liker_id;
    
    public List<User> liker_list;
    
    public Integer num;
    
    public Builder() {}
    
    public Builder(Zan param1Zan) {
      super(param1Zan);
      if (param1Zan == null)
        return; 
      this.num = param1Zan.num;
      this.liker_list = Message.copyOf(param1Zan.liker_list);
      this.is_liked = param1Zan.is_liked;
      this.last_time = param1Zan.last_time;
      this.liker_id = Message.copyOf(param1Zan.liker_id);
      this.consent_type = param1Zan.consent_type;
    }
    
    public Zan build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Zan)interceptResult.objValue; 
      } 
      return new Zan(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

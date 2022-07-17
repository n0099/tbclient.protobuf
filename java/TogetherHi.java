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

public final class TogetherHi extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_ALBUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_ALBUM_NAME = "";
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final String DEFAULT_LOCATION = "";
  
  public static final Integer DEFAULT_NUM_JOIN;
  
  public static final Integer DEFAULT_NUM_SIGNUP;
  
  public static final List<String> DEFAULT_PIC_URLS;
  
  public static final List<String> DEFAULT_POTRAITS;
  
  public static final Integer DEFAULT_START_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long album_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String album_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer end_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String location;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer num_join;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer num_signup;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9, type = Message.Datatype.STRING)
  public final List<String> pic_urls;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
  public final List<String> potraits;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer start_time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_START_TIME = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_NUM_SIGNUP = integer;
    DEFAULT_POTRAITS = Collections.emptyList();
    DEFAULT_NUM_JOIN = integer;
    DEFAULT_PIC_URLS = Collections.emptyList();
  }
  
  public TogetherHi(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str2 = paramBuilder.album_name;
      if (str2 == null) {
        this.album_name = "";
      } else {
        this.album_name = str2;
      } 
      Long long_ = paramBuilder.album_id;
      if (long_ == null) {
        this.album_id = DEFAULT_ALBUM_ID;
      } else {
        this.album_id = long_;
      } 
      Integer integer3 = paramBuilder.start_time;
      if (integer3 == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = integer3;
      } 
      integer3 = paramBuilder.end_time;
      if (integer3 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer3;
      } 
      String str1 = paramBuilder.location;
      if (str1 == null) {
        this.location = "";
      } else {
        this.location = str1;
      } 
      Integer integer2 = paramBuilder.num_signup;
      if (integer2 == null) {
        this.num_signup = DEFAULT_NUM_SIGNUP;
      } else {
        this.num_signup = integer2;
      } 
      List<String> list1 = paramBuilder.potraits;
      if (list1 == null) {
        this.potraits = DEFAULT_POTRAITS;
      } else {
        this.potraits = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.num_join;
      if (integer1 == null) {
        this.num_join = DEFAULT_NUM_JOIN;
      } else {
        this.num_join = integer1;
      } 
      list = paramBuilder.pic_urls;
      if (list == null) {
        this.pic_urls = DEFAULT_PIC_URLS;
      } else {
        this.pic_urls = Message.immutableCopyOf(list);
      } 
    } else {
      this.album_name = ((Builder)list).album_name;
      this.album_id = ((Builder)list).album_id;
      this.start_time = ((Builder)list).start_time;
      this.end_time = ((Builder)list).end_time;
      this.location = ((Builder)list).location;
      this.num_signup = ((Builder)list).num_signup;
      this.potraits = Message.immutableCopyOf(((Builder)list).potraits);
      this.num_join = ((Builder)list).num_join;
      this.pic_urls = Message.immutableCopyOf(((Builder)list).pic_urls);
    } 
  }
  
  public TogetherHi(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(378177430, "Ltbclient/TogetherHi;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(378177430, "Ltbclient/TogetherHi;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TogetherHi> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long album_id;
    
    public String album_name;
    
    public Integer end_time;
    
    public String location;
    
    public Integer num_join;
    
    public Integer num_signup;
    
    public List<String> pic_urls;
    
    public List<String> potraits;
    
    public Integer start_time;
    
    public Builder() {}
    
    public Builder(TogetherHi param1TogetherHi) {
      super(param1TogetherHi);
      if (param1TogetherHi == null)
        return; 
      this.album_name = param1TogetherHi.album_name;
      this.album_id = param1TogetherHi.album_id;
      this.start_time = param1TogetherHi.start_time;
      this.end_time = param1TogetherHi.end_time;
      this.location = param1TogetherHi.location;
      this.num_signup = param1TogetherHi.num_signup;
      this.potraits = Message.copyOf(param1TogetherHi.potraits);
      this.num_join = param1TogetherHi.num_join;
      this.pic_urls = Message.copyOf(param1TogetherHi.pic_urls);
    }
    
    public TogetherHi build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TogetherHi)interceptResult.objValue; 
      } 
      return new TogetherHi(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

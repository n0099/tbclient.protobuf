package tbclient.GetSugTopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_FID = Long.valueOf(0L);
  
  public static final String DEFAULT_FIRST_DIR = "";
  
  public static final Integer DEFAULT_IS_VIDEO_TOPIC = Integer.valueOf(0);
  
  public static final String DEFAULT_PREFIX = "";
  
  public static final String DEFAULT_SECOND_DIR = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String first_dir;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer is_video_topic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String prefix;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String second_dir;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str2 = paramBuilder.prefix;
      if (str2 == null) {
        this.prefix = "";
      } else {
        this.prefix = str2;
      } 
      Long long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
      String str1 = paramBuilder.first_dir;
      if (str1 == null) {
        this.first_dir = "";
      } else {
        this.first_dir = str1;
      } 
      str1 = paramBuilder.second_dir;
      if (str1 == null) {
        this.second_dir = "";
      } else {
        this.second_dir = str1;
      } 
      integer = paramBuilder.is_video_topic;
      if (integer == null) {
        this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
      } else {
        this.is_video_topic = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.prefix = ((Builder)integer).prefix;
      this.fid = ((Builder)integer).fid;
      this.first_dir = ((Builder)integer).first_dir;
      this.second_dir = ((Builder)integer).second_dir;
      this.is_video_topic = ((Builder)integer).is_video_topic;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-927470592, "Ltbclient/GetSugTopic/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-927470592, "Ltbclient/GetSugTopic/DataReq;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Long fid;
    
    public String first_dir;
    
    public Integer is_video_topic;
    
    public String prefix;
    
    public String second_dir;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.prefix = param1DataReq.prefix;
      this.fid = param1DataReq.fid;
      this.first_dir = param1DataReq.first_dir;
      this.second_dir = param1DataReq.second_dir;
      this.is_video_topic = param1DataReq.is_video_topic;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

package tbclient.GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UniversityInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_AGREE_NUM;
  
  public static final Long DEFAULT_BROWSE_NUM;
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TO_URL = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final Long DEFAULT_VIDEO_TIME;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long agree_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long browse_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String to_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long video_time;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_AGREE_NUM = long_;
    DEFAULT_BROWSE_NUM = long_;
    DEFAULT_VIDEO_TIME = long_;
  }
  
  public UniversityInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      str = paramBuilder.to_url;
      if (str == null) {
        this.to_url = "";
      } else {
        this.to_url = str;
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      Long long_1 = paramBuilder.agree_num;
      if (long_1 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = long_1;
      } 
      long_1 = paramBuilder.browse_num;
      if (long_1 == null) {
        this.browse_num = DEFAULT_BROWSE_NUM;
      } else {
        this.browse_num = long_1;
      } 
      long_ = paramBuilder.video_time;
      if (long_ == null) {
        this.video_time = DEFAULT_VIDEO_TIME;
      } else {
        this.video_time = long_;
      } 
    } else {
      this.title = ((Builder)long_).title;
      this.pic_url = ((Builder)long_).pic_url;
      this.to_url = ((Builder)long_).to_url;
      this.type = ((Builder)long_).type;
      this.agree_num = ((Builder)long_).agree_num;
      this.browse_num = ((Builder)long_).browse_num;
      this.video_time = ((Builder)long_).video_time;
    } 
  }
  
  public UniversityInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-335783370, "Ltbclient/GetForumDetail/UniversityInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-335783370, "Ltbclient/GetForumDetail/UniversityInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UniversityInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long agree_num;
    
    public Long browse_num;
    
    public String pic_url;
    
    public String title;
    
    public String to_url;
    
    public Integer type;
    
    public Long video_time;
    
    public Builder() {}
    
    public Builder(UniversityInfo param1UniversityInfo) {
      super(param1UniversityInfo);
      if (param1UniversityInfo == null)
        return; 
      this.title = param1UniversityInfo.title;
      this.pic_url = param1UniversityInfo.pic_url;
      this.to_url = param1UniversityInfo.to_url;
      this.type = param1UniversityInfo.type;
      this.agree_num = param1UniversityInfo.agree_num;
      this.browse_num = param1UniversityInfo.browse_num;
      this.video_time = param1UniversityInfo.video_time;
    }
    
    public UniversityInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UniversityInfo)interceptResult.objValue; 
      } 
      return new UniversityInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

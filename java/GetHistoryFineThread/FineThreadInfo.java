package tbclient.GetHistoryFineThread;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Media;

public final class FineThreadInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_COMMENT = "";
  
  public static final Long DEFAULT_FTID = Long.valueOf(0L);
  
  public static final List<Media> DEFAULT_MEDIA;
  
  public static final Integer DEFAULT_PUBLISH_TIME;
  
  public static final String DEFAULT_TAG = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String comment;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long ftid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<Media> media;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer publish_time;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String tag;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_MEDIA = Collections.emptyList();
    DEFAULT_PUBLISH_TIME = integer;
  }
  
  public FineThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.ftid;
      if (long_ == null) {
        this.ftid = DEFAULT_FTID;
      } else {
        this.ftid = long_;
      } 
      String str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      Integer integer2 = paramBuilder.type;
      if (integer2 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer2;
      } 
      String str2 = paramBuilder._abstract;
      if (str2 == null) {
        this._abstract = "";
      } else {
        this._abstract = str2;
      } 
      List<Media> list = paramBuilder.media;
      if (list == null) {
        this.media = DEFAULT_MEDIA;
      } else {
        this.media = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.publish_time;
      if (integer1 == null) {
        this.publish_time = DEFAULT_PUBLISH_TIME;
      } else {
        this.publish_time = integer1;
      } 
      String str1 = paramBuilder.tag;
      if (str1 == null) {
        this.tag = "";
      } else {
        this.tag = str1;
      } 
      str = paramBuilder.comment;
      if (str == null) {
        this.comment = "";
      } else {
        this.comment = str;
      } 
    } else {
      this.ftid = ((Builder)str).ftid;
      this.title = ((Builder)str).title;
      this.type = ((Builder)str).type;
      this._abstract = ((Builder)str)._abstract;
      this.media = Message.immutableCopyOf(((Builder)str).media);
      this.publish_time = ((Builder)str).publish_time;
      this.tag = ((Builder)str).tag;
      this.comment = ((Builder)str).comment;
    } 
  }
  
  public FineThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(647551590, "Ltbclient/GetHistoryFineThread/FineThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(647551590, "Ltbclient/GetHistoryFineThread/FineThreadInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<FineThreadInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String _abstract;
    
    public String comment;
    
    public Long ftid;
    
    public List<Media> media;
    
    public Integer publish_time;
    
    public String tag;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FineThreadInfo param1FineThreadInfo) {
      super(param1FineThreadInfo);
      if (param1FineThreadInfo == null)
        return; 
      this.ftid = param1FineThreadInfo.ftid;
      this.title = param1FineThreadInfo.title;
      this.type = param1FineThreadInfo.type;
      this._abstract = param1FineThreadInfo._abstract;
      this.media = Message.copyOf(param1FineThreadInfo.media);
      this.publish_time = param1FineThreadInfo.publish_time;
      this.tag = param1FineThreadInfo.tag;
      this.comment = param1FineThreadInfo.comment;
    }
    
    public FineThreadInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FineThreadInfo)interceptResult.objValue; 
      } 
      return new FineThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

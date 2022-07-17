package tbclient.VideoTemplate;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.VideoTemplateContent;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final String DEFAULT_BACK_URL = "";
  
  public static final Integer DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final List<VideoTemplateContent> DEFAULT_VIDEO_TEMPLATE_CONTENT = Collections.emptyList();
  
  public static final String DEFAULT_VIDEO_TEMPLATE_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String back_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer topic_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<VideoTemplateContent> video_template_content;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String video_template_url;
  
  static {
    DEFAULT_TOPIC_ID = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<VideoTemplateContent> list = paramBuilder.video_template_content;
      if (list == null) {
        this.video_template_content = DEFAULT_VIDEO_TEMPLATE_CONTENT;
      } else {
        this.video_template_content = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.topic_id;
      if (integer == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = integer;
      } 
      String str1 = paramBuilder.topic_name;
      if (str1 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str1;
      } 
      str1 = paramBuilder.back_url;
      if (str1 == null) {
        this.back_url = "";
      } else {
        this.back_url = str1;
      } 
      str1 = paramBuilder.video_template_url;
      if (str1 == null) {
        this.video_template_url = "";
      } else {
        this.video_template_url = str1;
      } 
      str = paramBuilder.activity_url;
      if (str == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str;
      } 
    } else {
      this.video_template_content = Message.immutableCopyOf(((Builder)str).video_template_content);
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.back_url = ((Builder)str).back_url;
      this.video_template_url = ((Builder)str).video_template_url;
      this.activity_url = ((Builder)str).activity_url;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1591786153, "Ltbclient/VideoTemplate/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1591786153, "Ltbclient/VideoTemplate/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String activity_url;
    
    public String back_url;
    
    public Integer topic_id;
    
    public String topic_name;
    
    public List<VideoTemplateContent> video_template_content;
    
    public String video_template_url;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.video_template_content = Message.copyOf(param1DataRes.video_template_content);
      this.topic_id = param1DataRes.topic_id;
      this.topic_name = param1DataRes.topic_name;
      this.back_url = param1DataRes.back_url;
      this.video_template_url = param1DataRes.video_template_url;
      this.activity_url = param1DataRes.activity_url;
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

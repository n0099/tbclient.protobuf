package tbclient.NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopicDetail extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BG_IMAGE = "";
  
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final String DEFAULT_SHARE_PIC = "";
  
  public static final String DEFAULT_SHARE_TITLE = "";
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_IMAGE = "";
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String bg_image;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String share_pic;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String share_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String topic_desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String topic_image;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1984260334, "Ltbclient/NewHottopic/TopicDetail;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1984260334, "Ltbclient/NewHottopic/TopicDetail;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
  }
  
  public TopicDetail(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.topic_id;
      if (long_2 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_2;
      } 
      String str2 = paramBuilder.topic_name;
      if (str2 == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str2;
      } 
      str2 = paramBuilder.topic_desc;
      if (str2 == null) {
        this.topic_desc = "";
      } else {
        this.topic_desc = str2;
      } 
      Long long_1 = paramBuilder.discuss_num;
      if (long_1 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_1;
      } 
      String str1 = paramBuilder.topic_image;
      if (str1 == null) {
        this.topic_image = "";
      } else {
        this.topic_image = str1;
      } 
      str1 = paramBuilder.share_title;
      if (str1 == null) {
        this.share_title = "";
      } else {
        this.share_title = str1;
      } 
      str1 = paramBuilder.share_pic;
      if (str1 == null) {
        this.share_pic = "";
      } else {
        this.share_pic = str1;
      } 
      str = paramBuilder.bg_image;
      if (str == null) {
        this.bg_image = "";
      } else {
        this.bg_image = str;
      } 
    } else {
      this.topic_id = ((Builder)str).topic_id;
      this.topic_name = ((Builder)str).topic_name;
      this.topic_desc = ((Builder)str).topic_desc;
      this.discuss_num = ((Builder)str).discuss_num;
      this.topic_image = ((Builder)str).topic_image;
      this.share_title = ((Builder)str).share_title;
      this.share_pic = ((Builder)str).share_pic;
      this.bg_image = ((Builder)str).bg_image;
    } 
  }
  
  public TopicDetail(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicDetail> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String bg_image;
    
    public Long discuss_num;
    
    public String share_pic;
    
    public String share_title;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_image;
    
    public String topic_name;
    
    public Builder() {}
    
    public Builder(TopicDetail param1TopicDetail) {
      super(param1TopicDetail);
      if (param1TopicDetail == null)
        return; 
      this.topic_id = param1TopicDetail.topic_id;
      this.topic_name = param1TopicDetail.topic_name;
      this.topic_desc = param1TopicDetail.topic_desc;
      this.discuss_num = param1TopicDetail.discuss_num;
      this.topic_image = param1TopicDetail.topic_image;
      this.share_title = param1TopicDetail.share_title;
      this.share_pic = param1TopicDetail.share_pic;
      this.bg_image = param1TopicDetail.bg_image;
    }
    
    public TopicDetail build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TopicDetail)interceptResult.objValue; 
      } 
      return new TopicDetail(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

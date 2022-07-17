package tbclient.NewTopicList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Post;

public final class NewTopicList extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final String DEFAULT_TOPIC_DESC = "";
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_IMAGE = "";
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 7)
  public final PkModule pk_module;
  
  @ProtoField(tag = 6)
  public final Post top_agree_post;
  
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
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1746600042, "Ltbclient/NewTopicList/NewTopicList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1746600042, "Ltbclient/NewTopicList/NewTopicList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_DISCUSS_NUM = long_;
  }
  
  public NewTopicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
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
      this.top_agree_post = paramBuilder.top_agree_post;
      this.pk_module = paramBuilder.pk_module;
    } else {
      this.topic_id = paramBuilder.topic_id;
      this.topic_name = paramBuilder.topic_name;
      this.topic_desc = paramBuilder.topic_desc;
      this.discuss_num = paramBuilder.discuss_num;
      this.topic_image = paramBuilder.topic_image;
      this.top_agree_post = paramBuilder.top_agree_post;
      this.pk_module = paramBuilder.pk_module;
    } 
  }
  
  public NewTopicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewTopicList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long discuss_num;
    
    public PkModule pk_module;
    
    public Post top_agree_post;
    
    public String topic_desc;
    
    public Long topic_id;
    
    public String topic_image;
    
    public String topic_name;
    
    public Builder() {}
    
    public Builder(NewTopicList param1NewTopicList) {
      super(param1NewTopicList);
      if (param1NewTopicList == null)
        return; 
      this.topic_id = param1NewTopicList.topic_id;
      this.topic_name = param1NewTopicList.topic_name;
      this.topic_desc = param1NewTopicList.topic_desc;
      this.discuss_num = param1NewTopicList.discuss_num;
      this.topic_image = param1NewTopicList.topic_image;
      this.top_agree_post = param1NewTopicList.top_agree_post;
      this.pk_module = param1NewTopicList.pk_module;
    }
    
    public NewTopicList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NewTopicList)interceptResult.objValue; 
      } 
      return new NewTopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

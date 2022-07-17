package tbclient.GetSugTopic;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final TopicListModule bang_topic;
  
  @ProtoField(tag = 3)
  public final TopicListModule sug_topic;
  
  @ProtoField(tag = 1)
  public final TopicListModule user_his_topic;
  
  @ProtoField(tag = 5)
  public final TopicListModule video_topic;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user_his_topic = paramBuilder.user_his_topic;
      this.bang_topic = paramBuilder.bang_topic;
      this.sug_topic = paramBuilder.sug_topic;
      this.video_topic = paramBuilder.video_topic;
    } else {
      this.user_his_topic = paramBuilder.user_his_topic;
      this.bang_topic = paramBuilder.bang_topic;
      this.sug_topic = paramBuilder.sug_topic;
      this.video_topic = paramBuilder.video_topic;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public TopicListModule bang_topic;
    
    public TopicListModule sug_topic;
    
    public TopicListModule user_his_topic;
    
    public TopicListModule video_topic;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user_his_topic = param1DataRes.user_his_topic;
      this.bang_topic = param1DataRes.bang_topic;
      this.sug_topic = param1DataRes.sug_topic;
      this.video_topic = param1DataRes.video_topic;
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

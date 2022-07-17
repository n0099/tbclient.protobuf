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

public final class CardTopic extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final Integer DEFAULT_POSITION;
  
  public static final List<TopicInfo> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<TopicInfo> topic_list;
  
  static {
    DEFAULT_POSITION = Integer.valueOf(0);
  }
  
  public CardTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      List<TopicInfo> list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.position;
      if (integer == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = integer;
      } 
    } else {
      this.card_title = ((Builder)integer).card_title;
      this.topic_list = Message.immutableCopyOf(((Builder)integer).topic_list);
      this.position = ((Builder)integer).position;
    } 
  }
  
  public CardTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-199866447, "Ltbclient/Personalized/CardTopic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-199866447, "Ltbclient/Personalized/CardTopic;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<CardTopic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String card_title;
    
    public Integer position;
    
    public List<TopicInfo> topic_list;
    
    public Builder() {}
    
    public Builder(CardTopic param1CardTopic) {
      super(param1CardTopic);
      if (param1CardTopic == null)
        return; 
      this.card_title = param1CardTopic.card_title;
      this.topic_list = Message.copyOf(param1CardTopic.topic_list);
      this.position = param1CardTopic.position;
    }
    
    public CardTopic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CardTopic)interceptResult.objValue; 
      } 
      return new CardTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

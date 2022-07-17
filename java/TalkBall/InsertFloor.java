package tbclient.TalkBall;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class InsertFloor extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_TOPIC_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final List<VideoCard> DEFAULT_WANDER_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<VideoCard> wander_list;
  
  public InsertFloor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<VideoCard> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.topic_id;
      if (integer == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = integer;
      } 
      String str = paramBuilder.topic_name;
      if (str == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str;
      } 
      list = paramBuilder.wander_list;
      if (list == null) {
        this.wander_list = DEFAULT_WANDER_LIST;
      } else {
        this.wander_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.topic_id = ((Builder)list).topic_id;
      this.topic_name = ((Builder)list).topic_name;
      this.wander_list = Message.immutableCopyOf(((Builder)list).wander_list);
    } 
  }
  
  public InsertFloor(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1502988802, "Ltbclient/TalkBall/InsertFloor;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1502988802, "Ltbclient/TalkBall/InsertFloor;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<InsertFloor> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer topic_id;
    
    public String topic_name;
    
    public List<VideoCard> wander_list;
    
    public Builder() {}
    
    public Builder(InsertFloor param1InsertFloor) {
      super(param1InsertFloor);
      if (param1InsertFloor == null)
        return; 
      this.topic_id = param1InsertFloor.topic_id;
      this.topic_name = param1InsertFloor.topic_name;
      this.wander_list = Message.copyOf(param1InsertFloor.wander_list);
    }
    
    public InsertFloor build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (InsertFloor)interceptResult.objValue; 
      } 
      return new InsertFloor(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}

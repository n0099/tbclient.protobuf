import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeatureCardTopic;
import tbclient.FeatureCardTopicSubNode;

public final class FeatureCardTopic extends Message {
  public static final Integer DEFAULT_FLOOR;
  
  public static final List<FeatureCardTopicSubNode> DEFAULT_SUB_NODES;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeatureCardTopicSubNode> sub_nodes;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1764091912, "Ltbclient/FeatureCardTopic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1764091912, "Ltbclient/FeatureCardTopic;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_FLOOR = integer;
    DEFAULT_SUB_NODES = Collections.emptyList();
  }
  
  public FeatureCardTopic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.sub_nodes;
      if (list == null) {
        this.sub_nodes = DEFAULT_SUB_NODES;
      } else {
        this.sub_nodes = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.floor = ((Builder)list).floor;
      this.title = ((Builder)list).title;
      this.sub_nodes = Message.immutableCopyOf(((Builder)list).sub_nodes);
    } 
  }
}

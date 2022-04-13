package GetForumData;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetForumData.ForumDataValue;

public final class ForumDataGroup extends Message {
  public static final Double DEFAULT_TOTAL = Double.valueOf(0.0D);
  
  public static final List<ForumDataValue> DEFAULT_VALUES = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
  public final Double total;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ForumDataValue> values;
  
  public ForumDataGroup(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Double double_ = paramBuilder.total;
      if (double_ == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = double_;
      } 
      list = paramBuilder.values;
      if (list == null) {
        this.values = DEFAULT_VALUES;
      } else {
        this.values = Message.immutableCopyOf(list);
      } 
    } else {
      this.total = ((Builder)list).total;
      this.values = Message.immutableCopyOf(((Builder)list).values);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1850624855, "Ltbclient/GetForumData/ForumDataGroup;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1850624855, "Ltbclient/GetForumData/ForumDataGroup;");
          return;
        } 
      } 
    } 
  }
}

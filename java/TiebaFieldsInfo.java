import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.TiebaFieldsInfo;
import tbclient.User;

public final class TiebaFieldsInfo extends Message {
  public static final List<String> DEFAULT_TIEBA_FIELDS = Collections.emptyList();
  
  public static final String DEFAULT_TIEBA_NAME = "";
  
  public static final List<User> DEFAULT_USER_RANK = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> tieba_fields;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tieba_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> user_rank;
  
  public TiebaFieldsInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.tieba_fields;
      if (list1 == null) {
        this.tieba_fields = DEFAULT_TIEBA_FIELDS;
      } else {
        this.tieba_fields = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.tieba_name;
      if (str == null) {
        this.tieba_name = "";
      } else {
        this.tieba_name = str;
      } 
      list = paramBuilder.user_rank;
      if (list == null) {
        this.user_rank = DEFAULT_USER_RANK;
      } else {
        this.user_rank = Message.immutableCopyOf(list);
      } 
    } else {
      this.tieba_fields = Message.immutableCopyOf(((Builder)list).tieba_fields);
      this.tieba_name = ((Builder)list).tieba_name;
      this.user_rank = Message.immutableCopyOf(((Builder)list).user_rank);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(193956527, "Ltbclient/TiebaFieldsInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(193956527, "Ltbclient/TiebaFieldsInfo;");
          return;
        } 
      } 
    } 
  }
}

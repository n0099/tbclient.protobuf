import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BawuRoleDes;
import tbclient.BawuTeam;

public final class BawuTeam extends Message {
  public static final List<BawuRoleDes> DEFAULT_BAWU_TEAM_LIST;
  
  public static final Integer DEFAULT_TOTAL_NUM = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<BawuRoleDes> bawu_team_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer total_num;
  
  static {
    DEFAULT_BAWU_TEAM_LIST = Collections.emptyList();
  }
  
  public BawuTeam(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.total_num;
      if (integer == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = integer;
      } 
      list = paramBuilder.bawu_team_list;
      if (list == null) {
        this.bawu_team_list = DEFAULT_BAWU_TEAM_LIST;
      } else {
        this.bawu_team_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.total_num = ((Builder)list).total_num;
      this.bawu_team_list = Message.immutableCopyOf(((Builder)list).bawu_team_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2084401783, "Ltbclient/BawuTeam;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2084401783, "Ltbclient/BawuTeam;");
          return;
        } 
      } 
    } 
  }
}

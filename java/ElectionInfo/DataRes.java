package ElectionInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ElectionInfo.Basic;
import tbclient.ElectionList;
import tbclient.ManagerElection;
import tbclient.Myrecord;

public final class DataRes extends Message {
  public static final List<ElectionList> DEFAULT_ELECTION_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_HAS_MORE = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final Basic basic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ElectionList> election_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(tag = 2)
  public final Myrecord my_record;
  
  @ProtoField(tag = 5)
  public final ManagerElection vote_limit;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.basic = paramBuilder.basic;
      this.my_record = paramBuilder.my_record;
      List list = paramBuilder.election_list;
      if (list == null) {
        this.election_list = DEFAULT_ELECTION_LIST;
      } else {
        this.election_list = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
      this.vote_limit = paramBuilder.vote_limit;
    } else {
      this.basic = paramBuilder.basic;
      this.my_record = paramBuilder.my_record;
      this.election_list = Message.immutableCopyOf(paramBuilder.election_list);
      this.has_more = paramBuilder.has_more;
      this.vote_limit = paramBuilder.vote_limit;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1192171389, "Ltbclient/ElectionInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1192171389, "Ltbclient/ElectionInfo/DataRes;");
          return;
        } 
      } 
    } 
  }
}

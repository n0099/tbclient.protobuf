package SearchPostForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SearchPostForum.SearchForum;

public final class DataRes extends Message {
  public static final List<SearchForum> DEFAULT_FUZZY_MATCH = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final SearchForum exact_match;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SearchForum> fuzzy_match;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.exact_match = paramBuilder.exact_match;
      list = paramBuilder.fuzzy_match;
      if (list == null) {
        this.fuzzy_match = DEFAULT_FUZZY_MATCH;
      } else {
        this.fuzzy_match = Message.immutableCopyOf(list);
      } 
    } else {
      this.exact_match = ((Builder)list).exact_match;
      this.fuzzy_match = Message.immutableCopyOf(((Builder)list).fuzzy_match);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-785279195, "Ltbclient/SearchPostForum/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-785279195, "Ltbclient/SearchPostForum/DataRes;");
          return;
        } 
      } 
    } 
  }
}

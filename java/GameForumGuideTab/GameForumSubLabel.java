package GameForumGuideTab;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class GameForumSubLabel extends Message {
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final List<tbclient.GameForumGuideTab.GameForumSubLabel> DEFAULT_SUB_LABEL_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SUB_TAB_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<tbclient.GameForumGuideTab.GameForumSubLabel> sub_label_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_tab_name;
  
  public GameForumSubLabel(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      String str = paramBuilder.sub_tab_name;
      if (str == null) {
        this.sub_tab_name = "";
      } else {
        this.sub_tab_name = str;
      } 
      list = paramBuilder.sub_label_list;
      if (list == null) {
        this.sub_label_list = DEFAULT_SUB_LABEL_LIST;
      } else {
        this.sub_label_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.id = ((Builder)list).id;
      this.sub_tab_name = ((Builder)list).sub_tab_name;
      this.sub_label_list = Message.immutableCopyOf(((Builder)list).sub_label_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(587244457, "Ltbclient/GameForumGuideTab/GameForumSubLabel;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(587244457, "Ltbclient/GameForumGuideTab/GameForumSubLabel;");
          return;
        } 
      } 
    } 
  }
}

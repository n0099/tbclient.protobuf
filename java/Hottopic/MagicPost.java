package Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Hottopic.MagicPostList;

public final class MagicPost extends Message {
  public static final String DEFAULT_MAGIC_TITLE = "";
  
  public static final List<MagicPostList> DEFAULT_MC_POST_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String magic_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<MagicPostList> mc_post_list;
  
  public MagicPost(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.magic_title;
      if (str == null) {
        this.magic_title = "";
      } else {
        this.magic_title = str;
      } 
      list = paramBuilder.mc_post_list;
      if (list == null) {
        this.mc_post_list = DEFAULT_MC_POST_LIST;
      } else {
        this.mc_post_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.magic_title = ((Builder)list).magic_title;
      this.mc_post_list = Message.immutableCopyOf(((Builder)list).mc_post_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(251803665, "Ltbclient/Hottopic/MagicPost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(251803665, "Ltbclient/Hottopic/MagicPost;");
          return;
        } 
      } 
    } 
  }
}

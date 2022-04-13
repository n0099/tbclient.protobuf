package Recommforum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecommendForumInfo;

public final class RecommForum extends Message {
  public static final List<RecommendForumInfo> DEFAULT_FORUMS = Collections.emptyList();
  
  public static final Integer DEFAULT_PAGE_SIZE = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecommendForumInfo> forums;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer page_size;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public RecommForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      List list = paramBuilder.forums;
      if (list == null) {
        this.forums = DEFAULT_FORUMS;
      } else {
        this.forums = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.page_size;
      if (integer == null) {
        this.page_size = DEFAULT_PAGE_SIZE;
      } else {
        this.page_size = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.forums = Message.immutableCopyOf(((Builder)integer).forums);
      this.page_size = ((Builder)integer).page_size;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(64982800, "Ltbclient/Recommforum/RecommForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(64982800, "Ltbclient/Recommforum/RecommForum;");
          return;
        } 
      } 
    } 
  }
}

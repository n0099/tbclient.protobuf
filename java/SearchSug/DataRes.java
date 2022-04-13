package SearchSug;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumInfo;
import tbclient.Item;
import tbclient.RecommendForumInfo;
import tbclient.SugLiveInfo;
import tbclient.SugRankingInfo;

public final class DataRes extends Message {
  public static final List<ForumInfo> DEFAULT_FORUM_LIST;
  
  public static final Integer DEFAULT_FORUM_LOC = Integer.valueOf(0);
  
  public static final List<String> DEFAULT_LIST = Collections.emptyList();
  
  public static final List<SugLiveInfo> DEFAULT_LIVE_CARD;
  
  @ProtoField(tag = 4)
  public final RecommendForumInfo forum_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ForumInfo> forum_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer forum_loc;
  
  @ProtoField(tag = 5)
  public final Item item_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<SugLiveInfo> live_card;
  
  @ProtoField(tag = 7)
  public final SugRankingInfo ranking_card;
  
  static {
    DEFAULT_FORUM_LIST = Collections.emptyList();
    DEFAULT_LIVE_CARD = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.forum_loc;
      if (integer == null) {
        this.forum_loc = DEFAULT_FORUM_LOC;
      } else {
        this.forum_loc = integer;
      } 
      List list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      this.forum_card = paramBuilder.forum_card;
      this.item_card = paramBuilder.item_card;
      list = paramBuilder.live_card;
      if (list == null) {
        this.live_card = DEFAULT_LIVE_CARD;
      } else {
        this.live_card = Message.immutableCopyOf(list);
      } 
      this.ranking_card = paramBuilder.ranking_card;
    } else {
      this.forum_loc = paramBuilder.forum_loc;
      this.list = Message.immutableCopyOf(paramBuilder.list);
      this.forum_list = Message.immutableCopyOf(paramBuilder.forum_list);
      this.forum_card = paramBuilder.forum_card;
      this.item_card = paramBuilder.item_card;
      this.live_card = Message.immutableCopyOf(paramBuilder.live_card);
      this.ranking_card = paramBuilder.ranking_card;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(29691713, "Ltbclient/SearchSug/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(29691713, "Ltbclient/SearchSug/DataRes;");
          return;
        } 
      } 
    } 
  }
}

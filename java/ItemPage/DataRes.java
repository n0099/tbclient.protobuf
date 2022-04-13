package ItemPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlbumElement;
import tbclient.ItemGameCode;
import tbclient.ItemGameInfo;
import tbclient.ItemInfo;
import tbclient.RecommendForumInfo;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<AlbumElement> DEFAULT_ALBUM_LIST;
  
  public static final Integer DEFAULT_DISCUSSION_ID;
  
  public static final List<ThreadInfo> DEFAULT_DISCUSSION_LIST;
  
  public static final Integer DEFAULT_HAS_TORNADO;
  
  public static final String DEFAULT_LINK = "";
  
  public static final List<RecommendForumInfo> DEFAULT_RECOMMEND_FORUM;
  
  public static final List<ItemInfo> DEFAULT_RECOMMEND_ITEM;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<AlbumElement> album_list;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer discussion_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ThreadInfo> discussion_list;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer has_tornado;
  
  @ProtoField(tag = 10)
  public final ItemGameCode item_game_code;
  
  @ProtoField(tag = 9)
  public final ItemGameInfo item_game_info;
  
  @ProtoField(tag = 1)
  public final ItemInfo item_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<RecommendForumInfo> recommend_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ItemInfo> recommend_item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  static {
    DEFAULT_RECOMMEND_ITEM = Collections.emptyList();
    DEFAULT_RECOMMEND_FORUM = Collections.emptyList();
    DEFAULT_ALBUM_LIST = Collections.emptyList();
    DEFAULT_DISCUSSION_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_DISCUSSION_ID = integer;
    DEFAULT_HAS_TORNADO = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.item_info = paramBuilder.item_info;
      List list2 = paramBuilder.thread_list;
      if (list2 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.recommend_item;
      if (list2 == null) {
        this.recommend_item = DEFAULT_RECOMMEND_ITEM;
      } else {
        this.recommend_item = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.recommend_forum;
      if (list2 == null) {
        this.recommend_forum = DEFAULT_RECOMMEND_FORUM;
      } else {
        this.recommend_forum = Message.immutableCopyOf(list2);
      } 
      String str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
      List list1 = paramBuilder.album_list;
      if (list1 == null) {
        this.album_list = DEFAULT_ALBUM_LIST;
      } else {
        this.album_list = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.discussion_list;
      if (list1 == null) {
        this.discussion_list = DEFAULT_DISCUSSION_LIST;
      } else {
        this.discussion_list = Message.immutableCopyOf(list1);
      } 
      Integer integer1 = paramBuilder.discussion_id;
      if (integer1 == null) {
        this.discussion_id = DEFAULT_DISCUSSION_ID;
      } else {
        this.discussion_id = integer1;
      } 
      this.item_game_info = paramBuilder.item_game_info;
      this.item_game_code = paramBuilder.item_game_code;
      integer = paramBuilder.has_tornado;
      if (integer == null) {
        this.has_tornado = DEFAULT_HAS_TORNADO;
      } else {
        this.has_tornado = integer;
      } 
    } else {
      this.item_info = ((Builder)integer).item_info;
      this.thread_list = Message.immutableCopyOf(((Builder)integer).thread_list);
      this.recommend_item = Message.immutableCopyOf(((Builder)integer).recommend_item);
      this.recommend_forum = Message.immutableCopyOf(((Builder)integer).recommend_forum);
      this.link = ((Builder)integer).link;
      this.album_list = Message.immutableCopyOf(((Builder)integer).album_list);
      this.discussion_list = Message.immutableCopyOf(((Builder)integer).discussion_list);
      this.discussion_id = ((Builder)integer).discussion_id;
      this.item_game_info = ((Builder)integer).item_game_info;
      this.item_game_code = ((Builder)integer).item_game_code;
      this.has_tornado = ((Builder)integer).has_tornado;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1679610376, "Ltbclient/ItemPage/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1679610376, "Ltbclient/ItemPage/DataRes;");
          return;
        } 
      } 
    } 
  }
}
